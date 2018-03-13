package com.system.action.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.ClassEntity;
import com.system.entity.Student;
import com.system.entity.Subject;
import com.system.entity.Teacher;
import com.system.service.ClassService;
import com.system.service.StuService;

@Controller
@RequestMapping("/student")
public class Stu_manage {

	
	@Autowired
	StuService stuService;
	
	@Autowired
	ClassService classService;
	
	@RequestMapping("/addStuInit")
	public String addStuInit(Map<String, Object> map){
		List<ClassEntity> classList = classService.queryClassInfo("");
		map.put("classList", classList);
		return "admin/stuManage/stu_add";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Map<String, Object> map, Student student){
		stuService.addStudent(student);
		return "redirect:/student/stuListInit";
	}
	
	@RequestMapping("/stuListInit")
	public String stuListInit(Map<String, Object> map){
		List<Student> list = stuService.queryStuInfo("");
		List<Student> stuList = stuService.stuListSetClassName(list);
		map.put("studentList", stuList);
		return "admin/stuManage/stuList";
	}
	
	//学生列表页面（有查询）
	@RequestMapping("/queryStudent")
	public String queryTeacher(String queryStu_no, Map<String, Object> map){
		List<Student> list = stuService.queryStuInfo(queryStu_no);
		List<Student> stuList = stuService.stuListSetClassName(list);
		map.put("studentList", stuList);
		return "/admin/stuManage/stuList";
	}
	
	@RequestMapping("/updateStuInit")
	public String updateTeachInit(String stu_no, Map<String, Object> map){
		List<Student> list = stuService.queryStuInfo(stu_no);
		List<Student> stuList = stuService.stuListSetClassName(list);
		List<ClassEntity> classList = classService.queryClassInfo("");
		map.put("classList", classList );
		map.put("updateStuDate", stuList.get(0));
		return "/admin/stuManage/stu_update";
	}
	
	@RequestMapping("/saveStudent")
	public String saveTeacher(Student student){
		stuService.saveStudent(student);
		return "redirect:/student/stuListInit";
	}
	
	@RequestMapping("/deleteStu")
	public String deleteTeach(String stu_no){
		stuService.deleteStu(stu_no);
		return "redirect:/student/stuListInit";
	}
	
}
