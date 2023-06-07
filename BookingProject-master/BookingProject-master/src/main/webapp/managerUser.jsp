<%-- 
    Document   : managerUser
    Created on : Jun 6, 2023, 11:11:08 AM
    Author     : linh2
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aloo</h1>
        <c:forEach items="${listU}" var ="x">
        <tr>
            <td>${x.idUser}</td>
            <td>${x.name}</td>
            <td>${x.age}</td>
            <td>${x.sex}</td>
            <td>${x.address}</td>
            <td>${x.phone}</td>
            <td>${x.email}</td>
            <td>${x.isType}</td>
        </tr>
        </c:forEach>
    </body>
</html>
