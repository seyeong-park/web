<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1.이전 화면의 폼의 입력값들을 얻어오기 -->
    <%
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String occupation = request.getParameter("occupation");
    String [] hobby = request.getParameterValues("hobby");
    
    String hstr="";
	    for(int i=0; hobby!=null && i<hobby.length;i++){
	    	hstr += hobby[i]+"/";
	    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <!-- 2. 얻어온 입력값들 출력 -->
	이름 : <%=name %>  <br/>
	성별 : <%=gender %>  <br/>
	직업 : <%=occupation %>  <br/>
 	취미 : <%=hstr %> <br/>
</body>
</html>