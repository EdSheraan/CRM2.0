<%-- 
    Document   : login
    Created on : 02/10/2017, 05:43:19 PM
    Author     : Leandro Burgos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRM Digital</title>
        <%@include file="../../jspf/general.jspf" %>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="f" action="/login" method="POST">
            <table>
                <tbody><tr><td>User:</td><td><input type="text" name="username" value=""></td></tr>
                    <tr><td>Password:</td><td><input type="password" name="password"></td></tr>
                    <tr><td colspan="2"><input name="submit" type="submit" value="Login"></td></tr>
                <input name="_csrf" type="hidden" value="8f3d1d37-48b1-4997-bd1f-e01f94e18051">
                </tbody></table>
        </form>
    </body>
</html>
