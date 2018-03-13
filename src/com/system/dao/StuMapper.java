package com.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.system.entity.Student;

@Repository
public interface StuMapper {

	public List<Student> queryStuInfoById(String stu_no);
	
	public List<Student> queryAllStuInfo();
	
	public void addStudent(Student student);
	
	public String getMaxStu_no();
	
	public void saveStudent(Student student);
	
	public void deleteStu(String stu_no);
}
