package net.smboard.board.dao;

import java.util.List;

import net.smboard.board.model.BoardCommentModel;
import net.smboard.board.model.BoardModel;

public interface BoardDao {
	// 쿼리id? --> memebr.xml파일확인!!
	// get all contents in JMBoard table
	List<BoardModel> getBoardList(int startArticleNum, int showArticleLimit);
	// 쿼리id랑 메소드이름이 같다 -> 사용하기 용이
	
	// show detail about selected article
	BoardModel getOneArticle(int idx);
	
	// get search result list
	List<BoardModel> searchArticle(String type, String keyword, int startArticleNum, int endArticleNum); 
	
	// get all comments
	List<BoardCommentModel> getCommentList(int idx);
	
	// get a comment
	BoardCommentModel getOneComment(int idx);
	
	// modify(update) article
	boolean modifyArticle(BoardModel board);
	
	// insert article data
	boolean writeArticle(BoardModel board);
	
	// insert comment data
	boolean writeComment(BoardCommentModel comment);
	
	// update hitcount
	void updateHitcount(int hitcount, int idx);
	
	// update recommendcount
	void updateRecommendCount(int recommendcount, int idx);
	
	// get contents count
	int getTotalNum();
	
	// get count of search results
	int getSearchTotalNum(String type, String keyword);
	
	// delete a comment
	void deleteComment(int idx);
	
	// delete a article
	void deleteArticle(int idx);
}