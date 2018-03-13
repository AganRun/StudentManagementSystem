package com.system.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.SubjectMapper;
import com.system.entity.Subject;

@Service
public class SubService {
	
	@Autowired
	private SubjectMapper subMapper; 
	
	public List<Subject> querySubjectInfo(String subject_no){
		if(subject_no == null || subject_no.equals("")){
			return subMapper.queryAllSubjectInfo();
		}else{
			return subMapper.querySubjectInfoById(subject_no);
		}
	}
	
	public void addSubject(String subject_name){
		Subject subject = new Subject();
		subject.setSubject_name(subject_name);
		
		int max = Integer.parseInt(subMapper.getMAXSub_no());
		max++;
		subject.setSubject_no(Integer.toString(max));
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		subject.setSubject_addtime(df.format(new Date()));
		
		subMapper.addSubject(subject);
	}
	
	public void saveSubject(Subject subject){
		subMapper.saveSubject(subject);
	}
	
	public void deleteSub(String subject_no){
		subMapper.deleteSub(subject_no);
	}
}
