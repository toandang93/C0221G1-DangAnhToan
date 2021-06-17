<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/13/2021
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<div style="display: flex;justify-content: center;text-align: center"><h3>LIST STUDENT</h3></div>
<div>
    <a href="/students?action=create">Create student</a>
</div>

<table border="1">
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Age</th>
        <th>Class</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>

    <c:forEach items="${students}" var="student" varStatus="status">

        <tr id="abc${student.id}">
                <th>${status.count}</th>
                <th>
                    <input type="text" readonly name="name" value="${student.name}" id="name${student.id}">
                </th>
                <th>
                    <input type="number" readonly name="age" value="${student.age}" id="age${student.id}">
                </th>
                <c:forEach items="${classlist}" var="temp">
                    <c:if test="${student.idClass == temp.id}">
                        <th><input type="text" readonly value="${temp.name}"></th>
                    </c:if>
                </c:forEach>
                <th>
                    <button id="btEdit${student.id}" onclick="editStudent('${student.id}')">Edit</button>

                    <div id="saveEdit${student.id}" style="display: none">
                       <button onclick="sendData('${student.id}')">Save</button>
                    </div>
                </th>
                <th><a href="">Delete</a></th>
        </tr>

    </c:forEach>

</table>
<form action="/students?action=edit" method="post" id="autoEdit" hiden>
    <input type="text" id="receive1" name="receive1" hidden>
    <input type="text" id="receive2" name="receive2" hidden>
    <input type="text" id="receive3" name="receive3" hidden>

</form>
<script>
       function editStudent(id) {
        document.getElementById("name" + id).readOnly = false;
        document.getElementById("age" + id).readOnly = false;
        document.getElementById("btEdit" + id).style.display = "none";
        document.getElementById("saveEdit" + id).style.display = "block";
    }
    function sendData(id) {
           let name = document.getElementById("name"+id).value;
           let age = document.getElementById("age"+id).value;
           document.getElementById("receive1").value = id;
           document.getElementById("receive2").value = name;
           document.getElementById("receive3").value = age;
           document.getElementById("autoEdit").submit();
    }
</script>

</body>
</html>
