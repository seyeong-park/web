<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% String msg="안녕하세요"; %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 첫 JSP</title>
</head>
<body>
	여기는 JSP 입니다. <%=msg %>
	
	<!-- HTML 주석 : 클라이언트의 웹브라우저에서 실행하지 않음-->
	<% //자바주석 %>
	<% /* 자바 주석 : java에서 class변환 때 실행하지 않음 */ %>
	<%-- JSP 주석 : JSP에서 JAVA변환 때 실행하지 않음 --%>
</body>
</html>