package com.system.entity;

public class ClassEntity {

	private String class_no;
	
	private String class_name;
	
	private String class_department;
	
	private String class_teacher_no;
	
	private String class_teacher_name;

	private String class_addtime;

	public ClassEntity(String class_no, String class_name, String class_department, String class_teacher_no,
			String class_teacher_name, String class_addtime) {
		super();
		this.class_no = class_no;
		this.class_name = class_name;
		this.class_department = class_department;
		this.class_teacher_no = class_teacher_no;
		this.class_teacher_name = class_teacher_name;
		this.class_addtime = class_addtime;
	}

	public ClassEntity() {
		super();
	}

	public String getClass_no() {
		return class_no;
	}

	public void setClass_no(String class_no) {
		this.class_no = class_no;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getClass_department() {
		return class_department;
	}

	public void setClass_department(String class_department) {
		this.class_department = class_department;
	}

	public String getClass_teacher_no() {
		return class_teacher_no;
	}

	public void setClass_teacher_no(String class_teacher_no) {
		this.class_teacher_no = class_teacher_no;
	}

	public String getClass_teacher_name() {
		return class_teacher_name;
	}

	public void setClass_teacher_name(String class_teacher_name) {
		this.class_teacher_name = class_teacher_name;
	}

	public String getClass_addtime() {
		return class_addtime;
	}

	public void setClass_addtime(String class_addtime) {
		this.class_addtime = class_addtime;
	}

	@Override
	public String toString() {
		return "ClassEntity [class_no=" + class_no + ", class_name=" + class_name + ", class_department="
				+ class_department + ", class_teacher_no=" + class_teacher_no + ", class_teacher_name="
				+ class_teacher_name + ", class_addtime=" + class_addtime + "]";
	}


	


	
}
