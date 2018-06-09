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
				<li><a href="group/allGroup.action" target="Mainindex"><i class="ico-2"></i>学生管理</a></li>
				<li><a href="pages/grade.jsp" target="Mainindex"><i class="ico-6"></i>教师管理</a></li>
				<li><a href="xitong_set.html"create database if not exists software default char set utf8;
use software;
create table if not exists teacher(
Tid int primary key not null,
Tname varchar(10) unique,
Tage int,
Tsex varchar(4),
Tposition varchar(15),
Temail varchar(20) not null, 
Ttel varchar(20) not null,
Tpassword varchar(20) not null
)engine InnoDB default char set utf8;
create table if not exists student(
Sno int primary key not null,
Role varchar(4),
Sname varchar(10) unique,
Sclass varchar(15),
Strength varchar(15),
Shobby varchar(15),
Spassword varchar(20) not null
)engine InnoDB default char set utf8;
create table if not exists file(
Fid int primary key auto_increment not null,
Fname varchar(10) not null,
Fowner varchar(10) not null,
Furl varchar(20) not null,
Fdate date not null,
foreign key(Fowner) references teacher(Tname) on delete cascade,
foreign key(Fowner) references student(Sname) on delete cascade,
foreign key(Fowner) references teacher(Tname) on update cascade,
foreign key(Fowner) references student(Sname) on update cascade
)engine InnoDB default char set utf8;
create table if not exists groups(
Gid int primary key auto_increment not null,
Gname varchar(15) not null,
Gleader varchar(10) not null,
Gmem1 varchar(10),
Gmem2 varchar(10),
Gmem3 varchar(10),
Gmem4 varchar(10)
)engine InnoDB default char set utf8;
create table if not exists grade(
Sno int primary key not null,
sname varchar(10),
Grade1 int,
Grade2 int,
Grade3 int,
Grade int
)engine InnoDB default char set utf8;
create table if not exists chat(
Chid int primary key auto_increment not null,
Chowner varchar(10) not null,
Chdate date not null,
Chcontent text
)engine InnoDB default char set utf8;
create table if not exists admin(
Aid int primary key auto_increment,
Apassword varchar(20) not null
)engine InnoDB default char set utf8;
create table if not exists renwu(
id int primary key auto_increment not null,
title varchar(20),
taker varchar(10),
begindate date,
enddate date,
jinqu varchar(10)
)Mainindex"><i class="ico-7"></i>系统设置</a></li>
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
