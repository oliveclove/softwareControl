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
    
   <title>讨论区</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="styles.css">
</head>
  
  <body>
  <div class="content">
  <table class="defaultTable defaultTable2">
	<tbody>
	<c:forEach items="${chatlist }" var="c">
	<tr>
	<td class="t_1"><c:out value="${c.chowner }">:</c:out></td>
	<td class="t_2"><c:out value="${c.chcontent }">:</c:out></td>
	</tr>
	</c:forEach>
	</tbody></table>
  </div>
  <div class="enter">
  <form action="chat/addcontent.action" method="post">
  <input type="text" name="content">
  <input type="submit" value="发送">
  </form>
  </div>
  </body>

</html>


