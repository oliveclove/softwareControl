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
    
    <title>小组基本信息</title>
    
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

  </head>
  
  <body>
  <!--content S-->
	<div class="super-content">
		<div class="superCtab">
			<div class="ctab-title zxtop-title clearfix"><h3>小组基本信息</h3><a href="yonghu.action" class="backlistBtn"><i class="ico-back"></i>返回列表</a></div>
		</div>
		<!--main-->
	</div>
	<!--content E-->
	<div class="zx-dtlMain">
	<table>
	<tbody>
	<tr>
	<td>小组编号:</td> <td><c:out value="${group.gid }"/></td>
	</tr>
	<tr>
	<td>小组名称:</td> <td><c:out value="${group.gname }"/></td>
	</tr>
	<tr>
	<td>小组组长:</td> <td><c:out value="${group.gleader }"/></td>
	</tr>
	<tr>
	<td>成员1:</td> <td><c:out value="${group.gmem1 }"/></td>
	</tr>
	<tr>
	<td>成员2:</td> <td><c:out value="${group.gmem2 }"/></td>
	</tr>
	<tr>
	<td>成员3:</td> <td><c:out value="${group.gmem3 }"/></td>
	</tr>
	<tr>
	<td>成员4:</td> <td><c:out value="${group.gmem4 }"/></td>
	</tr>
	</tbody>
	</table>
	</div>
  </body>
</html>
