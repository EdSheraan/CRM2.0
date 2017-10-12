<%-- 
    Document   : jspUnionpMain
    Created on : 11/10/2017, 02:32:50 PM
    Author     : Leandro Burgos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../jspf/general.jspf" %>
    </head>
    <body>
        <%@include file="../../jspf/header.jspf" %>
        <div class="col s12 m12 l12">
            <div class="row">
                <div class="col s12 m12 l12">
                    <h5>Lista de <strong>UNIONES</strong></h5>
                    <div id="work-collections">
                        <div class="row">
                            <div class="col s12 m12 l10 offset-l1">
                                <ul id="list_body" class="collection"></ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="fixed-action-btn " style="bottom: 10%; right: 19px;" >
            <a class="btn-floating btn-large green accent-3 btn modal-trigger tooltipped green darken-2" href="#modal1" data-tooltip="Añadir"  >
                <i class="mdi-content-add"></i>
            </a>
        </div>
        <script src="<c:url value="/resources/js/service/jsUnionpService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsUnionp.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
