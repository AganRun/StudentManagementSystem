package com.system.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.SubjectMapper;
import com.system.dao.TeaMapper;
import com.system.entity.Teacher;

@Service
public class TeaService {
	
	@Autowired
	private TeaMapper teaMapper; 
	
	@Autowired
	private SubjectMapper subMapper;
	
	/**
	 * 查询教师信息，如果查询字符串为空，则调用查询全部教师信息方法，否则，按条件查询
	 */
	public List<Teacher> queryTeaInfo(String teach_no){
		if(teach_no == null || teach_no.equals("")){
			return teaMapper.queryAllTeaInfo();
		}else{
			return teaMapper.queryTeaInfoById(teach_no);
		}
	}
	
	public void addTeacher(Teacher teacher){
		int max = Integer.parseInt(teaMapper.getMAXTeach_no());
		max++;
		teacher.setTeach_no(Integer.toString(max));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		teacher.setTeach_addtime(sdf.format(new Date()));
		teaMapper.addTeacher(teacher);
	}
	
	//装填任教科目
	public List<Teacher> teaListSetSubjectName(List<Teacher> tealist){
		List<Teacher> list = new ArrayList<Teacher>(10);
		for(int i=0; i<tealist.size(); i++){
			Teacher teacher = tealist.get(i);
			String subName = subMapper.querySubjectInfoById( tealist.get(i).getTeach_subject_no() ).get(0).getSubject_name();
			teacher.setTeach_subject_name(subName);
			list.add(teacher);
		}
		return list;
	}
	
	public void saveTeacher(Teacher teacher){
		teaMapper.saveTeacher(teacher);
	}
	
	public void deleteTeach(String teach_no){
		teaMapper.deleteTeach(teach_no);
	}
	
	
}
