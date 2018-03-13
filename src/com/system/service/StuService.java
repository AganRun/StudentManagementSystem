package com.system.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.ClassMapper;
import com.system.dao.StuMapper;
import com.system.entity.Student;

@Service
public class StuService {
	
	@Autowired
	private StuMapper stuMapper;
	
	@Autowired
	private ClassMapper classMapper;
	
	/**
	 * 查询学生信息，如果查询字符串为空，则调用查询全部学生信息方法，否则，按条件查询
	 * @param stu_no
	 * @return
	 */
	public List<Student> queryStuInfo(String stu_no){
		if(stu_no == null || stu_no.equals("")){
			return stuMapper.queryAllStuInfo();
		}else{
			return stuMapper.queryStuInfoById(stu_no);
		}
	}
	
	public void addStudent(Student student){
		int max = Integer.parseInt(stuMapper.getMaxStu_no());
		max++;
		student.setStu_no(Integer.toString(max));
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		student.setStu_addtime(df.format(new Date()));
		
		stuMapper.addStudent(student);
	}
	
	//将班级姓名装入学生列表
	public List<Student> stuListSetClassName(List<Student> stulist){
		List<Student> list = new ArrayList<Student>(10);
		for(int i=0; i<stulist.size(); i++){
			Student stu = stulist.get(i);
			String className = classMapper.queryClassInfoById( stulist.get(i).getStu_class_no() ).get(0).getClass_name();
			stu.setStu_class_name(className);
			list.add(stu);
		}
		return list;
	}
	
	public void saveStudent(Student student){
		stuMapper.saveStudent(student);
	}
	
	public void deleteStu(String stu_no){
		stuMapper.deleteStu(stu_no);
	}
	
}
