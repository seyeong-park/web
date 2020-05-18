<%@page import="mybatis.guest.service.CommentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mybatis.guest.model.Comment" %>  
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <% String commentNo=request.getParameter("commentNo"); 
    long cNo=Integer.parseInt(commentNo);
   	Comment comment = CommentService.getInstance().selectCommentByPrimaryKey(cNo);
   	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>

수정해주세요.
<form name="frm" action="updateComment.jsp" method="post">
<table>
	<tr><td>글번호</td><td><input type="text" name="commentNo" size="3" value="<%=comment.getCommentNo()%>"/></td></tr>
	<tr><td>사용자</td><td><input type="text" name="userId" size="15" value="<%=comment.getUserId() %>"/></td></tr>
	<tr><td>메세지</td><td><textarea name="commentContent" rows="10" columns="40"><%=comment.getCommentContent() %></textarea></td></tr>
	<tr><td><input type="submit" value="입력"/></td></tr>
</table>
</form>
</body>
</html>