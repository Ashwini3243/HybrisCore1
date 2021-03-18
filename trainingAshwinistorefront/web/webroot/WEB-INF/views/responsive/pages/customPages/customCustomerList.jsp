<%--
  Created by IntelliJ IDEA.
  User: Ashwini
  Date: 2/9/2021
  Time: 5:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Customer Name</th>
        <th>Customer Num</th>
        <th>Customer age</th>
        <th>Customer created</th>
    </tr>
    <c:forEach items="${customerData}" var="Data">
        <tr>
            <td>${Data.customerCreated}</td>
            <td>${Data.CName}</td>
            <td>${Data.phone}</td>
            <td>${Data.newCustomer}</td>
        </tr>
    </c:forEach>
</table>
<c:forEach var="i" begin="0" end="10">
    <a href="${i}">${i}</a>
</c:forEach>
</body>
</html>
