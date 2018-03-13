package com.system.action.teacher;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.system.entity.Score;
import com.system.entity.Student;
import com.system.entity.Subject;
import com.system.service.ScoreService;
import com.system.service.StuService;
import com.system.service.SubService;

@Controller
@RequestMapping("/teachScoreManage")
public class Score_Manage {

	@Autowired
	private ScoreService scoreService;
	
	@Autowired
	private StuService stuService;
	
	@Autowired
	private SubService subService;
	
	@RequestMapping("/queryAllScore")
	public String queryAllScore(Map<String, Object> map){
		List<Score> scoreList = scoreService.queryAllScore();
		map.put("scoreList", scoreList);
		return "teacher/scoreManage/scoreList";
	}
	
	@RequestMapping("/addScoreInit")
	public String addScoreInit(Map<String, Object> map){
		List<Student> stuList = stuService.queryStuInfo("");
		List<Subject> subjectList = subService.querySubjectInfo("");
		map.put("stuList", stuList);
		map.put("subjectList", subjectList);
		return "teacher/scoreManage/score_add";
	}
	
	//通过ajax向前台传送学生姓名
	@RequestMapping("/ajaxGetStu_name")
	public void ajaxGetStu_name(HttpServletRequest request, HttpServletResponse response, String score_stu_no) throws UnsupportedEncodingException{
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String stu_name = stuService.queryStuInfo(score_stu_no).get(0).getStu_name();
		String json = new Gson().toJson(stu_name);
		try {
			response.getWriter().print(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/addScore")
	public String addScore(Score score){
		scoreService.addScore(score);
		return "redirect:/teachScoreManage/queryAllScore";
	}
	
	@RequestMapping("/deleteScore")
	public String deleteScore(String score_no, Map<String, Object> map){
		scoreService.deleteScore(score_no);
		return "redirect:/teachScoreManage/queryAllScore";
	}
	
	@RequestMapping("/updateScoreInit")
	public String updateScoreInit(String score_no, Map<String, Object> map){
		Score score = scoreService.queryScoreByScore_no(Integer.parseInt(score_no));
		map.put("updateScoreData", score);
		
		List<Student> stuList = stuService.queryStuInfo("");
		List<Subject> subjectList = subService.querySubjectInfo("");
		map.put("stuList", stuList);
		map.put("subjectList", subjectList);
		
		return "teacher/scoreManage/score_update";
	}
	
	@RequestMapping("/saveScore")
	public String saveScore(Score score){
		scoreService.saveScore(score);
		return "redirect:/teachScoreManage/queryAllScore";
	}
	
	@RequestMapping("/queryScoreByStu_no")
	public String queryScoreByStu_no(String queryScore_stu_no, Map<String, Object> map){
		if( queryScore_stu_no == null || queryScore_stu_no.equals("") ){
			return "redirect:/teachScoreManage/queryAllScore";
		}
		List<Score> scoreList = scoreService.queryScoreByStu_no( queryScore_stu_no );
		map.put("scoreList", scoreList);
		return "teacher/scoreManage/scoreList";
	}


}
