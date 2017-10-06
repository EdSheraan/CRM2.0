<%-- 
    Document   : jspPersona
    Created on : 05/10/2017, 04:51:20 PM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <%@include file="../../jspf/general.jspf" %>
        <title>CRM Digital 2.0 | Persona</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Documento</th>
                    <th>Fecha de Nacimiento</th>
                    <th>Correo</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Sexo</th>
                    <th>Foto</th>
                </tr>
            </thead>
            <tbody id="list_body">
                
            </tbody>
        </table>
        <script src="<c:url value="/resources/js/service/jsPersonaService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/cliente/jsPersona.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
