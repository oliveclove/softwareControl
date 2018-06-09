<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教师注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/register.css">
	
  </head>
  
  <body>
  <div class="content">
		<h1>用户注册</h1>
		<div class="main">
			<h2>教师注册</h2>
			<form action="teacher/doregister.action" method="post">
				<h5>用户名</h5>
				<input type="text" name="username" value="输入用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '输入用户名';}" />
				<h5>电子邮箱</h5>
				<input type="text" name="email" value="输入电子邮箱" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '输入电子邮箱';}" />
				<h5>电话</h5>
				<input type="text" name="tel" value="输入电话" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '输入电话';}" />
				<h5>密码</h5>
				<input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" />
				<h5>确认密码</h5>
				<input type="password" name="password2" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" />
				<input type="submit" value="注册" />
			</form>
		</div>
		<p class="footer">&copy; 2018  淮阴工学院 软件工程小组</p>
	</div>
  </body>
</html>
