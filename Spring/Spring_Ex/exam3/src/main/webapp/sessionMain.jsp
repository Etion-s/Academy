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
<h3>���� ���� ���ϱ�</h3>
���� ID : <%= session.getId() %> </br>
���� �ð� : <%= session.getCreationTime()/(int)(Math.pow(10, 9)) %> </br>
���� �ð� : <%= now %></br>
</body>
</html>