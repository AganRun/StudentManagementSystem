<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-js">
    <head>
        <meta charset="utf-8">
        <title>学生成绩管理系统</title>

        <!-- CSS -->
        <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/reset.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/supersized.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/style.css">
    </head>

    <body>
        <div class="page-container">
            <h1>学生成绩管理系统</h1>
            <form action="${pageContext.request.contextPath }/loginAction" method="post">
               
                <input type="text" name="username" class="username" placeholder="用户编号">
                
                <input type="password" name="password" class="password" placeholder="用户密码">
			
				<select name="right">
					<option value="student">学生</option>
					<option value="teacher">教师</option>
					<option value="admin">管理员</option>
				</select>
                
                <!-- 错误信息 -->
                <font color="red"><b><c:out value="${requestScope.loginError }" default=""></c:out></b></font>
               
                <button type="submit"> 登 录  </button>
                <div class="error"><span>+</span></div>
            </form>
        </div>

        <!-- Javascript -->
        <script src="${pageContext.request.contextPath }/assets/js/jquery-1.8.2.min.js"></script>
        <script src="${pageContext.request.contextPath }/assets/js/supersized.3.2.7.min.js"></script>
        <script src="${pageContext.request.contextPath }/assets/js/supersized-init.js"></script>
        <script src="${pageContext.request.contextPath }/assets/js/scripts.js"></script>

    </body>

</html>

