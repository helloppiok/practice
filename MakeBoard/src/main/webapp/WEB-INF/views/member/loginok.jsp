<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello ppiok</title>
<%@ include file="/WEB-INF/views/inc/asset.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>



</style>
</head>
<body>
   	<!-- member/loginok.jsp -->
  	  	<main class="main">
  		<%@include file="/WEB-INF/views/inc/header.jsp" %>
  		<section class="content">
		  		
  		
  			${not empty id} <!-- true : 로그인 성공상태 -->
  				
  		
  		</section>
  		<%@include file="/WEB-INF/views/inc/footer.jsp" %>
  		
  	</main>
  	

	<script>
	
		<c:if test="${not empty id}">
			location.href = '/makeboard/member/member.do';
		</c:if>
		
		<c:if test="${empty id}">
			alert('로그인실패');
			history.back();
		</c:if>
		
	</script>
</body>
</html>

