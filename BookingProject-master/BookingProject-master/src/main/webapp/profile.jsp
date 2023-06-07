<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css_1/profile.css">
        <title>Profile</title>
    </head>
    <body>
        <div class="form_register">
            <div>
                <a href="home.jsp" class="backhome">X</a>
            </div>
            <h1 class="register_heading">Information</h1>
            <img src="images/Avatar-trang.jpg" alt="Profile Picture" class="profile-pic">
            <form action="ShowProfile" method="post" class="cal">
                <center>
                    <c:set var="check" value="p${listAcc.getId()}"></c:set>
                    <input style="display: none" value="${check}" type="text" id="id" name="id"><br><br>
                    <h1 class="name">${listAcc.getUsername()}</h1>
                </center>
                <input style="display: none" value="${listAcc.getUsername()}" type="text" class="register_input" name="username">
                <lable class="register_text">Password</lable>
                <input value="${listAcc.getPassword()}"  type="text" class="register_input" name="password">
                <lable class="register_text">Email</lable>
                <input value="${listAcc.getEmail()}" type="text" class="register_input" name="email">
                <lable class="register_text">Phone</lable>
                <input value="${listAcc.getPhone()}" type="text" class="register_input" name="phone">
                <button class="register_btn" type="submit">Update</button>
            </form>
        </div>  
    </body>
    
</html>