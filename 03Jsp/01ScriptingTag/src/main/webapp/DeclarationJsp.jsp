<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- declaration tag --%>

<%-- Instance Variable --%>

<%! int id=101;
String name="vamsi";
%>

<%--Printing Variable through Expression--%>

<%=id %>
<%=name %>

<%-- Printing Variable through scriptlet --%>

<%out.print("</br> Employee Details"); 
out.print("</br> Id: "+ id);
out.print("</br> Name: "+name);
%>

</body>
</html>