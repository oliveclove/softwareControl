<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>左侧导航栏</title>
    
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
  
  <body>
  <!--side S-->
	<div class="super-side-menu">
		<div class="logo"><a href="public_super_cg.html" target="_parent"><img src="images/logo.png"></a></div>
		
		<div class="side-menu">
			<ul>
				<li class=""><a href="renwu/showall.action" target="Mainindex"><i class="ico-1"></i>任务分配</a></li>
				<li><a href="file/showall.action" target="Mainindex"><i class="ico-9"></i>下载任务书</a></li>
				<li><a href="student/findbyName.action" target="Mainindex"><i class="ico-2"></i>个人信息查询</a></li>
				<li><a href="grade/findbysession.action" target="Mainindex"><i class="ico-6"></i>成绩查询</a></li>
				<li><a href="chat/showall.action" target="Mainindex"><i class="ico-5"></i>讨论区</a></li>
				<li><a href="pages/xitong.jsp" target="Mainindex"><i class="ico-7"></i>系统设置</a></li>
			</ul>
		</div>
	</div>
	<!--side E-->

<script type="text/javascript">
	$(function(){
		$('.side-menu li').click(function(){
			$(this).addClass('on').siblings().removeClass('on');
		})
	})
</script>
  </body>
</html>
