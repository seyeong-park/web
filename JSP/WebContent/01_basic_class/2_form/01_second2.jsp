<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import='temp.*' %>
<% 
	String user = request.getParameter("User");
	String pass = request.getParameter("Pass");
	
//1. TempVO 객체에 멤버로 위의 값들을 지정
	TempVO vo = new TempVO();
	vo.setId(user);
	vo.setPass(pass);
	
//2. TempDAO의 login()을 호출
	TempDAO dao = TempDAO.getInstance();


%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>폼의 입력값 처리</title>
</head>
<body>
	<h2>폼의 입력값 넘겨받아 처리</h2>
	<!-- 3. 결과에 의해 로그인 성공 여부 출력 -->


</body>
</html>