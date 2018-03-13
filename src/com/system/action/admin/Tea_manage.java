package com.system.action.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.Subject;
import com.system.entity.Teacher;
import com.system.service.SubService;
import com.system.service.TeaService;

@Controller
@RequestMapping("/teacher")
public class Tea_manage {

	@Autowired
	TeaService teaService;
	
	@Autowired
	SubService subService;
	
	
	@RequestMapping("/addTeacherInit")
	public String addTeacherInit(Map<String, Object> map){
		List<Subject> subjectList = subService.querySubjectInfo("");
		map.put("subjectList", subjectList);
		return "/admin/teaManage/tea_add";
	}
	
	@RequestMapping("/addTeacher")
	public String addTeacher(Teacher teacher){
		teaService.addTeacher(teacher);
		return "redirect:/teacher/teacherListInit";
	}
	
	//初始化教师列表页面（无查询）
	@RequestMapping("/teacherListInit")
	public String teacherListList(Map<String, Object> map){
		List<Teacher> list = teaService.queryTeaInfo("");
		List<Teacher> tealist = teaService.teaListSetSubjectName(list);
		map.put("tealist", tealist);
		return "/admin/teaManage/teaList";
	}
	
	//教师列表页面（有查询）
	@RequestMapping("/queryTeacher")
	public String queryTeacher(String queryTeach_no, Map<String, Object> map){
		List<Teacher> list = teaService.queryTeaInfo(queryTeach_no);
		List<Teacher> tealist = teaService.teaListSetSubjectName(list);
		map.put("tealist", tealist);
		return "/admin/teaManage/teaList";
	}
	
	@RequestMapping("/updateTeachInit")
	public String updateTeachInit(String teach_no, Map<String, Object> map){
		List<Teacher> list = teaService.queryTeaInfo(teach_no);
		List<Teacher> tealist = teaService.teaListSetSubjectName(list);
		List<Subject> subjectList = subService.querySubjectInfo("");
		map.put("subjectList", subjectList );
		map.put("updateTeaDate", tealist.get(0));
		return "/admin/teaManage/tea_update";
	}
	
	@RequestMapping("/saveTeacher")
	public String saveTeacher(Teacher teacher){
		teaService.saveTeacher(teacher);
		return "redirect:/teacher/teacherListInit";
	}
	
	@RequestMapping("deleteTeach")
	public String deleteTeach(String teach_no){
		teaService.deleteTeach(teach_no);
		return "redirect:/teacher/teacherListInit";
	}
	
	
	
	
}
