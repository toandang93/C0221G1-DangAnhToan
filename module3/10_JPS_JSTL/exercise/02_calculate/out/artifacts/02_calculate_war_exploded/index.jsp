<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/27/2021
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Simple Calculate</h1>
  <form action="/calculator" method="get">
    <table>
      <tr>
        <th>First operand</th>
        <td><input type="number" name="first"></td>
      </tr>
      <tr>
        <th>Operator</th>
        <td>
          <select name="operator" id="">
            <option value="Addition">Addition</option>
            <option value="Subtraction">Subtraction</option>
            <option value="Multiplication">Multiplication</option>
            <option value="Division">Division</option>
          </select>
        </td>
      </tr>
      <tr>
        <th>Second operand</th>
        <td><input type="number" name="second"></td>
      </tr>
    </table>
    <input type="submit" value="Calculate">
  </form>
  </body>
</html>
