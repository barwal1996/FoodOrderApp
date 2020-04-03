<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.niit.demo.UserDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userBean" class="com.niit.demo.User"></jsp:useBean>
<jsp:setProperty property ="*" name = "userBean"/>
<%

int i = UserDao.register(userBean);
if(i>0)
	out.println("Successfull");


%>
</body>
</html>