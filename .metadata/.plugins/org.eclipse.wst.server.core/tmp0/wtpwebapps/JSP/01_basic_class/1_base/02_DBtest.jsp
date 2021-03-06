<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>

<!-- 에러페이지 : 각 페이지마다 지정하지 않고 톰캣의 설정파일에서 한 번 지정하자 -->
<%@ page errorPage="02_NormalErrorPage.jsp" %>

<%
	// 1. 드라이버 로딩
	Class.forName("oracle.jdbc.OracleDriver");
	String url = "jdbc:oracle:thin:@192.168.0.16:1521:orcl";
	String user ="scott";
	String pass = "tiger";
	// 2. 연결객체 얻어오기
	Connection con = DriverManager.getConnection(url,user,pass);
	// 3. sql 문장 만들기
	String sql = "SELECT * FROM emp2";
	// 4. 전송 객체 얻어오기
	PreparedStatement st = con.prepareStatement(sql);
	// 5. 전송
	ResultSet rs = st.executeQuery();
%>


<!DOCTYPE html>
<html><head><title> 디비 테스트 </title>
</head>
<body>
 
<div align=center>
<table border=2 cellSpacing=3>

  <tr class="title">
    <td>사번</td>
    <td>사원명</td>
    <td>업무</td>
    <td>관리자사번</td>
    <td>입사일</td></tr>

	<% while(rs.next()){ %>
	  <tr>
		<td><%=rs.getInt("EMPNO") %></td>
		<td><%=rs.getString("ENAME") %></td>
		<td><%=rs.getString("JOB") %></td>
		<td><%=rs.getString("MGR") %></td>
		<td><%=rs.getString("HIREDATE") %></td>
	  </tr>
	<% } //end of while %>

</table>
</div>
</body>
</html>
