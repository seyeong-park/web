package mybatis.guest.model;

import java.io.Serializable;
								//Serializable:maybatis에서 직렬화 할 때 사용
public class Comment implements Serializable {
private long commentNo; 
private String userId;
private String commentContent;
private String regDate;



public long getCommentNo() {
	return commentNo;
}
public void setCommentNo(long commentNo) {
	this.commentNo = commentNo;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getCommentContent() {
	return commentContent;
}
public void setCommentContent(String commentContent) {
	this.commentContent = commentContent;
}
public String getRegDate() {
	return regDate;
}
public void setRegDate(String regDate) {
	this.regDate = regDate;
}

}
