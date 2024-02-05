<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserServlet" method "post">


Enter Email : <input type="email" mame="email" ><br>
Enter password: <input type="password" mame="password" ><br>

<input type="submit" value = "login">

</form>
<a href="register.jsp"><button style="width:100px" height="30px" font-size=14px></button></a>

<form action="AdminServlet" method "post">


Enter Email : <input type="email" mame="email" ><br>
Enter password: <input type="password" mame="password" ><br>

<input type="submit" value = "login">
</body>
</html>