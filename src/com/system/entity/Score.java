package com.system.entity;

public class Score {

	private int score_no;
	
	private int score_num;
	
	private String score_addtime;
	
	private String score_stu_no;
	
	private String stu_name;
	
	private String score_subject_no;
	
	private String subject_name;

	public Score(int score_no, String score_stu_no, String stu_name, String score_subject_no, String subject_name,
			int score_num) {
		super();
		this.score_no = score_no;
		this.score_stu_no = score_stu_no;
		this.stu_name = stu_name;
		this.score_subject_no = score_subject_no;
		this.subject_name = subject_name;
		this.score_num = score_num;
	}

	public Score() {
		super();
	}

	public int getScore_no() {
		return score_no;
	}

	public void setScore_no(int score_no) {
		this.score_no = score_no;
	}

	public String getScore_stu_no() {
		return score_stu_no;
	}

	public void setScore_stu_no(String score_stu_no) {
		this.score_stu_no = score_stu_no;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getScore_subject_no() {
		return score_subject_no;
	}

	public void setScore_subject_no(String score_subject_no) {
		this.score_subject_no = score_subject_no;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public int getScore_num() {
		return score_num;
	}

	public void setScore_num(int score_num) {
		this.score_num = score_num;
	}

	public String getScore_addtime() {
		return score_addtime;
	}

	public void setScore_addtime(String score_addtime) {
		this.score_addtime = score_addtime;
	}

	@Override
	public String toString() {
		return "score [score_no=" + score_no + ", score_stu_no=" + score_stu_no + ", stu_name=" + stu_name
				+ ", score_subject_no=" + score_subject_no + ", subject_name=" + subject_name + ", score_num="
				+ score_num + "]";
	}

	

	
}
