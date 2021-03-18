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
        <th>Id</th>
        <th>Name</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${manData}" var="manufacture">
        <tr>
            <td>${manufacture.MId}</td>
            <td>${manufacture.MName}</td>
            <td>${manufacture.MCountry.name}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
