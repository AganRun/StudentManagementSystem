package com.system.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.dao.ScoreMapper;
import com.system.entity.Score;

@Service
public class ScoreService {

	@Autowired
	private ScoreMapper scoreMapper;
	
	public List<Score> queryAllScore(){
		return scoreMapper.queryAllScore();
	}
	
	public Score queryScoreByScore_no(int score_no){
		return scoreMapper.queryScoreByScore_no(score_no);
	}
	
	public void addScore(Score score){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		score.setScore_addtime( df.format(new Date()));
		scoreMapper.addScore(score);
	}
	
	public void deleteScore(String score_no){
		scoreMapper.deleteScore(Integer.parseInt(score_no));
	}
	
	public void saveScore(Score score){
		scoreMapper.saveScore(score);
	}
	
	public List<Score> queryScoreByStu_no(String score_stu_no){
		return scoreMapper.queryScoreByStu_no(score_stu_no);
	}
	
}
