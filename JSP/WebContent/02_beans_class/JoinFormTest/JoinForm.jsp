<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 회원가입  </title>

<script type="text/javascript">
	function openWin(){
		var id = document.frm.id.value;
		window.open("CheckId.jsp","","width=1000,height=200");//2번째 공백->새창
	}
</script>

</head>
<body>
	<form action="InsertJoin.jsp" name="frm" class="join">
		<table>
			<tr>
				<td width="100" >
				<font color="blue">아이디</font>
				</td>
				<td width="100">
				<input type="text" name="id" id="id">
				<input type="button" value="중복확인" onclick="openWin()"><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">비밀번호</font>
				</td>
				<td width="100">
				<input type="password" name="password"/><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">이름</font>
				</td>
				<td width="100">
				<input type="text" name="name"/><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">주소</font>
				</td>
				<td width="100">
				<input type="text" name="addr"/><br/>
				</td>
			</tr>
			<tr>
				<td width="100">
				<font color="blue">전화번호</font>
				</td>
				<td>
				<input type="text" size="15" name="tel"/>
				<br/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="가입하기">
				</td>
				<td>
					<input type="reset" name="cancel" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
