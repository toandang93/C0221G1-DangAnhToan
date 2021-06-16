<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/15/2021
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator">
    <h3>Calculator</h3>

    <input type="number" name="num1" placeholder="input number">
    <input type="number" name="num2" placeholder="input number"></br></br>

<%--    <input type="submit" value="Addition">--%>
<%--    <input type="submit" value="Subtraction">--%>
    <div>
        <button type="submit" value="+" name="calculator">Addition</button>
        <button type="submit" value="-" name="calculator">Subtraction</button>
        <button type="submit" value="*" name="calculator">Multiplication</button>
        <button type="submit" value="/" name="calculator">Division</button>
        </br></br>
        <span>Result ${result}</span>
    </div>
</form>
</body>
</html>
