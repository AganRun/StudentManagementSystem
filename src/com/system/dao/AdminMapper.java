package com.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.system.entity.Admin;

@Repository
public interface AdminMapper {

	public List<Admin> queryAdminInfoById(String admin_no);
	
	public List<Admin> queryAllAdminInfo();
	
	public void addAdmin(Admin admin);
	
	public String getMaxAdmin_no();
	
	public void deleteAdmin(String admin_no);
	
	public void saveNewPwd(Admin admin);
	
}

