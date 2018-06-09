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
    
    <title>任务书</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/base.css">
	<link rel="stylesheet" href="css/page.css">

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<script type="text/javascript" src="js/modernizr.js"></script>
	
  </head>
  
  <body style="background: #f6f5fa;">
  <!--content S-->
	<div class="super-content RightMain" id="RightMain">
		
		<!--header-->
		<div class="superCtab">
			<div class="ctab-Main">
				<div class="ctab-Main-title">
					<ul class="clearfix">
						<li class="cur">任务书列表</li>
					</ul>
				</div>
				
				<div class="ctab-Mian-cont">
					<div class="Mian-cont-btn clearfix">
						<div class="operateBtn">
						
							<a href="pages/Upload.jsp" class="greenbtn add sp-add">上传任务书</a>
						</div>
						<div class="searchBar">
							<input type="text" id="" value="" class="form-control srhTxt" placeholder="输入标题关键字搜索">
							<input type="button" class="srhBtn" value="">
						</div>
					</div>
					<div class="super-label clearfix">
					</div>
					
					<div class="Mian-cont-wrap">
						<div class="defaultTab-T">
							<table class="defaultTable">
								<tbody><tr><th class="t_1">任务书标题</th><th class="t_2">发布者</th><th class="t_3">发布时间</th><th class="t_4">操作</th></tr>
							</tbody></table>
						</div>
						<table class="defaultTable defaultTable2">
							<tbody>
							<c:forEach items="${filelist }" var="f">
							<tr>
								<td class="t_1"><c:out value="${f.fname }"></c:out></td>
								<td class="t_2"><c:out value="${f.fowner }"></c:out></td>
								<td class="t_3"><c:out value="${f.fdate }"></c:out></td>
								<td class="t_4"><div class="btn">
								<form action="file/download.action" method="post">
								<input type="hidden" name="path" value="${f.furl }">
								<input type="hidden" name="filename" value="${f.fname }">
								<input type="submit" value="下载">
								</form>
								</div></td>
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
	
	<div class="layuiBg"></div><!--公共遮罩-->
	<!--点击修改弹出层-->
	<div class="imgXgbox layuiBox">
		<div class="layer-title clearfix"><h2>修改栏目图片</h2><span class="layerClose"></span></div>
		<div class="layer-content">
			<div class="XgfileImg"><img src="images/bg_img_sc.jpg"><input id="fileImage" class="fileImageSlect" type="file" size="30" name="fileselect[]"></div>
			<p class="onclktip">（点击图片可重新上传）</p>
			<div class="Xgimglink clearfix"><span>图片链接：</span><input type="text" value=""></div>
			<div class="XgBtn"><input type="button" value="保存" class="saveBtn"></div>
		</div>
	</div>
  </body>
</html>
