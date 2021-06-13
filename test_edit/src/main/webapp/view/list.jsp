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
<%--<div>--%>
<%--    <p>Bạn có muốn lưu thay đổi không</p>--%>
<%--    <form action="">--%>
<%--        <input type="hidden" id="sendName" name="sendName">--%>
<%--        <input type="hidden" id="sendAge" name="sendAge">--%>
<%--        <a href="/students">Không</a>--%>
<%--        <input type="submit" value="Có">--%>
<%--    </form>--%>
<%--</div>--%>
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
                    <input type="text" readOnly name="name" value="${student.name}" id="name${student.id}">
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

<%--                    <div id="saveEdit${student.id}" style="display: none">--%>
<%--                        <input--%>
<%--                                type="submit"--%>
<%--                                value="Save">--%>
<%--                    </div>--%>
                </th>
                <th><a href="">Delete</a></th>
        </tr>

    </c:forEach>

</table>

<script>
    function test() {
        document.getElementById("test123").readOnly = false;
    }

    function editStudent(id) {
        document.getElementById("name" + id).readOnly = false;
        document.getElementById("age" + id).readOnly = false;
        document.getElementById("btEdit" + id).style.display = "none";
        // document.getElementById("saveEdit" + id).style.display = "block";

    }
</script>

</body>
</html>
