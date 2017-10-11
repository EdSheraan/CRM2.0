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

        <div class="col s12 m12 l12">

            <div class="row">
                <div class="col s12 m12 l12">
                    <div class="">
                        <h5>Lista de Grupos Pequeños - <strong>DAMASCO</strong></h5>
                        <div id="work-collections">
                            <div class="row">
                                <div class="col s12 m12 l10 offset-l1">
                                    <ul id="list_body" class="collection">

                                    </ul>
                                </div>
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

        <script src="<c:url value="/resources/js/service/jsGrupoService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsGrupo.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
