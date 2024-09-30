<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 9/29/2024
  Time: 11:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>UserData</h1>
<table>
<tr>
    <th>id</th>
    <th>name</th>
    <th>email</th>
    <th>age</th>

</tr>

    <c:forEach items="${userDataList}" var="userData">
         <tr>
             <td>${userData.id}</td>
             <td>${userData.name}</td>
             <td>${userData.email}</td>
             <td>${userData.age}</td>
         </tr>
    </c:forEach>


</table>

</body>
</html>
