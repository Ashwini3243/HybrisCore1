<%--
  Created by IntelliJ IDEA.
  User: Ashwini
  Date: 2/15/2021
  Time: 1:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
<head>
    <title>pages</title>
</head>
<body>
<h1>ManufacturerDetails Data</h1>
<c:forEach var="i" begin="0" end="10">
    <a href="manufacturerDetailsList/${i}">${i}</a>
</c:forEach>


</body>
</html>
