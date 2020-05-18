package mybatis.board.session;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatis.board.model.Comment;

public class CommentRepository {

	private SqlSessionFactory getSqlSessionFactory() {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		SqlSessionFactory sessFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sessFactory;
	}
	
		//목록보기
		public List<Comment> selectComment() {
			SqlSession sqlSess = getSqlSessionFactory().openSession();
			try {
				List<Comment> list = sqlSess.selectList("CommentMapper.selectComment");
				return list;
			} finally {
				sqlSess.close(); // 연결 끊는 것이 아니라 반납하는 개념
			}
		}
		
		//PK
		public Comment selectCommentByPK(long articleId) {
			SqlSession sqlSess = getSqlSessionFactory().openSession();
			try {
				HashMap map = new HashMap();
				map.put("articleId", articleId);
				Comment c = sqlSess.selectOne("CommentMapper.selectCommentByPK", map);
				return c;
			} finally {
				sqlSess.close();
			}
		}
		
		//입력
		public Integer insertComment(Comment c) {
			SqlSession sqlSess = getSqlSessionFactory().openSession();
			try {
				int result = sqlSess.insert("CommentMapper.insertComment", c);
				if (result > 0)
					sqlSess.commit();// 1이면 성공->commit
				else
					sqlSess.rollback();
				return result;
			} finally {
				sqlSess.close();
			}
		}
		
		//수정
		public Integer modifyComment(Comment comment) {
			SqlSession sqlSess = getSqlSessionFactory().openSession();
			try {

				int result = sqlSess.update("CommentMapper.updateComment",comment);
				if(result>0)
					sqlSess.commit();
				else
					sqlSess.rollback();
				return result;
			}finally {
				sqlSess.close();
			}
		}
		
		
		//삭제
		public Integer deleteComment(long cn) {
			SqlSession sqlSess = getSqlSessionFactory().openSession();
			try {
				HashMap map = new HashMap();
				map.put("articleId", cn);
				int result = sqlSess.delete("CommentMapper.deleteComment", map);
				if (result > 0)
					sqlSess.commit();
				else
					sqlSess.rollback();
				return result;
			} finally {
				sqlSess.close();
			}
		}
		
		//답변하기(입력)
}
