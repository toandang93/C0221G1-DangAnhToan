<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/30/2021
  Time: 6:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
    <link rel="stylesheet" href="../bootraps_min/bootstrap.min.css">
</head>
<body >
<div class="container-fluid align-items-center justify-content-between d-flex mb-3" style="background: #085F56;height: 60px">
    <div class=""><img src="../img/FURAMA.png" height="60" width="60"/></div>
    <h1 class="d-flex justify-content-center text-white" >Customer List</h1>
    <p id="name" class="mr-4" style="color: white;font-size: larger">Đặng Anh Toàn</p>
</div>

<div class="container-fluid -3 mb-3 d-flex align-items-center justify-content-between" style="background: #085F56;height: 60px">
    <div class="d-flex justify-content-around " style="width: 100%">
        <a href="#" style="color: white">Home</a>
        <a href="#" style="color: white">Employee</a>
        <a href="#" style="color: white">Customer</a>
        <a href="#" style="color: white">Service</a>
        <a href="#" style="color: white">Contract</a>
    </div>
</div>


<!--modal create customer-->
<div class="d-flex justify-content-between my-3">
    <a href="#" class="btn btn-info" style="border-radius: 5px">Create new customer</a>
    <form class="form-inline my-2 my-lg-0 d-flex">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-info my-2 my-sm-0" type="submit">Search</button>
    </form>
</div>

<!--content body-->
<div class="container-fluid">
    <div class="row">
        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Type Customer</th>
                <th scope="col">Date</th>
                <th scope="col">Gender</th>
                <th scope="col">Id card</th>
                <th scope="col">Phone</th>
                <th scope="col">Email</th>
                <th scope="col">Address</th>
                <th scope="col">Show</th>
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${customers}" var="customer">
                <tr>
                    <th scope="row">${customer.id}</th>
                    <td>${customer.name}</td>
                    <td>${customer.customerTypeName}</td>
                    <td>${customer.birthday}</td>
                    <td>${customer.gender}</td>
                    <td>${customer.idCard}</td>
                    <td>${customer.phone}</td>
                    <td>${customer.email}</td>
                    <td>${customer.address}</td>
                    <td><a class="btn btn-info" href="#">Show</a></td>
                    <td><a class="btn btn-warning" href="#">Edit</a></td>
                    <td><a class="btn btn-danger" href="#">Delete</a></td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>

<script src="../bootraps_min/jquery-3.6.0.min.js"></script>
<script src="../bootraps_min/popper.min.js"></script>
<script src="../bootraps_min/bootstrap.min.css"></script>
</body>
</html>
