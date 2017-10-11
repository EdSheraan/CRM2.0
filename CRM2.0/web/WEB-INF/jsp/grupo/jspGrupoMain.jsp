<%-- 
    Document   : grupoView
    Created on : 09/10/2017, 11:40:42 PM
    Author     : Leandro Burgos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../jspf/general.jspf" %>
    </head>
    <body>
        <%@include file="../../jspf/header.jspf" %>
        <h1>Hello World!</h1>
        <script src="<c:url value="/resources/js/service/jsGrupoService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsGrupo.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
