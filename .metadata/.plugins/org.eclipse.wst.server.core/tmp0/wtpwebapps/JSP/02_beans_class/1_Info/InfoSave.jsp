<%@ page contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ page import="info.beans.InfoBean" %>

<% 
// InfoBean bean = new InfoBean();
// bean.setName(request.getParameter("name"));
// bean.setId(request.getParameter("id"));

request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="bean" class="info.beans.InfoBean">
	<jsp:setProperty name="bean" property="*"/><!-- property:name값 -->
</jsp:useBean>

<!DOCTYPE html>
<html>
<body>
	<h2>  당신의 신상명세서 확인 </h2>
	이   름  : <%=bean.getName()%><br/>
	주민번호 : <jsp:getProperty name="bean" property="id"/><br/>
	성  별   : <jsp:getProperty name="bean" property="gender"/><br/>  
	맞습니까????
</body>
</html>