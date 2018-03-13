package com.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.system.entity.Score;

@Repository
public interface ScoreMapper {

	public List<Score> queryAllScore(); 
	
	public Score queryScoreByScore_no(int score_no); 
	
	public void addScore(Score score);
	
	public void deleteScore(int score_no);
	
	public void saveScore(Score score);
	
	public List<Score> queryScoreByStu_no(String score_stu_no);
	
}
