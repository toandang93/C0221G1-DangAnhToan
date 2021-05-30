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
<body style="background-image: url('../img/background1.jpg')">
<div class="container-fluid align-items-center justify-content-between d-flex  ">
    <div class=""><img src="../img/FURAMA.png" height="60" width="60"/></div>
</div>
<h1 class="d-flex justify-content-center">Customer List</h1>

<button class="bg-success ml-3" href="/customers?action=create">Create new customer</button>
<!--content body-->
<div class="container-fluid">
    <div class="row">
        <table class="table">
            <thead>
            <tr>
                <th scope="col">STT</th>
                <th scope="col">Name</th>
                <th scope="col">Date</th>
                <th scope="col">Gender</th>
                <th scope="col">Id card</th>
                <th scope="col">Phone</th>
                <th scope="col">Email</th>
                <th scope="col">Type Customer</th>
                <th scope="col">Address</th>
                <th scope="col">Show</th>
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row"></th>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
                <td>@mdo</td>
                <td>@mdo</td>
                <td>@mdo</td>
                <td>@mdo</td>
                <td>@mdo</td>
                <td><a class="btn btn-info" href="/customers?action=view$id=">Show</a></td>
                <td><a class="btn btn-warning" href="/customers?action=edit&id">Edit</a></td>
                <td><a class="btn btn-danger" href="/customers?action=delete&id">Delete</a></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<script src="../bootraps_min/jquery-3.6.0.min.js"></script>
<script src="../bootraps_min/popper.min.js"></script>
<script src="../bootraps_min/bootstrap.min.css"></script>
</body>
</html>
