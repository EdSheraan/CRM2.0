<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../jspf/general.jspf" %>
        <style>
            .card-panel{
                width: 250px;
                height: 250px;
            }
            .card-panel:hover{
                -webkit-transform: scale(1.2);
                -ms-transform: scale(1.2);
                transform: scale(1.2);
                position: relative;
                z-index: 1;
            }
            .card-panel:not(:hover){
                position: relative;
                z-index: 0;
            }
            .c1.c2.c3.c4{
                color:#212121;
            }
            .c1:hover{
                color: #00e676;
            }
            .c2:hover{
                color: #1e88e5;
            }
            .c3:hover{
                color: #ff6f00;
            }
            .c4:hover{
                color: #e53935;
            }
            .c9:hover{
                color: #3949ab;
            }
            .c10:hover{
                color: #fdd835;
            }
            .contModulos{
                margin-top: 5%;
            }
            @media only screen and (max-width: 600px) {
                .card-panel{
                    width: 90%;
                }
            }
        </style>
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
                                <i class="${modulos.parent.prvIcono} large" style="width: 90px;height: 90px;"></i>
                                <h5 class="light italic">${modulos.parent.prvNombre}</h5>
                            </center>
                            <p class="grey-text">
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
