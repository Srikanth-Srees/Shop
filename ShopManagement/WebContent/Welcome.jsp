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

s1.SetAttribute(" prodlist", prodlist);

%>

</head>
<body>



<h1> product ready to be purchased </h1>

<table>
<tr>
<th>product ID <th>
<th>product Name </th>
<th>product price<th>
<th>product Status</th>
</tr>

<p:foreach items="${prodlist}" var= "Prod"></p:foreach>

<tr>

<th><p:out value="${prod.productid}"></p:out></td>
<th><p:out value="${prod.productName}"></p:out></td>
<th><p:out value="${prod.productPrice}"></p:out></td>
<th><p:out value="${prod.productStatus}"></p:out></td>
</tr>

</table>
</body>
</html>