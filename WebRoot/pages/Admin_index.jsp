<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div class="superWrap clearfix" style="height: 781px;">
	<!--side S-->
	<div class="super-side-menu">
	<jsp:include page="Admin_left.jsp"></jsp:include>
	</div>
	<!--side E-->
	<!--content S-->
	<div class="superContent">
		
		<div class="super-header super-header2">
		<jsp:include page="Admin_header.jsp"></jsp:include>
		</div>
		<!--header-->
		<div class="superCtab superCtabBot" style="height: 695px;">
		<jsp:include page="adminwelcome.jsp"></jsp:include>
		</div>
		<!--main-->
		
	</div>
	<!--content E-->
	
</div>

<script>
window.onresize = function(){
	var winH=$(window).height();
	var headH=$('.super-header').height();
	$('.superWrap').height(winH);
	$('.superCtabBot').height(winH-headH);
};
$(window).resize();
</script>
  
  </body>
</html>
