<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>成绩管理页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/style.css">

  </head>
  
  <body>
  <div class="loginbox">
		<h1 style="color: #ffc107">修改学生成绩</h1>
		<form action="process.php" method="post">
			<p>学生姓名</p>
			<input type="text" name="students'name" placeholder="请输入学生的姓名">
			<p>平时成绩</p>
			<input type="text" name="text" placeholder="请输入学生的平时成绩">
			<p>答辩成绩</p>
			<input type="text" name="text" placeholder="请输入学生的答辩成绩">
			<p>文档成绩</p>
			<input type="text" name="text" placeholder="请输入学生的文档成绩">
			<p>总评成绩</p>
			<input type="text" name="text" placeholder="请输入学生的总评成绩">
			<input type="submit" value="确定">
		</form>
	</div>
  </body>
</html>
