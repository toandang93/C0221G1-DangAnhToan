<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/13/2021
  Time: 9:31 AM
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
            <th>Input money need to change</th>
            <th>Money</th>
            <th>To Money</th>
            <th>Result</th>
        </tr>
        <tr>
            <th>
                <input type="number" name="money" placeholder="Money need to change">
            </th>
            <th>
                <select name="typeMoney">
                    <option value="23000">VND</option>
                    <option value="1">USD</option>
                </select>
            </th>
            <th>
                <select name="typeMoney1">
                    <option value="1">USD</option>
                    <option value="23000">VND</option>
                </select>
            </th>
            <th>
                <input type="submit" value="Convert">
                <input type="text" name="result" readonly value="${result}">
            </th>
        </tr>
    </table>
</form>
</body>
</html>
