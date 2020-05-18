<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mybatis.guest.model.*" %>
<%@ page import="mybatis.guest.service.*"%>


<jsp:useBean id="comment" class="mybatis.guest.model.Comment">
	<jsp:setProperty name="comment" property="*"/>
</jsp:useBean>
<% 
	int result = CommentService.getInstance().updateComment(comment);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(result==0){%>
	수정불가
<% } else{%>
	수정완료
<%} %>
</body>
</html>