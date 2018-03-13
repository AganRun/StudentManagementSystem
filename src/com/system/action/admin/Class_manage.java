package com.system.action.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.ClassEntity;
import com.system.entity.Teacher;
import com.system.service.ClassService;
import com.system.service.TeaService;

@Controller
@RequestMapping("/class")
public class Class_manage {

	
	@Autowired
	ClassService classService;
	
	@Autowired
	TeaService teaService;

	//添加学生页面
	@RequestMapping("/addClassInit")
	public String addClassInit(Map<String, Object> map){
		List<Teacher> teaList = teaService.queryTeaInfo("");
		map.put("teaList", teaList);
		return "/admin/classManage/class_add";
	}

	//添加班级信息处理然后跳转到班级信息列表
	@RequestMapping("/addClass")
	public String addClass(String class_name, String class_department, String class_teacher_no, Map<String, Object> map){
		classService.addClass(class_name, class_department, class_teacher_no);
		return "redirect:/class/classList";
	}
	
	//班级信息列表
	@RequestMapping("/classList")
	public String classList( Map<String, Object> map){
		List<ClassEntity> list = classService.queryClassInfo("");
		List<ClassEntity> classlist = classService.classListSetTeacherName(list);
		map.put("classList", classlist);
		return "/admin/classManage/classList";
	}
	
	@RequestMapping("/deleteClass")
	public String deleteClass(String class_no, Map<String, Object> map){
		classService.deleteClass(class_no);
		return "redirect:/class/classList";
	}
	
	//更新班级信息首页
	@RequestMapping("/updateClassInit")
	public String updateClassInit(String class_no, Map<String, Object> map){
		ClassEntity  classEntity = classService.queryClassInfo(class_no).get(0);
		classEntity = classService.classListSetTeacherName(classEntity);
		map.put("updateDate", classEntity);
		List<Teacher> teaList = teaService.queryTeaInfo("");
		map.put("teaList", teaList);
		return "/admin/classManage/class_update";
	}
	
	//保存修改后的班级信息
	@RequestMapping("/updateClassSave")
	public String updateClassSave(ClassEntity classEntity, Map<String, Object> map){
		classService.updateClassSave(classEntity);
		return "redirect:/class/classList";
	}


}
