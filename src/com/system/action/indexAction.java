package com.system.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.Admin;
import com.system.entity.Student;
import com.system.entity.Teacher;
import com.system.service.AdminService;
import com.system.service.StuService;
import com.system.service.TeaService;

@Controller
public class indexAction {
	
	@Autowired
	private StuService stuService;
	
	@Autowired
	private TeaService teaService;
	
	@Autowired
	private AdminService adminService;
	
	//登录初始化页面
	@RequestMapping("loginInit")
	public String loginInit(){
		return "login";
	}
	
	//用户登录管理
	@RequestMapping("loginAction")
	public String loginAction(String username, String password, String right, Map<String, Object> map, HttpSession session){
		if(right.equals("student")){
			return stuLogin(username, password, map, session);
		}else if(right.equals("teacher")){
			return teaLogin(username, password, map, session);
		}else{
			return adminLogin(username, password, map, session);
		}
	}
	
	
	//学生登录操作
	public String stuLogin(String username, String password, Map<String, Object> map, HttpSession session){
		
		List<Student> stuList = stuService.queryStuInfo(username);
		
		if(!stuList.isEmpty()){	//输入的用户名存在
			
			Student stu = stuList.get(0);
			if(stu.getStu_password().equals(password)){	//密码输入正确
				session.setAttribute("studentSession", stu);
				return "student/index";
			}else{
				map.put("loginError", "您输入的账号或密码错误");
				return "login";
			}
		}else{	//输入用户不存在
			map.put("loginError", "您输入的账号或密码错误");
			return "login";
		}
	}
	
	//教师登录操作
	public String teaLogin(String username, String password, Map<String, Object> map, HttpSession session){
		
		List<Teacher> teaList = teaService.queryTeaInfo(username);
		
		if(!teaList.isEmpty()){	//输入的用户名存在
			
			Teacher tea = teaList.get(0);
			if(tea.getTeach_password().equals(password)){	//密码输入正确
				session.setAttribute("teachSession", tea);
				return "teacher/index";
			}else{
				map.put("loginError", "您输入的账号或密码错误");
				return "login";
			}
		}else{	//输入用户不存在
			map.put("loginError", "您输入的账号或密码错误");
			return "login";
		}
	}
	
	//管理员登录操作
	public String adminLogin(String username, String password, Map<String, Object> map, HttpSession session){
		
		List<Admin> adminList = adminService.queryAdminInfo(username);
		
		if(!adminList.isEmpty()){	//输入的用户名存在
			
			Admin admin = adminList.get(0);
			if(admin.getAdmin_password().equals(password)){	//密码输入正确
				session.setAttribute("adminSession", admin);
				return "admin/index";
			}else{
				map.put("loginError", "您输入的账号或密码错误");
				return "login";
			}
		}else{	//输入用户不存在
			map.put("loginError", "您输入的账号或密码错误");
			return "login";
		}
	}
	
}
