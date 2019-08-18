<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查询所有用户信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <div>用户信息</div>
   	<div>
   		<table border="1">
   			<tr>
   				<th>序号</th>
   				<th>姓名</th>
   				<th>性别</th>
   				<th>年龄</th>
   				<th>住址</th>
   			</tr>
   			<tr>
   			<c:forEach items="${allUserInfo}" var="u">
   			<tr>
   				<td>${u.id}</td>
   				<td>${u.name}</td>
   				<td>${u.sex}</td>
   				<td>${u.age}</td>
   				<td>${u.add}</td>
   			</tr>
   			</c:forEach>
   			</tr>
   		</table>
   	</div>
  </body>
</html>
