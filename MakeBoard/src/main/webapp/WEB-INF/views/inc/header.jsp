<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	.title:first-letter {
		
		<c:if test="${not empty id}">
		color: #c9184a;
		</c:if>
		
	}
</style>

<!-- inc/header.jsp -->
<header class="header">

	<h1 class="title" onclick="location.href='/makeboard/main.do';">Hello ppiok</h1>
	
	<ul class="menu">
		<li onclick="location.href='/makeboard/main.do';">Home</li>
		<li onclick="location.href='/makeboard/board/list.do';">Board</li>
		<li onclick="location.href='/makeboard/member/member.do';">Member</li>
		<li onclick="location.href='/makeboard/etc/?';">Etc</li>
	</ul>

</header>
