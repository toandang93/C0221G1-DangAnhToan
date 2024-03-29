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
    <link rel="stylesheet" href="../../bootraps_min/bootstrap.min.css">
</head>
<body>
<div class="container-fluid -3 mb-3 d-flex align-items-center justify-content-between"
     style="background: #085F56;height: 60px">
    <div><img src="../../img/FURAMA.png" height="60" width="60"/></div>
    <div class="d-flex justify-content-around " style="width: 100%">
        <a href="/view/home/home.jsp" style="color: white">Home</a>
        <a href="/employees" style="color: white">Employee</a>
        <a href="/customers" style="color: white">Customer</a>
        <a href="/services" style="color: white">Service</a>
        <a href="/contracts?action=create" style="color: white">Contract</a>
        <a href="/details?action=create" style="color: white">Contract Detail</a>
    </div>
</div>
<div class="container-fluid d-flex justify-content-center">
    <h1>Create New Employee</h1>
</div>
<div>
    <c:if test="${message!=null}">
        <p class="text-success">${message}</p>
    </c:if>
</div>
<div class="container d-flex ">
    <form action="/employees?action=create" style="width: 70%;margin-left: 155px" method="post">
        <div class="form-group row">
            <label for="inputName" class="col-sm-3 col-form-label">Employee Name</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="inputName" name="name">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputDate" class="col-sm-3 col-form-label">Date</label>
            <div class="col-sm-6">
                <input type="date" class="form-control" id="inputDate" name="date">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputIdCard" class="col-sm-3 col-form-label">Id card</label>
            <div class="col-sm-6">
                <input type="number" class="form-control" id="inputIdCard" name="idCard">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputSalary" class="col-sm-3 col-form-label">Salary</label>
            <div class="col-sm-6">
                <input type="number" class="form-control" id="inputSalary" name="salary">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputPhone" class="col-sm-3 col-form-label">Phone</label>
            <div class="col-sm-6">
                <input type="number" class="form-control" id="inputPhone" name="phone">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputEmail" class="col-sm-3 col-form-label">Email</label>
            <div class="col-sm-6">
                <input type="email" class="form-control" id="inputEmail" name="email">
            </div>
        </div>
        <div class="form-group row">
            <label for="inpurAddress" class="col-sm-3 col-form-label">Address</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="inpurAddress" name="address">
            </div>
        </div>
        <div class="form-group row">
            <label for="inputType" class="col-sm-3 col-form-label">Position</label>
            <div class="col-sm-6">
                <select name="position" id="inputType">
                    <c:forEach items="${positions}" var="position">
                        <option value="${position.id}">${position.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label for="inputType1" class="col-sm-3 col-form-label">Education degree</label>
            <div class="col-sm-6">
                <select name="education" id="inputType1">
                    <c:forEach items="${educations}" var="education">
                        <option value="${education.id}">${education.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label for="inputType2" class="col-sm-3 col-form-label">Division</label>
            <div class="col-sm-6">
                <select name="division" id="inputType2">
                    <c:forEach items="${divisions}" var="division">
                        <option value="${division.id}">${division.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label for="inputType3" class="col-sm-3 col-form-label">User Name</label>
            <div class="col-sm-6">
                <select name="userName" id="inputType3">
                    <c:forEach items="${users}" var="user">
                        <option value="${user.userName}">${user.userName}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="d-flex ">
            <a href="/employees" class="btn btn-secondary" style="margin-left: 200px">Back to list</a>
            <input type="submit" class="btn btn-success" style="margin-left: 174px;width: 100px" value="Create">
        </div>

    </form>
</div>

<script src="../../bootraps_min/jquery-3.6.0.min.js"></script>
<script src="../../bootraps_min/popper.min.js"></script>
<script src="../../bootraps_min/bootstrap.min.js"></script>
</body>
</html>
