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
    
    <title>学生成绩管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

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
  
  <body style="background: #f6f5fa;">
  <!--content S-->
	<div class="super-content">
		<div class="superCtab">
			<div class="ctab-title clearfix"><h3>学生成绩管理</h3><a href="javascript:;" class="sp-column"><i class="ico-export"></i>导出列表</a></div>
			
			<div class="ctab-Main">
				
				<div class="ctab-Mian-cont">
					<div class="Mian-cont-btn Mian-cont-btn2 clearfix">
						<div class="operateBtn">
							<div class="wd-msg">学生成绩</div>
						</div>
						<div class="searchBar">
							<input type="text" id="" value="" class="form-control srhTxt" placeholder="输入子站关键字搜索">
							<input type="button" class="srhBtn" value="">
						</div>
					</div>
					
					<div class="Mian-cont-wrap">
						<div class="defaultTab-T">
							<table border="0" cellspacing="0" cellpadding="0" class="defaultTable">
								<tbody><tr><th class="t_1">学号</th><th class="t_2">学生姓名</th><th class="t_3">总评成绩</th><th class="t_4">操作</th></tr>
							</tbody></table>
						</div>
						<table class="defaultTable defaultTable2">
							<tbody>
							<c:forEach items="${gradelist }" var="g">
							<tr>
								<td class="t_1"><c:out value="${g.sno }"></c:out></td>
								<td class="t_2"><c:out value="${g.sname }"></c:out></td>
								<td class="t_3"><c:out value="${g.grade }"></c:out>
								<form action="grade/findbyName.action" method="post">
								<input type="hidden" name="gname" value="${g.sname }">
								<input type="submit" value="详细"/>
								</form>
								</td>
								<td class="t_4"><div class="btn"><a class="Top" href="pages/gradeGive.jsp">打分</a><a href="pages/operateGrade.jsp" class="modify">修改</a></div></td>
							</tr>
							</c:forEach>
						</tbody></table>
						<!--pages S-->
						<div class="pageSelect">
							<span>共 <b>4</b> 条 每页 <b>4 </b>条   1/1</span>
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
  
  </body>
</html>
