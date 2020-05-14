<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="member.beans.*" %>
<%
	String id=request.getParameter("userId");
	MemberDao dao = MemberDao.getInstance();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 아이디 중복 확인 </title>
</head>
<body>

<%
	if(dao.isDuplicatedId(id)) {
%>	
		사용중인 아이디가 있습니다. 다시 입력하여 주십시오.
<%  }else { %>
		사용할 수 있는 아이디입니다.
<%  } %>



<form id='frm' name='frm' action=''><!-- form action을 부여하지 않으면 자기 자신을 다시 실행 -->
	<input type='text' id='UserId' name='userId' value='<%=id%>'>
	<input type='submit' value='중복확인'>
	<input type='button' id='select' value='아이디 채택'>
</form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	//아이디 채택
// 	$('#select').click(function(){
// 		$(opener.document).find('#id').val($('#UserId').val());
// 		window.close();
// 	});
	$('#select').click(function(){
	$(opener.document).find('form').find('input[type=text]').eq(0).val( $('form').find('input[type=text]').val() );
            window.close();
	});
	
</script>
</body>
</html>