package com.system.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.AdminMapper;
import com.system.entity.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminMapper adminMapper; 
	
	/**
	 * 查询学生信息，如果查询字符串为空，则调用查询全部学生信息方法，否则，按条件查询
	 * @param admin_no
	 * @return
	 */
	public List<Admin> queryAdminInfo(String admin_no){
		if(admin_no == null || admin_no.equals("")){
			return adminMapper.queryAllAdminInfo();
		}else{
			return adminMapper.queryAdminInfoById(admin_no);
		}
	}
	
	//添加管理员
	public void addAdmin(String admin_password, String admin_name){
		Admin admin = new Admin();
		admin.setAdmin_password(admin_password);
		admin.setAdmin_name(admin_name);
		admin.setAdmin_right("超级管理员");
		
		int int_admin_no = Integer.parseInt(adminMapper.getMaxAdmin_no());
		int_admin_no++;
		String string_admin_no = Integer.toString(int_admin_no);
		admin.setAdmin_no(string_admin_no);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		admin.setAdmin_addtime(df.format(new Date()));
		
		adminMapper.addAdmin(admin);
	}
	
	public void deleteAdmin(String admin_no){
		adminMapper.deleteAdmin(admin_no);
	}
	
	public void saveNewPwd(Admin admin){
		adminMapper.saveNewPwd(admin);
	}
	
}
