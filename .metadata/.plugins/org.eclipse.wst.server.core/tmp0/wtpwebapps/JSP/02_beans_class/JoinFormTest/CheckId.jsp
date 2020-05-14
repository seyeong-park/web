<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="joinFormTest.*"%>
   
<% 
//id받아오기
String id = request.getParameter("id");
//싱글턴패턴
JoinDao dao = JoinDao.getInstance();
%>    

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 아이디 중복 확인 </title>
</head>
<body>


	<%if(dao.isDuplicationId(id)){%>
		사용불가
	<%}else{%>
		사용가능
	<%}%>


<form id='frm' name='frm' action=''><!-- form action을 부여하지 않으면 자기 자신을 다시 실행 -->
	<input type='text' id='UserId' name='userId' value='<%=id%>'>
	<input type='submit' value='중복확인'>
	<input type='button' id='select' value='아이디 채택'>
</form>

</body>
</html>