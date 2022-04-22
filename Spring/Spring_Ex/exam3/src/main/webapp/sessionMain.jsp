<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %>
<%
  Date now = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

</head>
<body>
<h3>세션 정보 구하기</h3>
세션 ID : <%= session.getId() %> </br>
세션 시간 : <%= session.getCreationTime()/(int)(Math.pow(10, 9)) %> </br>
현재 시간 : <%= now %></br>
</body>
</html>