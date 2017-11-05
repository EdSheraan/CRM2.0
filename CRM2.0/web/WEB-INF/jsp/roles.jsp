<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRM Digital</title>
        <%@include file="../jspf/general.jspf" %>        
    </head>
    <body class="grey lighten-5">
        <%@include file="../jspf/header.jspf" %>   
        <div class="box-container">
            <div class="row">
                <div class="col l12 m12 s12">
                    <div class="card green accent-4 white-text">
                        <div class="card-content">
                            <i class="mdi-social-notifications"></i>
                            Tienes más de un rol registrado en el sistema, 
                            por favor selecciona un rol para continuar.
                        </div>
                    </div>
                    
                </div>
            </div>
            <div class="row">
                <c:if test="${fn:length(sessionScope.rolList) == 1}">
                    <c:redirect url="/menu"></c:redirect>
                </c:if>
                <c:url var="form_action" value="/rol/select/r"></c:url>
                <c:forEach items="${sessionScope.rolList}" var="item">
                    <div class="col l6 m12 s12">
                        <div class="card light italic">
                            <div class="card-content">
                                <center><h5>${item.rolNombre}</h5></center>
                                <center><i class="mdi-action-verified-user large green-text accent-4"></i></center>
                                <p>${item.rolDescripcion}</p>
                            </div>
                            <div class="card-action">
                                <form commandName="rol" action="${form_action}" method="post">
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                                    <input type="hidden" name="idRol" value="${item.idRol}" />
                                    <input type="hidden" name="rolNombre" value="${item.rolNombre}" />
                                    <input type="hidden" name="rolCodigo" value="${item.rolCodigo}" />
                                    <input type="hidden" name="rolEstado" value="${item.rolEstado}" />
                                    <button class="btn waves-effect waves-light green accent-4" 
                                        type="submit" name="action">Seleccionar</button>
                                </form>
                                
                            </div>
                        </div>
                    </div>
                    
                </c:forEach> 

            </div>
        </div>
    </body>
</html>
