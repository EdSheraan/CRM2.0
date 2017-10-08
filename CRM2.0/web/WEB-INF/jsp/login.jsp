<%-- 
    Document   : login
    Created on : 02/10/2017, 05:43:19 PM
    Author     : Leandro Burgos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRM Digital</title>
        <%@include file="../jspf/general.jspf" %>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="f" action="<c:url value="/j_spring_security_check"/>" method="POST">
            <table>
                <tbody><tr><td>User:</td><td><input type="text" name="username" value=""></td></tr>
                    <tr><td>Password:</td><td><input type="password" name="password"></td></tr>
                    <tr><td colspan="2"><input name="submit" type="submit" value="Login"></td></tr>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                </tbody></table>
        </form>
    </body>
</html>
