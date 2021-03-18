
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ManufacturerDetails data</title>
</head>
<body>
<h3 style="color: navy">Manufacturer Details:-</h3>

<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>country</th>
    </tr>
        <tr>
            <td>${manData.MId}</td>
            <td>${manData.MName}</td>
            <td>${manData.MCountry.name}</td>
        </tr>
</table>
</body>
</html>
