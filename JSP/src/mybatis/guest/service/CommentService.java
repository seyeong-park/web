package mybatis.guest.service;

import java.util.*;

import mybatis.guest.model.Comment;
import mybatis.guest.session.CommentRepository;

public class CommentService {
	
	private static CommentService service;
	
	public static CommentService getInstance(){
		if( service == null) service = new CommentService();
		return service;
	}
	
	//생성자 private지정
	private CommentService() {}
	
	CommentRepository repo = new CommentRepository();
	
	//목록보기
	public List<Comment> selectComment() {
		return repo.selectComment();
	}
	
	//입력하기
	public Integer insertComment(Comment c){
		return repo.insertComment(c);
		
	}
	
	//commentNo
	public Comment selectCommentByPrimaryKey(long commentNo) {
		return repo.selectCommentByPK(commentNo);
	}
	
	//삭제
	public Integer deleteComment(String cNo)  {
		long cn =(Long.parseLong(cNo));
		return repo.deleteComment(cn);
		
	}
	
	//수정
	public Integer updateComment(Comment comment) {
		return repo.updateComment(comment);
	}

}