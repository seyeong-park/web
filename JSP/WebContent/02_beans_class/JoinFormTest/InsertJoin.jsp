<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%@ page import="joinFormTest.*" %>
    
<jsp:useBean id="join" class="joinFormTest.Join">
	<jsp:setProperty name="join" property="*"/>
</jsp:useBean>
    
    
<% 
//싱글턴 패턴 연결
JoinDao dao = JoinDao.getInstance();
dao.insertJoin(join);
%>  
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 회원가입 확인  </title>
</head>
<body>
아이디 :<%=join.getId() %><br/>
이름 :<%=join.getName() %><br/>
비밀번호 :<%=join.getPass() %><br/>
주소 :<%=join.getAddr() %><br/>
전화번호 :<%=join.getTel() %><br/>

</body>
</html>