<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>任务管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="css/base.css">
	<link rel="stylesheet" href="css/page.css">
	<!--[if lte IE 8]>
	<link href="css/ie8.css" rel="stylesheet" type="text/css"/>
	<![endif]-->
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<script type="text/javascript" src="js/modernizr.js"></script>
	<!--[if IE]>
	<script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
	<![endif]-->

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<script type="text/javascript" src="js/modernizr.js"></script>
	<!--[if IE]>
	<script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
	<![endif]-->

  </head>
  
  <body>
  <!--content S-->
	<div class="super-content">
		<div class="superCtab">
			<div class="ctab-title clearfix"><h3>任务管理</h3><a href="javascript:;" class="sp-column"><i class="ico-mng"></i>栏目管理</a></div>
			
			<div class="ctab-Main">
				<div class="ctab-Main-title">
					<ul class="clearfix">
						<li class="cur"><a href="huodong_guanli.html">任务分配</a></li>
						<li><a href="huodong_ChaoGuan.html">任务信息</a></li>
					</ul>
				</div>
				
				<div class="ctab-Mian-cont">
					<div class="Mian-cont-btn clearfix">
						<div class="operateBtn">
							<a href="pages/renwu_fenpei.jsp" class="greenbtn publish">新建任务</a>
						</div>
						<div class="searchBar">
							<input type="text" id="" value="" class="form-control srhTxt" placeholder="输入标题关键字搜索">
							<input type="button" class="srhBtn" value="">
						</div>
					</div>
					<div class="super-label clearfix">
						<a href="#">个人任务<em style="display: none;"></em></a><a href="#">团队任务<em style="display: none;"></em></a>
					</div>
					
					<div class="Mian-cont-wrap">
						<div class="defaultTab-T">
							<table border="0" cellspacing="0" cellpadding="0" class="defaultTable">
								<tbody><tr><th class="t_1">任务标题</th><th class="t_2_1">执行人</th><th class="t_3">起始时间</th><th class="t_5">截止时间</th><th class="t_4">完成状态</th></tr>
							</tbody></table>
						</div>
						<table class="defaultTable defaultTable2">
							<tbody>
							<c:forEach items="${renwulist}" var="r">
							<tr>
								<td class="t_1"><c:out value="${r.title}"/></td>
								<td class="t_2_1"><c:out value="${r.taker }"></c:out></td>
								<td class="t_3"><c:out value="${r.begindate }"></c:out></td>
								<td class="t_5"><c:out value="${r.enddate }"></c:out></td>
								<td class="t_4"><div class="btn"><c:out value="${r.jinqu }"></c:out></div></td>
							</tr>
							</c:forEach>
						</tbody></table>
						<!--pages S-->
						<div class="pageSelect">
							<span>共 <b>1</b> 条 每页 <b>1 </b>条   1/1</span>
							<div class="pageWrap">
								<a class="pagePre"><i class="ico-pre">&nbsp;</i></a>
								<a href="#" class="pagenumb cur">1</a>
								<a href="#" class="pagenumb">2</a>
								<a href="#" class="pagenumb">3</a>
								<a href="#" class="pagenext"><i class="ico-next">&nbsp;</i></a>
							</div>
						</div>
						<!--pages E-->
					</div>
				</div>
			</div>
		</div>
		<!--main-->
		
	</div>
	<!--content E-->
	<!--点击修改弹出层-->
	<div class="layuiBg" style="display: none; height: 757px;"></div><!--公共遮罩-->
	<!--点击添加分类弹出-->
	<div class="addFeileibox layuiBox">
		<div class="layer-title clearfix"><h2>添加分类</h2><span class="layerClose"></span></div>
		<div class="layer-content">
			<div class="aFllink clearfix" style="margin-top: 38px;"><span>二级栏目：</span><input type="text" value=""></div>
			<div class="aFlBtn"><input type="button" value="保存" class="saveBtn"></div>
		</div>
	</div>
	<!--栏目管理-->
	<div class="Columnbox hdColumnbox layuiBox" style="left: 476.5px; top: 261.5px; display: none;">
		<div class="layer-title clearfix"><h2>栏目管理</h2><span class="layerClose"></span></div>
		<div class="layer-content">
			<ul class="colu-title clearfix">
				<li class="li-1">栏目名称</li><li class="li-2">英文名称</li><li class="li-5">栏目类型</li><li class="li-3">操作</li><li class="li-4">同步开关</li>
			</ul>
			<div class="colu-list">
				<ul class="colu-cont clearfix active">
					<li class="li-1"><i class="ico"></i>活动发布</li><li class="li-2">English</li><li class="li-5">列表页</li><li class="li-3"><a href="javascript:;" class="colu-xg">修改</a></li><li class="li-4"><input type="checkbox" id="checkbox_d1" class="chk_4"><label for="checkbox_d1"></label></li>
				</ul>
				<div class="colunext" style="display: block;">
					<ul class="colu-next clearfix">
						<li class="li-1"><i class="ico"></i>公司活动</li><li class="li-2"></li><li class="li-5">列表页</li><li class="li-3"><a href="javascript:;" class="colu-xg">修改</a></li>
					</ul>
					<ul class="colu-next clearfix">
						<li class="li-1"><i class="ico"></i>团队活动</li><li class="li-2"></li><li class="li-5">列表页</li><li class="li-3"><a href="javascript:;" class="colu-xg">修改</a></li>
					</ul>
				</div>
			</div><!--新闻动态-->
			
		</div>
	</div>
	<!--栏目管理－修改-->
	<div class="ColumnXgbox layuiBox">
		<div class="layer-title clearfix"><h2>添加分类</h2><span class="layerClose"></span></div>
		<div class="layer-content">
			<div class="aFllink clearfix"><span>修改名称：</span><input type="text" value=""></div>
			<div class="aFllink clearfix"><span>英文名称：</span><input type="text" value=""></div>
			<div class="aFlBtn"><input type="button" value="保存" class="saveBtn"></div>
		</div>
	</div>
  </body>
</html>
