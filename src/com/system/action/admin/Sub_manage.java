package com.system.action.admin;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.Subject;
import com.system.service.SubService;

@Controller
@RequestMapping("/subject")
public class Sub_manage {

	
	@Autowired
	private SubService subService;
	
	@RequestMapping("/addSubject")
	public String addSubject(Map<String, Object> map, String sub_name){
		subService.addSubject(sub_name);
		return "redirect:/subject/subListInit";
	}
	
	@RequestMapping("/subListInit")
	public String subListInit(Map<String, Object> map){
		List<Subject> list = subService.querySubjectInfo("");
		map.put("subList", list);
		return "/admin/subManage/subList";
	}
	
	@RequestMapping("/querySub")
	public String querySub(String querySubject_no, Map<String, Object> map){
		List<Subject> list = subService.querySubjectInfo(querySubject_no);
		map.put("subList", list);
		return "/admin/subManage/subList";
	}
	
	@RequestMapping("/updateSubInit")
	public String updateSubInit(String subject_no, Map<String, Object> map){
		Subject subject = subService.querySubjectInfo(subject_no).get(0);
		map.put("updateSubDate", subject);
		return "/admin/subManage/sub_update";
	}
	
	@RequestMapping("/saveSubject")
	public String saveSubject(Subject subject){
		subService.saveSubject(subject);
		return "redirect:/subject/subListInit";
	}
	
	@RequestMapping("/deleteSub")
	public String deleteSub(String subject_no){
		subService.deleteSub(subject_no);
		return "redirect:/subject/subListInit";
	}
}
