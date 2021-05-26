<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/26/2021
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/display-discount" method="post">
    Product Description
    <input type="text" name="product-name" placeholder="Mô tả sản phẩm"></br>
    List Price
    <input type="text" name="product-price" placeholder="Giá sản phẩm"></br>
    Discount Percent
    <input type="text" name="product-discount" placeholder="Tỷ lệ chiếc khấu">
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>
