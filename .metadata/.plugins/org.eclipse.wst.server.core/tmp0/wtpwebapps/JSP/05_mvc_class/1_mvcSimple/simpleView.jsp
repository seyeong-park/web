<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
	//***************
	//request.getParameter(): 사용자가 넘겨주는 데이터 받을 떄 사용
	//request.getAttribute(): 서버측에서 저장한 값 받아올 때 사용
	Object obj = request.getAttribute("param");
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 메인이라네 </title>
</head>
<body>
		
		<%= obj %> <br/>
		복잡하다고 지나친 좌절과 놀람은 금물입니다. <br/><br/>
		<img src="05_mvc_class/1_mvcSimple/imgs/sponge_1.JPG"/><br/><br/>

</body>
</html>