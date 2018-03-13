package com.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.system.entity.Teacher;

@Repository
public interface TeaMapper {

	public List<Teacher> queryTeaInfoById(String teach_no);
	
	public List<Teacher> queryAllTeaInfo();
	
	public void addTeacher(Teacher teacher);
	
	public String getMAXTeach_no();
	
	public void saveTeacher(Teacher teacher);
	
	public void deleteTeach(String teach_no);
}
