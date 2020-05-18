<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mybatis.board.model.Comment" %>   
<%@ page import="mybatis.board.service.CommentService" %>   
    
    <%  
  int ArticleId = Integer.parseInt( request.getParameter("ArticleId"));
  Comment comment = CommentService.getInstance().selectCommentByPK(ArticleId);
  %>
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글쓰기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#btninsert').click(function(){
		window.location = "BoardList.jsp?ArticleId=<%=comment.getArticleId()%>";
	});
	
	$('#btncancel').click(function(){
		window.location = "BoardView.jsp?ArticleId=<%=comment.getArticleId()%>";
	});
});

</script> 
</head>

 <body>
	<h4> 게시판 글 쓰기 </h4><br/>
	나중에 이쁘게 만드시오 <br/><br/>
	<form name='frm' method='get'>
	작성자 : <input type='text' name='writerName'><br/><br/>
	제  목 : <input type='text' name='title'><br/><br/>
	내  용 : <textarea rows='10' cols='40' name='content'></textarea><br/><br/>
	패스워드(수정/삭제시 필요) :
			 <input type='password' name='password'><br/><br/>
	<input type='button' id="btninsert" value='작성'>
	<input type='button' id="btncancel" value='취소'>
	</form>

</body>
</html>