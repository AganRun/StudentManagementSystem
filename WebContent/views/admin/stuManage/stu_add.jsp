<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>学生添加</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/assets/css/style_index.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery-1.6.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/index.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.validate.js"></script>

	</head>
	
	<script type="text/javascript">
		$(function(){
			$(function(){
				$("#teaForm").validate({
				    // 添加验证规则
				    rules: {
				    	stu_name: "required",
				    	stu_password: "required",
				    	stu_gender: "required",
				    	stu_birth: "required"
				    },
		
				    //重设提示信息
				    messages:{
				    	stu_name: "请输入姓名",
				    	stu_password: "请输入密码",
				    	stu_gender: "请选择性别",
				    	stu_birth: "请输入形如 yyyy-mm-dd 的日趋"
				    }
				});  
			})
		})
	</script>
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
				
				<form class="form-horizontal" role="form" id="teaForm" action="${pageContext.request.contextPath}/student/addStudent">
				
					<div style="height:100px"></div>
					<div class="form-group">
						<label class="col-sm-2 control-label"><font size="4px">学生添加</font></label>
						<div class="col-sm-6"></div>
					</div>
					<br>
					<div class="form-group">
						<label class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-6">
							<input class="form-control" name="stu_name" type="text" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">密码</label>
						<div class="col-sm-6">
							<input class="form-control" name="stu_password"  type="password" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">性别</label>
						<div class="col-sm-6">
							<input type="radio" name="stu_gender" value="男">男<input type="radio" name="stu_gender" value="女">女
							
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">班级</label>
						<div class="col-sm-6">
							<select class="form-control" name="stu_class_no">
								<c:forEach items="${requestScope.classList }" var="classEntity">
									<option value="${ classEntity.getClass_no() }"><c:out value="${classEntity.getClass_name() }"></c:out></option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">出生日期</label>
						<div class="col-sm-6">
							<input class="form-control" name="stu_birth"  type="text" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">籍贯</label>
						<div class="col-sm-6">
							<input class="form-control" name="stu_address"  type="text" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">电话</label>
						<div class="col-sm-6">
							<input class="form-control" name="stu_tel"  type="password" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">备注</label>
						<div class="col-sm-6">
							<textarea rows="3" name="stu_remark" class="form-control"></textarea>
						</div>
					</div>
					
					<button type="submit" style="margin-left: 250px;" class="btn btn-default"> 提 交 </button>
					<button type="reset" style="margin-left: 50px;" class="btn btn-default"> 取 消 </button>
					<br>
					
				</form>
				
			</div>
		</div>

	</body>

</html>
