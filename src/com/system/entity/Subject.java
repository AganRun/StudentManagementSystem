package com.system.entity;


public class Subject {

	
	private String subject_no;
	
	private String subject_name;
	
	private String subject_addtime;

	public Subject(String subject_no, String subject_name, String subject_addtime) {
		super();
		this.subject_no = subject_no;
		this.subject_name = subject_name;
		this.subject_addtime = subject_addtime;
	}
	

	public Subject() {
		super();
	}


	public String getSubject_no() {
		return subject_no;
	}

	public void setSubject_no(String subject_no) {
		this.subject_no = subject_no;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getSubject_addtime() {
		return subject_addtime;
	}

	public void setSubject_addtime(String subject_addtime) {
		this.subject_addtime = subject_addtime;
	}


	@Override
	public String toString() {
		return "Subject [subject_no=" + subject_no + ", subject_name=" + subject_name + ", subject_addtime="
				+ subject_addtime + "]";
	}
	
	
}
