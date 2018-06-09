package com.softwareControl.Dao;

import java.util.Date;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.softwareControl.Model.Chat;

/**
 * A data access object (DAO) providing persistence and search support for Chat
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.softwareControl.Dao.Chat
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ChatDAO {
	private static final Logger log = LoggerFactory.getLogger(ChatDAO.class);
	// property constants
	public static final String CHOWNER = "chowner";
	public static final String CHCONTENT = "chcontent";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Chat transientInstance) {
		log.debug("saving Chat instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Chat persistentInstance) {
		log.debug("deleting Chat instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Chat findById(java.lang.Integer id) {
		log.debug("getting Chat instance with id: " + id);
		try {
			Chat instance = (Chat) getCurrentSession().get("com.softwareControl.Dao.Chat", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Chat instance) {
		log.debug("finding Chat instance by example");
		try {
			List results = getCurrentSession().createCriteria("com.softwareControl.Dao.Chat")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Chat instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Chat as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByChowner(Object chowner) {
		return findByProperty(CHOWNER, chowner);
	}

	public List findByChcontent(Object chcontent) {
		return findByProperty(CHCONTENT, chcontent);
	}

	public List findAll() {
		log.debug("finding all Chat instances");
		try {
			String queryString = "from Chat";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Chat merge(Chat detachedInstance) {
		log.debug("merging Chat instance");
		try {
			Chat result = (Chat) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Chat instance) {
		log.debug("attaching dirty Chat instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Chat instance) {
		log.debug("attaching clean Chat instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ChatDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ChatDAO) ctx.getBean("ChatDAO");
	}
}