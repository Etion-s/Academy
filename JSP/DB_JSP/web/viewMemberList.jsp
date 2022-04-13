<%--
  Created by IntelliJ IDEA.
  User: ehdgu
  Date: 2022-02-23
  Time: 오후 4:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
MEMBER 테이블의 내용
<table width="100%" border="1">
    <tr>
        <td>이름</td><td>아이디</td><td>이메일</td>
    </tr>
    <%
        Class.forName("oracle.jdbc.driver.OracleDriver");


        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            String jdbcDriver = "jdbc:oracle:thin:@localhost:1521:xe";
            String dbUser = "ez";
            String dbPass = "0000";

            String query ="select * from MEMBER oredr by MEMBERID";

            conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()){
    %>
    <tr>
        <td><%= rs.getString("NAME")%></td>
        <td><%= rs.getString("MEMBERID")%></td>
        <td><%= rs.getString("EMAIL")%></td>
    </tr>
    <%
          }
       } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
       } finally {
            if (rs != null) try{rs.close();} catch(SQLException ex){}
            if (stmt != null) try{stmt.close();} catch(SQLException ex){}
            if (conn != null) try{conn.close();} catch(SQLException ex){}
          }
    %>
</table>
</body>
</html>
