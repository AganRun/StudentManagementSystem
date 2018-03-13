package com.system.entity;

public class Admin {
	
	private String admin_no;
	
	private String admin_password;
	
	private String admin_name;
	
	private String admin_addtime;
	
	private String admin_right;

	public Admin(String admin_no, String admin_password, String admin_name, String admin_addtime, String admin_right) {
		super();
		this.admin_no = admin_no;
		this.admin_password = admin_password;
		this.admin_name = admin_name;
		this.admin_addtime = admin_addtime;
		this.admin_right = admin_right;
	}

	public Admin() {
		super();
	}

	public String getAdmin_no() {
		return admin_no;
	}

	public void setAdmin_no(String admin_no) {
		this.admin_no = admin_no;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_addtime() {
		return admin_addtime;
	}

	public void setAdmin_addtime(String admin_addtime) {
		this.admin_addtime = admin_addtime;
	}

	public String getAdmin_right() {
		return admin_right;
	}

	public void setAdmin_right(String admin_right) {
		this.admin_right = admin_right;
	}

	@Override
	public String toString() {
		return "Admin [admin_no=" + admin_no + ", admin_password=" + admin_password + ", admin_name=" + admin_name
				+ ", admin_addtime=" + admin_addtime + ", admin_right=" + admin_right + "]";
	}
	

}
