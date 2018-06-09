package com.softwareControl.Dao;

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

import com.softwareControl.Model.Groups;

/**
 * A data access object (DAO) providing persistence and search support for
 * Groups entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.softwareControl.Dao.Groups
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class GroupsDAO {
	private static final Logger log = LoggerFactory.getLogger(GroupsDAO.class);
	// property constants
	public static final String GNAME = "gname";
	public static final String GLEADER = "gleader";
	public static final String GMEM1 = "gmem1";
	public static final String GMEM2 = "gmem2";
	public static final String GMEM3 = "gmem3";
	public static final String GMEM4 = "gmem4";

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

	public void save(Groups transientInstance) {
		log.debug("saving Groups instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Groups persistentInstance) {
		log.debug("deleting Groups instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Groups findById(java.lang.Integer id) {
		log.debug("getting Groups instance with id: " + id);
		try {
			Groups instance = (Groups) getCurrentSession().get("com.softwareControl.Dao.Groups", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Groups instance) {
		log.debug("finding Groups instance by example");
		try {
			List results = getCurrentSession().createCriteria("com.softwareControl.Dao.Groups")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Groups instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Groups as model where model." + propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGname(Object gname) {
		return findByProperty(GNAME, gname);
	}

	public List findByGleader(Object gleader) {
		return findByProperty(GLEADER, gleader);
	}

	public List findByGmem1(Object gmem1) {
		return findByProperty(GMEM1, gmem1);
	}

	public List findByGmem2(Object gmem2) {
		return findByProperty(GMEM2, gmem2);
	}

	public List findByGmem3(Object gmem3) {
		return findByProperty(GMEM3, gmem3);
	}

	public List findByGmem4(Object gmem4) {
		return findByProperty(GMEM4, gmem4);
	}

	@SuppressWarnings("unchecked")
	public List<Groups> findAll() {
		log.debug("finding all Groups instances");
		try {
			String queryString = "from Groups";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Groups merge(Groups detachedInstance) {
		log.debug("merging Groups instance");
		try {
			Groups result = (Groups) getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Groups instance) {
		log.debug("attaching dirty Groups instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Groups instance) {
		log.debug("attaching clean Groups instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GroupsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (GroupsDAO) ctx.getBean("GroupsDAO");
	}
}