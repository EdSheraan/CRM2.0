<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../jspf/general.jspf" %>
        <link href="<c:url value='/resources/css/custom/menu.css'></c:url>" rel="stylesheet" type="text/css"/>
    </head>
    <body class="white">
        <%@include file="../jspf/header.jspf" %> 
    <center>
        <div class="row contModulos">
            <div class="row">
                <c:forEach items="${sessionScope.prvRol}" var="modulos">
                    <div class="card-panel  waves-effect waves-light c${modulos.parent.idPrivilegio}" onclick="redirect('${modulos.parent.idPrivilegio}')">
                        <form id="mod${modulos.parent.idPrivilegio}" method="post" action="privilegio/main">
                            <center>
                                <i class="${modulos.parent.prvIcono} large ico"></i>
                                <h5 class="light italic">${modulos.parent.prvNombre}</h5>
                            </center>
                            <p class="grey-text">
                                ${modulos.parent.prvDescripcion}
                            </p>
                            <input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <input type="hidden" name="opc" value="${modulos.parent.idPrivilegio}">
                        </form>
                    </div>
                </c:forEach>
            </div>
        </div>
    </center>
    <script>
        function redirect(id) {
            $("#mod" + id).submit();
        }
    </script>
</body>
</html>
