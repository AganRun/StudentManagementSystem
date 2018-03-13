package com.system.action.admin;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.Admin;
import com.system.service.AdminService;

@Controller
@RequestMapping("/admin")
public class Admin_manage {

	@Autowired
	AdminService adminService;
	
	//管理员列表
	@RequestMapping("/adminList")
	public String adminList(Map<String, Object> map){
		List<Admin> adminlist = adminService.queryAdminInfo("");
		map.put("adminList", adminlist);
		return "admin/adminManage/admin_manage";
	}
	
	//添加管理员
	@RequestMapping("/addAdmin")
	public String addAdmin(String admin_name, String admin_password, Map<String, Object> map){
		adminService.addAdmin(admin_password, admin_name);
		return "redirect:/admin/adminList";
	}
	
	//删除管理员
	@RequestMapping("deleteAdmin")
	public String deleteAdmin(String admin_no, Map<String, Object> map){
		adminService.deleteAdmin(admin_no);
		return "redirect:/admin/adminList";
	}
	
	//修改密码
	@RequestMapping("changePwd")
	public String changePwd(String admin_oldPwd, String admin_newPwd, Map<Object, String> map, HttpSession session){
		Admin admin = (Admin) session.getAttribute("adminSession");
		if(admin_oldPwd.equals(admin.getAdmin_password())){
			admin.setAdmin_password(admin_newPwd);
			adminService.saveNewPwd(admin);
			map.put("changePwdPass", "恭喜您，修改密码成功，请注销后重新登录");
		}else{
			map.put("changePwdError", "原密码输入错误，请重新输入");
		}
		return "/admin/adminManage/changePassword";
	}
}
