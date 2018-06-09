<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎使用软件工程过程管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/loginstyle.css">
	
	<script type="application/x-javascript"> 
	addEventListener("load", function() { 
	setTimeout(hideURLbar, 0); }, false); 
	function hideURLbar(){ window.scrollTo(0,1); } 
	</script>
  </head>
  
  <body>
	<h1>软件工程实践管理系统</h1>
		<div class="app-block">
			<div class="cube"><img src="images/cube.png" class="img-responsive" alt="" /></div>
			<form action="teacher/dologin.action" method="post">
				<input type="text" name="userid" class="text" value="账号" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '账号';}" >
				<input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
				<div class="ch">
				教师<input type="radio" checked="checked" name="role" value="1">
				学生<input type="radio" name="role" value="2">
				管理员<input type="radio" name="role" value="3">
				</div>
				<div class="submit"><input type="submit" onclick="myFunction()" value="登录" ></div>
				<p class="sign">没有账号? <a href="view/Register2.action"> 学生注册</a> <a href="view/Register.action">教师注册</a></p>
			</form>
			
		</div>
	<!--start-copyright-->
   		<div class="copy-right">
				<p>Copyright &copy; 2018  淮阴工学院  软件工程小组</p>
		</div>
	<!--//end-copyright-->
</body>
</html>
