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
    <link rel="stylesheet" href="../../bootraps_min/bootstrap.min.css">
    <link rel="stylesheet" href="../../bootraps_min/dataTables.bootstrap.min.css">
</head>
<body>
<div class="container-fluid align-items-center justify-content-between d-flex mb-3"
     style="background: #085F56;height: 60px">
    <div class=""><img src="../../img/FURAMA.png" height="60" width="60"/></div>
    <h1 class="d-flex justify-content-center text-white">Employee List</h1>
    <p class="mr-4" style="color: white;font-size: larger">Đặng Anh Toàn</p>
</div>



<div class="d-flex justify-content-between my-3">
    <a href="/employees?action=create" class="btn btn-info" style="border-radius: 5px">Create New Employee</a>
    <form action="/employees?action=search" class="form-inline my-2 my-lg-0 d-flex" method="post">
        <input class="form-control mr-sm-2" type="text" placeholder="Search" name="searchName">
        <button class="btn btn-info my-2 my-sm-0" type="submit">Search</button>
    </form>
</div>

<!--content body-->
<div class="container-fluid">
    <div class="row">
        <table id="tableCustomer" class="table table-striped table-bordered" style="width: 100%">
            <thead>
            <tr>
                <th scope="col">STT</th>
                <th scope="col">Employee Code</th>
                <th scope="col">Name</th>
                <th scope="col">Date</th>
                <th scope="col">Show</th>
                <th scope="col">Edit</th>
                <th scope="col">Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${employees}" var="employee" varStatus="status">
                <tr>
                    <th scope="row">${status.count}</th>
                    <th>${employee.code}</th>
                    <td>${employee.name}</td>
                    <td>${employee.birthday}</td>
                    <td><a class="btn btn-info" href="/employees?action=show&code=${employee.code}">Show</a></td>
                    <td><a class="btn btn-warning" href="/employees?action=edit&code=${employee.code}">Edit</a></td>
                    <td>
                        <button type="button" class="btn btn-danger buttonDelete" data-toggle="modal"
                                data-target="#exampleModal" onclick="sendData('${employee.code}','${employee.name}')">
                            Delete
                        </button>
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
            <form action="/employees?action=delete" method="post">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Delete customer</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    Do you want to delete <span id="employeeName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                    <input type="hidden" id="codeDelete" name="employeeCode">
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
    // $(document).ready(function () {
    //     $('.buttonDelete').on('click',function () {
    //         let id = $(this).parent().find('#idInput').val();
    //         $('#idDelete').val(id);
    //     })
    // })
    function sendData(code,name) {
        document.getElementById("codeDelete").value = code;
        document.getElementById("employeeName").innerText = name;
    }
</script>

</body>
</html>
