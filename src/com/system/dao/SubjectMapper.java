package com.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.system.entity.Subject;

@Repository
public interface SubjectMapper {

	public List<Subject> querySubjectInfoById(String subject_no);
	
	public List<Subject> queryAllSubjectInfo();
	
	public void addSubject(Subject subject);
	
	public String getMAXSub_no();
	
	public void saveSubject(Subject subject);
	
	public void deleteSub(String subject_no);
}
