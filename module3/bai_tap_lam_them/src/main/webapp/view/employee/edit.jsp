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
    <title>Title</title>
    <style>
        small{
            color: red;
        }
    </style>
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="../../bootraps_min/bootstrap.min.css">

</head>
<body>

<div class="container-fluid d-flex justify-content-center">
    <h1>Edit Customer</h1>
</div>
<div>
    <c:if test="${message!=null}">
        <h3 class="text-success">${message}</h3>
    </c:if>
</div>
<div class="container d-flex ">
    <form action="/employees?action=edit" style="width: 70%;margin-left: 155px" method="post">
        <div class="form-group row">
            <label for="inputCode" class="col-sm-3 col-form-label">Employee Code</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="inputCode" name="code" readonly value="${employee.code}">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputName" class="col-sm-3 col-form-label">Employee Name</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="inputName" name="name" value="${employee.name}">
                <small>${errList.get(0)}</small>
            </div>
        </div>
        <div class="form-group row">
            <label for="inputDate" class="col-sm-3 col-form-label">Date</label>
            <div class="col-sm-6">
                <input type="date" class="form-control" id="inputDate" name="date" value="${employee.birthday}">
                <small>${errList.get(1)}</small>
            </div>
        </div>
        <div class="d-flex ">
            <a href="/employees" class="btn btn-secondary" style="margin-left: 200px">Back to list</a>
            <input type="submit" class="btn btn-success" style="margin-left: 174px;width: 100px" value="Edit">
        </div>

    </form>
</div>

<script src="../../bootraps_min/jquery-3.6.0.min.js"></script>
<script src="../../bootraps_min/popper.min.js"></script>
<script src="../../bootraps_min/bootstrap.min.js"></script>
</body>
</html>
