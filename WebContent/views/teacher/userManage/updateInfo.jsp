<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>个人密码修改</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/assets/css/style_index.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/jquery-1.6.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/assets/js/index.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.validate.js"></script>
	</head>
	<!-- 表单验证 -->
	<script type="text/javascript">
		$(function(){
			$("#teaForm").validate({
			    // 添加验证规则
			    rules: {
			    	teach_name: "required",
			    	teach_gender: "required",
			    	teach_birth: "required",
			    },
	
			    //重设提示信息
			    messages:{
			    	teach_name: "请输入姓名",
			    	teach_gender: "请输入性别",
			    	teach_birth: "请输入  year-mm-dd 格式的日期"
			    }
			});  
		})
	</script>
	<style>
		input.error { border: 1px solid red; }
		label.error {
	    font-weight: bold;
	    color: #EA5200;
		}
		body{
	    	background: url("${pageContext.request.contextPath}/assets/images/bg02.jpg") fixed center ;
	    } 
	</style>
	<body onload="startTime()">
		
		<div class="nav-top">
			<span id="main"><a href="${pageContext.request.contextPath}/views/teacher/index.jsp"><font color="white">学生成绩管理系统</font></a></span>
			<div class="nav-topright">
				<span id="nowDateTimeSpan"></span>
				<span>您好：<c:out value="${sessionScope.teachSession.getTeach_name() }"></c:out></span>
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
							<a href="${pageContext.request.contextPath}/teacherManage/updateTeachInit">个人信息管理</a>
							<a href="${pageContext.request.contextPath}/views/teacher/userManage/changePassword.jsp">修改个人密码</a>
						</div>
					</li>
					<li>
						<a class="a_list a_list1">成绩管理</a>
						<div class="menu_list">
							<a href="${pageContext.request.contextPath}/teachScoreManage/addScoreInit">成绩添加</a>
							<a href="${pageContext.request.contextPath}/teachScoreManage/queryAllScore">成绩管理</a>
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
							<a href="${pageContext.request.contextPath}/teacherManage/updateTeachInit">个人信息管理</a>
							<a href="${pageContext.request.contextPath}/views/teacher/userManage/changePassword.jsp">修改个人密码</a>
						</div>
					</li>
					<li>
						<a class="j_a_list j_a_list3"></a>
						<div class="j_menu_list">
							<span class="sp3"><i></i>成绩管理</span>
							<a href="${pageContext.request.contextPath}/teachScoreManage/addScoreInit">成绩添加</a>
							<a href="${pageContext.request.contextPath}/teachScoreManage/queryAllScore">成绩管理</a>
						</div>
					</li>
				</ul>
			</div>
			<div class="rightcon">
				
				<form class="form-horizontal" role="form" id="teaForm" action="${pageContext.request.contextPath}/teacherManage/saveTeacher">
				
					<div style="height:100px"></div>
					<div class="form-group">
						<label class="col-sm-2 control-label"><font size="4px">教师信息修改</font></label>
						<div class="col-sm-6"></div>
					</div>
					<br>
					<div class="form-group">
						<label class="col-sm-2 control-label">工号</label>
						<div class="col-sm-6">
							<input class="form-control" name="teach_no" value="${requestScope.updateTeaDate.getTeach_no() }" type="text" readonly="true">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">姓名</label>
						<div class="col-sm-6">
							<input class="form-control" name="teach_name" value="${requestScope.updateTeaDate.getTeach_name() }" type="text" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">性别</label>
						<div class="col-sm-6">
							<script type="text/javascript">
								$(function(){
									$gender = "${requestScope.updateTeaDate.getTeach_gender()}";
									if( $gender == "男"){
										$("#man").attr("checked", true);
									}else{
										$("#woman").attr("checked", true);
									}
								})
							</script>
							
							<input type="radio" id="man" name="teach_gender" value="男">男
							<input type="radio" id="woman" name="teach_gender" value="女">女
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">电话</label>
						<div class="col-sm-6">
							<input class="form-control" name="teach_tel" value="${requestScope.updateTeaDate.getTeach_tel() }"  type="text" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">任教科目</label>
						<div class="col-sm-6">
							<select class="form-control" name="teach_subject_no">
								<option value="${requestScope.updateTeaDate.getTeach_subject_no() }"><c:out value="${requestScope.updateTeaDate.getTeach_subject_name() }"></c:out></option>
								<c:forEach items="${requestScope.subjectList }" var="subject">
									<c:if test="${requestScope.updateTeaDate.getTeach_subject_no() !=  subject.getSubject_no() }">
										<option value="${ subject.getSubject_no() }"><c:out value="${subject.getSubject_name() }"></c:out></option>
									</c:if>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">出生日期</label>
						<div class="col-sm-6">
							<input class="form-control" name="teach_birth" value="${requestScope.updateTeaDate.getTeach_birth() }"   type="text" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">备注</label>
						<div class="col-sm-6">
							<textarea rows="3" name="teach_remark"   class="form-control"><c:out value="${requestScope.updateTeaDate.getTeach_remark() }"></c:out>
							</textarea>
						</div>
					</div>
					
					
					<input type="hidden" value="${requestScope.updateTeaDate.getTeach_password() }" name="teach_password">
					
					<button type="submit" style="margin-left: 250px;" class="btn btn-default"> 提 交 </button>
					<button type="reset" style="margin-left: 50px;" class="btn btn-default"> 取 消 </button>
					<br>
					
				</form>

			</div>
		</div>

	</body>

</html>

