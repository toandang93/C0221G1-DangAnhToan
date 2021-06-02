<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/2/2021
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../bootraps_min/bootstrap.min.css">
    <link rel="stylesheet" href="../../bootraps_min/dataTables.bootstrap.min.css">
</head>
<body>
<div class="container-fluid align-items-center justify-content-between d-flex mb-3"
     style="background: #085F56;height: 60px">
    <div class=""><img src="../../img/FURAMA.png" height="60" width="60"/></div>
    <h1 class="d-flex justify-content-center text-white">Service List</h1>
    <p class="mr-4" style="color: white;font-size: larger">Đặng Anh Toàn</p>
</div>

<div class="container-fluid -3 mb-3 d-flex align-items-center justify-content-between"
     style="background: #085F56;height: 60px">
    <div class="d-flex justify-content-around " style="width: 100%">
        <a href="/view/home/home.jsp" style="color: white">Home</a>
        <a href="#" style="color: white">Employee</a>
        <a href="#" style="color: white">Customer</a>
        <a href="#" style="color: white">Service</a>
        <a href="#" style="color: white">Contract</a>
        <a href="#" style="color: white">Contract Detail</a>
    </div>
</div>


<div class="d-flex justify-content-between my-3">
    <a href="/customers?action=create" class="btn btn-info" style="border-radius: 5px">Create new customer</a>
    <form action="/customers?action=search" class="form-inline my-2 my-lg-0 d-flex" method="post">
        <input class="form-control mr-sm-2" type="text" placeholder="Search" name="searchName">
        <button class="btn btn-info my-2 my-sm-0" type="submit">Search</button>
    </form>
</div>

<!--content body-->
<div class="container-fluid ">
    <div class="row">
        <table  id="tableCustomer" class="table table-striped table-bordered " >
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Area</th>
                <th scope="col">Cost</th>
                <th scope="col">Max People</th>
                <th scope="col">Rent type</th>
                <th scope="col">Service type</th>
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
                    <td><a class="btn btn-info" href="/customers?action=show&id=${customer.id}">Show</a></td>
                    <td><a class="btn btn-warning" href="/customers?action=edit&id=${customer.id}">Edit</a></td>
                    <td>
                        <button type="button"  class="btn btn-danger buttonDelete" data-toggle="modal"
                                data-target="#exampleModal">
                            Delete
                        </button>
                        <input type="hidden" id="idInput" value="${customer.id}">
                    </td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
</div>

<!-- Modal delete -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/customers?action=delete" method="post">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Delete customer</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    Do you want to delete customer
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                    <input type="hidden" id="idDelete" name="customerId">
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../../bootraps_min/jquery-3.6.0.min.js"></script>
<script src="../../bootraps_min/jquery.dataTables.min.js"></script>
<script src="../../bootraps_min/dataTables.bootstrap4.min.js"></script>
<script src="../../bootraps_min/popper.min.js"></script>
<script src="../../bootraps_min/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5,

        });
    });
    $(document).ready(function () {
        $('.buttonDelete').on('click',function () {
            let id = $(this).parent().find('#idInput').val();
            $('#idDelete').val(id);
        })
    })
</script>
</body>
</html>
