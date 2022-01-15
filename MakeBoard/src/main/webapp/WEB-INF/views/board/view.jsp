<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello ppiok</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>
<style>

</style>
</head>
<body>
	
<main class="main">
		<%@include file="/WEB-INF/views/inc/header.jsp" %>
		<section class="content">
			
			
			<table class="table table-bordered add">
				<tr>
					<th>이름</th>
					<td>${dto.name}(${dto.id}) <small>${dto.userip}</small></td>
				</tr>
				<tr>
					<th>날짜</th>
					<td>${dto.regdate}</td>
				</tr>
				<tr>
					<th>읽음</th>
					<td>${dto.readcount}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${dto.subject}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td style="height:300px;vertical-align:middle;">${dto.content}</td>
				</tr>
			</table>			
			
			<div class="btns">
			
				<input type="button" value="돌아가기"
					class="btn btn-default"
					onclick="location.href='/makeboard/board/list.do?column=${column}&word=${word}';">
				
				
				<!-- 세션안의 아이디와 dto안의 아이디가 같을때~ -->
				<c:if test="${not empty id && dto.id == id}">
				<input type="button" value="수정하기"
					class="btn btn-primary"
					onclick="location.href='/makeboard/board/edit.do?seq=${dto.seq}';">
				
				<input type="button" value="삭제하기"
					class="btn btn-primary"
					onclick="location.href='/makeboard/board/del.do?seq=${dto.seq}';">
				</c:if>						
			</div>
			</form>
			
			
		</section>
		<%@include file="/WEB-INF/views/inc/footer.jsp" %>
	</main>
	
	<script>
	
	</script>
</body>
</html>






