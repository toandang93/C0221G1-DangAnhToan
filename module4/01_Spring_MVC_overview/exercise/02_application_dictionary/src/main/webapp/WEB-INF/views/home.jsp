<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/13/2021
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="abc" method="post">
    <table border="1">
        <tr>
            <th>Input text</th>
            <th>Check</th>
            <th>Result</th>
        </tr>
        <tr>
            <th><input type="text" name="input"></th>
            <th><input type="submit" value="translate"></th>
            <th><input type="text" readonly value="${result}"></th>
        </tr>
    </table>
</form>
</body>
</html>
