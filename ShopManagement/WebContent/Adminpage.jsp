<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<% BLManager br = new BLManager();

List <Addproduct> prodlist = br.showproduct();

HttpSession s1= request.getSession();

s1.SetAttribute("reglist", reglist);

%>
</head>
<body>

<h2>Welcome Admin</h2>
<h3>Register Users</h3>
<form action="UserRegisterList.jsp">

<input type="Submit" value="view">

</form>
<h3>Add Product</h3>
<form action="Addproducts.jsp">

<input type="Submit" value="Insert">

</form>

</body>
</html>