<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 9/29/2024
  Time: 10:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="display-discount" method="POST">
    <label for="description">Product Description:</label>
    <input type="text" id="description" name="description"><br><br>

    <label for="price">Price:</label>
    <input type="number" id="price" name="price" ><br><br>

    <label for="discountPercent">Discount Percent:</label>
    <input type="number" id="discountPercent" name="discountPercent" ><br><br>

    <input type="submit" value="Calculate Discount">
</form>
</body>
</html>
