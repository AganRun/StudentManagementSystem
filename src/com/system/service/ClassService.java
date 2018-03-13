package com.system.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.ClassMapper;
import com.system.dao.TeaMapper;
import com.system.entity.ClassEntity;

@Service
public class ClassService {

	@Autowired
	ClassMapper classMapper;
	
	@Autowired
	TeaMapper teaMapper;
	
	public List<ClassEntity> queryClassInfo(String class_no){
		if(class_no == null || class_no.equals("")){
			return classMapper.queryAllClassInfo();
		}else{
			return classMapper.queryClassInfoById(class_no);
		}
	}
	
	public void addClass(String class_name, String class_department, String class_teacher_no){
		ClassEntity classEntity = new ClassEntity();
		classEntity.setClass_name(class_name);
		classEntity.setClass_department(class_department);
		classEntity.setClass_teacher_no(class_teacher_no);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		classEntity.setClass_addtime(df.format(new Date()));
		
		int maxNo = Integer.parseInt(classMapper.getMaxClass_no());
		maxNo++;
		String newNo = Integer.toString(maxNo);
		classEntity.setClass_no(newNo);
		
		classMapper.addClass(classEntity);
	}
	
	//装填教师姓名
	public List<ClassEntity> classListSetTeacherName(List<ClassEntity> classList){
		
		List<ClassEntity> list = new ArrayList<ClassEntity>(10);
		for(int i=0; i<classList.size(); i++){
			ClassEntity cls = classList.get(i);
			String name = teaMapper.queryTeaInfoById( classList.get(i).getClass_teacher_no() ).get(0).getTeach_name();
			cls.setClass_teacher_name(name);
			list.add(cls);
		}
		return list;
	}
	
	public ClassEntity classListSetTeacherName(ClassEntity classEntity){

		String name = teaMapper.queryTeaInfoById( classEntity.getClass_teacher_no() ).get(0).getTeach_name();
		classEntity.setClass_teacher_name(name);
		return classEntity;
	}
	
	
	public void deleteClass(String class_no){
		classMapper.deleteClass(class_no);
	}
	
	public void updateClassSave(ClassEntity classEntity){
		classMapper.saveClass(classEntity);
	}
	
	
}
