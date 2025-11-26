<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login_proc</title>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if("siu".equals(id)&&"siu".equals(pwd)){
	session.setAttribute("id", id);
	response.sendRedirect("../index.jsp");
}else{
	response.sendRedirect("./login.jsp");
}
%>


</head>
<body>

</body>
</html>