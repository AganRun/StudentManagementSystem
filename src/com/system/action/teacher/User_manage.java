package com.system.action.teacher;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.Subject;
import com.system.entity.Teacher;
import com.system.service.SubService;
import com.system.service.TeaService;

@Controller
@RequestMapping("/teacherManage")
public class User_manage {

	@Autowired
	private TeaService teaService;
	
	@Autowired
	private SubService subService;
	
	@RequestMapping("/changePwd")
	public String changePwd(Map<String, Object> map, String teach_oldPwd, String teach_newPwd, HttpSession session){
		Teacher teach = (Teacher) session.getAttribute("teachSession");
		if(teach_oldPwd.equals(teach.getTeach_password())){
			teach.setTeach_password(teach_newPwd);
			teaService.saveTeacher(teach);
			map.put("changePwdPass", "恭喜您，修改密码成功,请注销后重新登录！");
		}else{
			map.put("changePwdError", "原密码输入错误，请重新输入");
		}
		return "/teacher/userManage/changePassword";
	}
	
	@RequestMapping("/updateTeachInit")
	public String updateTeachInit(Map<String, Object> map, HttpSession session){
		Teacher teacher = (Teacher) session.getAttribute("teachSession");
		List<Teacher> list = teaService.queryTeaInfo(teacher.getTeach_no());
		List<Teacher> tealist = teaService.teaListSetSubjectName(list);
		List<Subject> subjectList = subService.querySubjectInfo("");
		map.put("subjectList", subjectList );
		map.put("updateTeaDate", tealist.get(0));
		return "/teacher/userManage/updateInfo";
	}
	
	@RequestMapping("/saveTeacher")
	public String saveTeacher(Teacher teacher, Map<String, Object> map){
		teaService.saveTeacher(teacher);
		return "redirect:/teacherManage/updateTeachInit";
	}
}
