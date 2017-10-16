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
        <div id="main">
            <div class="wrapper">
                <%@include file="../../jspf/left_aside.jspf" %>
                <section id="content">
                    <div class="container">
                        <div class="row">
                            <div class="col s12 m12 l10 offset-l1">
                                <table class="highlight">
                                    <tbody id="list_body"></tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </section>            
            </div>
        </div>
        <div class="fixed-action-btn " style="bottom: 10%; right: 19px;" >
            <a class="btn-floating btn-large green accent-3 btn modal-trigger tooltipped" href="#modal1" data-tooltip="Añadir"  >
                <i class="mdi-content-add"></i>
            </a>
        </div>
        <div id="modal1" class="modal">
            <div class="modal-content">
                <h5>Nuevo Grupo Pequeño</h5>
                <div class="row">
                    <form class="col s12">
                        <div class="row">
                            <div class="input-field col s12 l6 m6">
                                <i class="mdi-social-group prefix"></i>
                                <input id="ngpo" type="text" class="validate">
                                <label for="ngpo">Nombre</label>
                            </div>
                            <div class="input-field col s12 l6 m6">
                                <i class="mdi-action-home prefix"></i>
                                <input id="lgreu" type="text" class="validate">
                                <label for="lgreu">Lugar de Reunión</label>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <a class="waves-effect waves-light grey btn darken-1 modal-action modal-close left">Cerrar</a>
                <a class="waves-effect waves-light green btn accent-3 modal-action modal-close right" onclick="save()">Guardar</a>
            </div>
        </div>
        <%@include file="../../jspf/footer.jspf" %>
        <script src="<c:url value="/resources/js/service/jsGrupoService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsGrupo.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
