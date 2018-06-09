<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>任务分配</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/style.css">

  </head>
  
  <body>
  <div class="loginbox">
		<h1 style="color: #ffc107">分配任务</h1>
		<form action="renwu/add.action" method="post">
		    <p>任务主题</p>
			<input type="text" name="title" placeholder="请输入任务主题">
			<p>执行人</p>
			<input type="text" name="taker" placeholder="请输入学生的姓名">
			<p>起始时间</p>
			<input type="text" name="begin" placeholder="请输入学生的平时成绩">
			<p>截止时间</p>
			<input type="text" name="end" placeholder="请输入学生的答辩成绩">
			<p>完成状态</p>
			<input type="text" name="state" placeholder="请输入学生的文档成绩">
			<input type="submit" value="发布任务">
		</form>
	</div>
  </body>
</html>
