<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title></title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css"
	href="/resource/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="/resource/css/index.css">
<!-- 引入js -->
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<!-- 引入js -->
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table">
		<tr>
			<td>序号</td>
			<td>名称</td>
			<td>价格</td>
			<td>生产日期</td>
			<td>审核状态</td>
		</tr>
		<c:forEach items="${goods}" var="g" varStatus="i">
		  <tr>
		    <td>${i.count }</td>
		    <td>${g.name }</td>
		    <td>${g.price }</td>
		    <td>${g.date }</td>
		    <td>${g.status.name }</td>
		  </tr>
		</c:forEach>

	</table>
</body>
</html>