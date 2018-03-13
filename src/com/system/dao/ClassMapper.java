package com.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.system.entity.ClassEntity;

@Repository
public interface ClassMapper {

	public List<ClassEntity> queryClassInfoById(String class_no);
	
	public List<ClassEntity> queryAllClassInfo();
	
	public void addClass(ClassEntity classEntity);
	
	public String getMaxClass_no();
	
	public void deleteClass(String class_no);
	
	public void saveClass(ClassEntity classEntity);
	
	
}
