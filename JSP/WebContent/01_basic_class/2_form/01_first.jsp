<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!-- 클라이언트 -> 서버 : request(요청)   method:데이터 전송방식(기본값 get) / 로그인, 게시글 전송 ->post
   		서버 -> 클라이언트 : response(응답) -->
   		

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> 로그인창 </title>
</head>
<body>

<h3>로그인 확인하기 </h3> 
<form action="01_second.jsp" method="post">
사용자: <input name='User' type='text'><br/>
비밀번호: <input name='Pass' type='password'><br/>
<input type='submit' value='login'> 
</form>

</body>
</html>