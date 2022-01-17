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
			
		</section>
		<%@include file="/WEB-INF/views/inc/footer.jsp" %>
	</main>
	
	<script>
	<c:if test="${result == 1}">
	location.href = '/makeboard/board/list.do';
	</c:if>
	
	<c:if test="${result == 0}">
	alert('failed');
	history.back();
	</c:if>

	
	</script>
</body>
</html>