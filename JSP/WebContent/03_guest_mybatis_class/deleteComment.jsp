<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mybatis.guest.model.*"%>
<%@ page import="mybatis.guest.service.*"%>

<%
	String articleId = request.getParameter("articleId");
	int result = CommentService.getInstance().deleteComment(articleId);
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%if(result!=0){%>
	삭제완료
<%}else{%>
	삭제불가
<%}%>

<a href="listComment.jsp">목록보기</a>


</body>
</html>