package com.system.entity;

public class Student {

	private String stu_no;
	
	private String stu_name;
	
	private String stu_class_no;
	
	private String stu_class_name;
	
	private String stu_gender;
	
	private String stu_birth;
	
	private String stu_address;
	
	private String stu_tel;
	
	private String stu_remark;
	
	private String stu_password;
	
	private String stu_addtime;

	public Student(String stu_no, String stu_name, String stu_class_no, String stu_class_name, String stu_gender,
			String stu_birth, String stu_address, String stu_tel, String stu_remark, String stu_password,
			String stu_addtime) {
		super();
		this.stu_no = stu_no;
		this.stu_name = stu_name;
		this.stu_class_no = stu_class_no;
		this.stu_class_name = stu_class_name;
		this.stu_gender = stu_gender;
		this.stu_birth = stu_birth;
		this.stu_address = stu_address;
		this.stu_tel = stu_tel;
		this.stu_remark = stu_remark;
		this.stu_password = stu_password;
		this.stu_addtime = stu_addtime;
	}

	public Student() {
		super();
	}

	public String getStu_no() {
		return stu_no;
	}

	public void setStu_no(String stu_no) {
		this.stu_no = stu_no;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getStu_class_no() {
		return stu_class_no;
	}

	public void setStu_class_no(String stu_class_no) {
		this.stu_class_no = stu_class_no;
	}

	public String getStu_class_name() {
		return stu_class_name;
	}

	public void setStu_class_name(String stu_class_name) {
		this.stu_class_name = stu_class_name;
	}

	public String getStu_gender() {
		return stu_gender;
	}

	public void setStu_gender(String stu_gender) {
		this.stu_gender = stu_gender;
	}

	public String getStu_birth() {
		return stu_birth;
	}

	public void setStu_birth(String stu_birth) {
		this.stu_birth = stu_birth;
	}

	public String getStu_address() {
		return stu_address;
	}

	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}

	public String getStu_tel() {
		return stu_tel;
	}

	public void setStu_tel(String stu_tel) {
		this.stu_tel = stu_tel;
	}

	public String getStu_remark() {
		return stu_remark;
	}

	public void setStu_remark(String stu_remark) {
		this.stu_remark = stu_remark;
	}

	public String getStu_password() {
		return stu_password;
	}

	public void setStu_password(String stu_password) {
		this.stu_password = stu_password;
	}

	public String getStu_addtime() {
		return stu_addtime;
	}

	public void setStu_addtime(String stu_addtime) {
		this.stu_addtime = stu_addtime;
	}

	@Override
	public String toString() {
		return "Student [stu_no=" + stu_no + ", stu_name=" + stu_name + ", stu_class_no=" + stu_class_no
				+ ", stu_class_name=" + stu_class_name + ", stu_gender=" + stu_gender + ", stu_birth=" + stu_birth
				+ ", stu_address=" + stu_address + ", stu_tel=" + stu_tel + ", stu_remark=" + stu_remark
				+ ", stu_password=" + stu_password + ", stu_addtime=" + stu_addtime + "]";
	}
	
	

	
	
	
	
}
