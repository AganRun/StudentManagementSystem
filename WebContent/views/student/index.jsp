<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>学生首页</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/assets/css/style_index.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery-1.6.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/index.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.validate.js"></script>
	</head>
	
	<body onload="startTime()">
		
		<div class="nav-top">
			<span id="main"><a href="${pageContext.request.contextPath}/views/student/index.jsp"><font color="white">学生成绩管理系统</font></a></span>
			<div class="nav-topright">
				<span id="nowDateTimeSpan"></span>
				<span>您好：<c:out value="${sessionScope.studentSession.getStu_name() }"></c:out></span>
				<span><a href="${pageContext.request.contextPath}/loginInit"><font color="aqua">注销</font></a></span>
			</div>
		</div>
		
		<div class="nav-down">
			<div class="leftmenu1">
				<div class="menu-oc"><img src="${pageContext.request.contextPath}/assets/images/menu-all.png" /></div>
				<ul>
					<li>
						<a class="a_list a_list2">用户管理</a>
						<div class="menu_list menu_list_first">
							<a href="${pageContext.request.contextPath}/studentManage/updateStuInit">个人信息管理</a>
							<a href="${pageContext.request.contextPath}/views/student/userManage/changePassword.jsp">修改个人密码</a>
							<a href="${pageContext.request.contextPath}/studentManage/scoreList">成绩查看</a>
						</div>
					</li>
				</ul>
			</div>
			<div class="leftmenu2">
				<div class="menu-oc1"><img src="${pageContext.request.contextPath}/assets/images/menu-all.png" /></div>
				<ul>
					<li>
						<a class="j_a_list j_a_list1"></a>
						<div class="j_menu_list j_menu_list_first">
							<span class="sp1"><i></i>实用工具</span>
							<a href="http://ditu.amap.com/" target="_blank">地图导航</a>
							<a href="http://www.tianqi.com/" target="_blank">出行天气</a>
							<a href="http://www.eol.cn/" target="_blank">教育在线</a>
						</div>
					</li>
					<li>
						<a class="j_a_list j_a_list2"></a>
						<div class="j_menu_list">
							<span class="sp2"><i></i>信息管理</span>
							<a href="${pageContext.request.contextPath}/studentManage/updateStuInit">个人信息管理</a>
							<a href="${pageContext.request.contextPath}/views/student/userManage/changePassword.jsp">修改个人密码</a>
							<a href="${pageContext.request.contextPath}/studentManage/scoreList">成绩查看</a>
						</div>
					</li>
				</ul>
			</div>
			
			<div class="rightcon">
				
				<br><br>
				<!-- 图片轮播 -->
				<div id="myCarousel" style="width:70%;margin-left:150px;" class="carousel slide">
					<!-- 轮播（Carousel）指标 -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel"  data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel"  data-slide-to="1" ></li>
						<li data-target="#myCarousel"  data-slide-to="2"></li>
					</ol>
					
					<!-- 轮播（Carousel）项目 -->
					<div class="carousel-inner">
						<div class="item active">
							<img src="${pageContext.request.contextPath}/assets/images/index_2.jpg" alt="First slide">
						</div>
						<div class="item">
							<img src="${pageContext.request.contextPath}/assets/images/index_1.jpg" alt="Second slide">
						</div>
						<div class="item">
							<img src="${pageContext.request.contextPath}/assets/images/index_3.jpg" alt="Third slide">
						</div>
					</div>
					<!-- 轮播（Carousel）导航 -->
					<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo; </a> 
					<a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo; </a>
			
				</div>
				
		</div>
		</div>

	</body>
	<script type="text/javascript">
		$(function(){
			$('.carousel').carousel({  
			    interval: 3000  
			}); 
		})
	</script>

</html>
