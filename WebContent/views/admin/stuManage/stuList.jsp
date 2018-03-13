<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>学生管理</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/assets/css/style_index.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery-1.6.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/index.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.validate.js"></script>
	</head>
	
	<style>
		input.error { border: 1px solid red; }
		label.error {
	    font-weight: bold;
	    color: #EA5200;
		}
		body{
	    	background: url("${pageContext.request.contextPath}/assets/images/bg05.jpg") fixed center ;
	    } 
	</style>


	<body onload="startTime()">
		
		<div class="nav-top">
			<span id="main"><a href="${pageContext.request.contextPath}/views/admin/index.jsp"><font color="white">学生成绩管理系统</font></a></span>
			<div class="nav-topright">
				<span id="nowDateTimeSpan"></span>
				<span>您好：<c:out value="${sessionScope.adminSession.getAdmin_name() }"></c:out></span>
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
							<a href="${pageContext.request.contextPath}/admin/adminList">系统管理员管理</a>
							<a href="${pageContext.request.contextPath}/views/admin/adminManage/changePassword.jsp">修改个人密码</a>
						</div>
					</li>
					<li>
						<a class="a_list a_list1">班级管理</a>
						<div class="menu_list">
							<a href="${pageContext.request.contextPath}/class/addClassInit">班级添加</a>
							<a href="${pageContext.request.contextPath}/class/classList">班级管理</a>
						</div>
					</li>
					<li>
						<a class="a_list a_list2">教师管理</a>
						<div class="menu_list">
							<a href="${pageContext.request.contextPath}/teacher/addTeacherInit">教师添加</a>
							<a href="${pageContext.request.contextPath}/teacher/teacherListInit">教师管理</a>
						</div>
					</li>
					<li>
						<a class="a_list a_list2">学生管理</a>
						<div class="menu_list">
							<a href="${pageContext.request.contextPath}/student/addStuInit">添加学生</a>
							<a href="${pageContext.request.contextPath}/student/stuListInit">管理学生</a>
						</div>
					</li>
					<li>
						<a class="a_list a_list3">课程管理</a>
						<div class="menu_list">
							<a href="${pageContext.request.contextPath}/views/admin/subManage/sub_add.jsp">添加添加</a>
							<a href="${pageContext.request.contextPath}/subject/subListInit">管理课程</a>
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
							<span class="sp2"><i></i>人员管理</span>
							<a href="${pageContext.request.contextPath}/student/stuListInit">学生管理</a>
							<a href="${pageContext.request.contextPath}/teacher/teacherListInit">教师管理</a>
							<a href="${pageContext.request.contextPath}/subject/subListInit">课程管理</a>
							<a href="${pageContext.request.contextPath}/class/classList">班级管理</a>
						</div>
					</li>
					<li>
						<a class="j_a_list j_a_list3"></a>
						<div class="j_menu_list">
							<span class="sp3"><i></i>快捷添加</span>
							<a href="${pageContext.request.contextPath}/student/addStuInit">学生添加</a>
							<a href="${pageContext.request.contextPath}/teacher/addTeacherInit">教师添加</a>
							<a href="${pageContext.request.contextPath}/class/addClassInit">班级添加</a>
							<a href="${pageContext.request.contextPath}/views/admin/subManage/sub_add.jsp">课程添加</a>
						</div>
					</li>
				</ul>

			</div>
			<div class="rightcon">
				
				<div style="height:100px"></div>
						
				<form class="form-horizontal" role="form" id="teaForm" action="${pageContext.request.contextPath}/student/queryStudent">
				
					<div class="form-group">
						<label class="col-sm-2 control-label"><font size="4px">学号查找</font></label>
						<div class="col-sm-7">
							<input type="text" class="form-control " name="queryStu_no">
						</div>
						<div class="col-sm-1">
							<button type="submit" class="btn btn-default"> 搜索 </button>
						</div>
					</div>
				</form>
				
				<div style="height:50px"></div>
				<label style="margin-left:70px"><font size="4px">教师管理</font></label>
				<div style="height:15px"></div>
				
				<table class="table table-condensed" style="width:92%;" align="center">
					<thead>
						<tr class="active">
							<th>工号</th>
							<th>密码</th>
							<th>姓名</th>
							<th>性别</th>
							<th>电话</th>
							<th>班级</th>
							<th>出生年月</th>
							<th>备注</th>
							<th>添加时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${requestScope.studentList }" var="student">
						<tr>
							<td><c:out value="${student.getStu_no() }"></c:out></td>
							<td><c:out value="${student.getStu_password() }"></c:out></td>
							<td><c:out value="${student.getStu_name() }"></c:out></td>
							<td><c:out value="${student.getStu_gender() }"></c:out></td>
							<td><c:out value="${student.getStu_tel() }"></c:out></td>
							<td><c:out value="${student.getStu_class_name() }"></c:out></td>
							<td><c:out value="${student.getStu_birth() }"></c:out></td>
							<td><c:out value="${student.getStu_remark() }"></c:out></td>
							<td><c:out value="${student.getStu_addtime() }"></c:out></td>
							<td>
								<a href="${pageContext.request.contextPath}/student/updateStuInit?stu_no=${student.getStu_no()  }">修改</a>
								<a href="${pageContext.request.contextPath}/student/deleteStu?stu_no=${student.getStu_no()  }">删除</a>
							</td>
						</tr>
						</c:forEach>
						
					</tbody>
				</table>
				
				<div style="margin-left:70px">
					<br>
					<font size=""> 共 <c:out value="${requestScope.studentList.size() }"></c:out> 条数据</font>
				</div>
			</div>
		</div>

	</body>

</html>