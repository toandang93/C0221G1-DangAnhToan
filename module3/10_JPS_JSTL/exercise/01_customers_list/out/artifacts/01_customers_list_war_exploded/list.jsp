<%@ page import="customer.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="customer.Control" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/26/2021
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>$Title$</title>

  <link rel="stylesheet" href="bootraps_min/bootstrap.min.css">

</head>
<body>
<%--<%--%>
<%--  List<Customer> customers = Control.add();--%>
<%--  request.setAttribute("temp",customers);--%>
<%--%>--%>
<div class="container">
  <table class="table">
    <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${temp}" var="customer" >
      <tr>
        <th scope="row">${customer.name}</th>
        <td>${customer.date}</td>
        <td>${customer.address}</td>
        <td><img style="width: 50px;height: 50px" src="${customer.img}" alt=""></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>



</body>
</html>
