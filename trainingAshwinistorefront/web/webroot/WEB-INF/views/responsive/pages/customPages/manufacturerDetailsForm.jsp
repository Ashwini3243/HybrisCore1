<%--
  Created by IntelliJ IDEA.
  User: Ashwini
  Date: 2/22/2021
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css">
<title>ManufacturerDetails</title>
<style type="text/css">
    .error{
        color: red;
    }
    body {
        height: 100vh;
        background: #efefef;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
    }
</style>
<c:url value="addManuDataFormAction" var="formUrl"/>
<form:form modelAttribute="mDetailsForm" action="${formUrl}" method="POST"  >
    <style>
        .error{
            color: darkblue;
        }
        .h1{
            color: blue;
        }
    </style>
    <h3 class="h1">Manufacturer Details </h3>
    <table>
        <tr>
            <td>Manufacturer ID  : </td>
            <td><form:input path="mId" /></td>
           <%-- <td> <form:errors path="bookId"  cssClass="error"  ></form:errors></td>--%>
        </tr>
        <tr>
            <td>Manufacturer Name  :</td>
            <td><form:input path="mName"   /></td>
           <%-- <td> <form:errors path="bookName" cssClass="error"  ></form:errors></td>--%>
        </tr>
        <tr>
            <td>Manufacturer country  :</td>
            <td><form:input path="mCountry" /></td>
            <%--<td> <form:errors path="language" cssClass="error"  ></form:errors></td>--%>
        </tr>
        <tr>
            <td><input type="submit" value="save"  style="color: black"></td>
        </tr>
    </table>
</form:form>