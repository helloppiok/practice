<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello ppiok</title>
</head>
<body>
	<main class="main">
		<%@include file="/WEB-INF/views/inc/header.jsp" %>
		<section class="content">
				<form method="POST" action="/makeboard/board/addok.do">
				<table class="table table-bordered add">
				<tr>
					<th>제목</th>
					<td><input type="text" name="subject" class="form-control" required></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="content" class="form-control" required></textarea></td>
				</tr>
			</table>
			
			<div class="btns">
				<input type="button" value="돌아가기"
					class="btn btn-default"
					onclick="location.href='/makeboard/board/list.do';">
				<input type="submit" value="글쓰기"
					class="btn btn-primary">										
			</div>					
				
				
				
				
				</form>
		</section>
		<%@include file="/WEB-INF/views/inc/footer.jsp" %>
	</main>




</body>
</html>