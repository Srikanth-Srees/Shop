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

<table>
<tr>
<th>ID <th>
<th>Name </th>
<th>Email<th>
<th>Phone</th>
<th>Delete</th>

</tr>

<p:foreach items="${prodlist}" var= "Prod"></p:foreach>

<tr>

<td><p:out value="${prod.rid}"></p:out></td>
<td><p:out value="${prod.Name}"></p:out></td>
<td><p:out value="${prod.Email}"></p:out></td>
<td><p:out value="${prod.Phone}"></p:out></td>
<td><a href="DeleteServlet?rid="${prod.rid}></a>Delete</td>
</tr>

</table>

</body>
</html>