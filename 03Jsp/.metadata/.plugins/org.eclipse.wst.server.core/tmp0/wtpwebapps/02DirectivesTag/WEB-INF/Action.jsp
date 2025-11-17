<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Using jsp:useBean Example</title>
</head>
<body>

<!-- Display current date -->
Current Date and Time: <%= new Date() %> <br><br>

<!-- Create and use Student bean -->
<jsp:useBean id="s" class="com.manhattan.Student" scope="page" />

<!-- Call the method on the bean -->
<jsp:getProperty name="s" property="show" />

</body>
</html>
