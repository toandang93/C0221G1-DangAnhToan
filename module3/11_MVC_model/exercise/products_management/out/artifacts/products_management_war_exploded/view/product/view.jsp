<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/28/2021
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Id: </td>
        <td>${products.getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${products.getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${products.getPrice()}</td>
    </tr>
    <tr>
        <td>Describe: </td>
        <td>${products.getDescribe()}</td>
    </tr>
    <tr>
        <td>Producer: </td>
        <td>${products.getProducer()}</td>
    </tr>
</table>
</body>
</html>
