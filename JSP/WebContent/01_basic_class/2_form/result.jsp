<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import='temp.*' %> <!-- temp패키지 연결 -->
    
    <!-- 1.폼의 입력값을 얻어오기 (아이디, 비밀번호(1개), 이름, 전화번호, 주소) -->
    <%
    request.setCharacterEncoding("utf-8");//한글 먼저 변환
    
    String id = request.getParameter("id");
    String pass = request.getParameter("pass");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    String addr = request.getParameter("addr");
    
    //객체 vo에 담기
    TempVO vo = new TempVO();
    vo.setId(id);
    vo.setPass(pass);
    vo.setName(name);
    vo.setTel(tel);
    vo.setAddr(addr);
    
    TempDAO dao = TempDAO.getInstance();
    dao.insert(vo);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 2.얻어온 입력값을 출력 -->
아이디 : <%= id %> <br/>
비밀번호 : <%= pass %> <br/>
이름 : <%= name %> <br/>
전화번호 : <%= tel %> <br/>
주소 : <%= addr %> <br/>
</body>
</html>