package com.system.entity;

public class Teacher {

	private String teach_no;
	
	private String teach_name;
	
	private String teach_password;
	
	private String teach_gender;
	
	private String teach_tel;
	
	private String teach_subject_no;
	
	private String teach_subject_name;
	
	private String teach_birth;
	
	private String teach_remark;
	
	private String teach_addtime;

	public Teacher(String teach_no, String teach_name, String teach_password, String teach_gender, String teach_tel,
			String teach_subject_no, String teach_birth, String teach_remark, String teach_subject_name, String teach_addtime) {
		super();
		this.teach_no = teach_no;
		this.teach_name = teach_name;
		this.teach_password = teach_password;
		this.teach_gender = teach_gender;
		this.teach_tel = teach_tel;
		this.teach_subject_no = teach_subject_no;
		this.teach_birth = teach_birth;
		this.teach_remark = teach_remark;
		this.teach_subject_name = teach_subject_name;
		this.teach_addtime = teach_addtime;
	}

	public Teacher() {
		super();
	}

	public String getTeach_no() {
		return teach_no;
	}

	public void setTeach_no(String teach_no) {
		this.teach_no = teach_no;
	}

	public String getTeach_name() {
		return teach_name;
	}

	public void setTeach_name(String teach_name) {
		this.teach_name = teach_name;
	}

	public String getTeach_password() {
		return teach_password;
	}

	public void setTeach_password(String teach_password) {
		this.teach_password = teach_password;
	}

	public String getTeach_gender() {
		return teach_gender;
	}

	public void setTeach_gender(String teach_gender) {
		this.teach_gender = teach_gender;
	}

	public String getTeach_tel() {
		return teach_tel;
	}

	public void setTeach_tel(String teach_tel) {
		this.teach_tel = teach_tel;
	}

	public String getTeach_subject() {
		return teach_subject_no;
	}

	public void setTeach_subject(String teach_subject_no) {
		this.teach_subject_no = teach_subject_no;
	}

	public String getTeach_birth() {
		return teach_birth;
	}

	public void setTeach_birth(String teach_birth) {
		this.teach_birth = teach_birth;
	}

	public String getTeach_remark() {
		return teach_remark;
	}

	public void setTeach_remark(String teach_remark) {
		this.teach_remark = teach_remark;
	}
	
	public String getTeach_subject_no() {
		return teach_subject_no;
	}

	public void setTeach_subject_no(String teach_subject_no) {
		this.teach_subject_no = teach_subject_no;
	}

	public String getTeach_subject_name() {
		return teach_subject_name;
	}

	public void setTeach_subject_name(String teach_subject_name) {
		this.teach_subject_name = teach_subject_name;
	}
	

	public String getTeach_addtime() {
		return teach_addtime;
	}

	public void setTeach_addtime(String teach_addtime) {
		this.teach_addtime = teach_addtime;
	}

	@Override
	public String toString() {
		return "Teacher [teach_no=" + teach_no + ", teach_name=" + teach_name + ", teach_password=" + teach_password
				+ ", teach_gender=" + teach_gender + ", teach_tel=" + teach_tel + ", teach_subject_no=" + teach_subject_no
				+ ", teach_birth=" + teach_birth + ", teach_remark=" + teach_remark + "]";
	}

	
	
}
