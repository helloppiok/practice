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
	<!-- board/addok.jsp > board/editok.jsp > board/delok.jsp -->
	<main class="main">
		<%@include file="/WEB-INF/views/inc/header.jsp" %>
		<section class="content">
			
		</section>
		<%@include file="/WEB-INF/views/inc/footer.jsp" %>
	</main>
	
	<script>
	
		<c:if test="${result == 1}">
		//성공
		location.href = '/makeboard/board/list.do';
		</c:if>
		
		<c:if test="${result == 0}">
		//실패
		alert('failed');
		history.back();
		</c:if>
	
	</script>
</body>
</html>







