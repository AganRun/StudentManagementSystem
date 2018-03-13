package com.system.action.student;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.system.entity.Score;
import com.system.entity.Student;
import com.system.service.ScoreService;
import com.system.service.StuService;

@Controller
@RequestMapping("/studentManage")
public class StuManage {

	@Autowired
	private StuService stuService;
	
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping("/changePwd")
	public String changePwd(Map<String, Object> map, String stu_oldPwd, String stu_newPwd, HttpSession session){
		Student stu = (Student) session.getAttribute("studentSession");
		if( stu_oldPwd.equals(stu.getStu_password()) ){
			stu.setStu_password(stu_newPwd);
			stuService.saveStudent(stu);
			map.put("changePwdPass", "恭喜您，修改密码成功,请注销后重新登录！");
		}else{
			map.put("changePwdError", "原密码输入错误，请重新输入");
		}
		return "/student/userManage/changePassword";
	}
	
	@RequestMapping("/updateStuInit")
	public String updateStuInit(Map<String, Object> map, HttpSession session){
		Student stu = (Student) session.getAttribute("studentSession");
		List<Student> list = stuService.queryStuInfo(stu.getStu_no());
		List<Student> stulist = stuService.stuListSetClassName(list);
		map.put("updateStuDate", stulist.get(0));
		return "/student/userManage/updateInfo";
	}
	
	@RequestMapping("/saveStudent")
	public String saveStudent(Map<String, Object> map, Student stu){
		stuService.saveStudent(stu);
		return "redirect:/studentManage/updateStuInit";
	}
	
	@RequestMapping("/scoreList")
	public String scoreList(Map<String, Object> map, HttpSession session){
		Student stu = (Student) session.getAttribute("studentSession");
		List<Score> scoreList = scoreService.queryScoreByStu_no(stu.getStu_no());
		map.put("scoreList", scoreList);
		return "/student/userManage/scoreList";
	}
}
