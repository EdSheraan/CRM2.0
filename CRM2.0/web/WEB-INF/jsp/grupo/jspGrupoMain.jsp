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
    <body class="white">
        <%@include file="../../jspf/header.jspf" %>
        <div id="main">
            <div class="wrapper">
                <%@include file="../../jspf/left_aside.jspf" %>
                <section id="content">
                    <div class="container">
                        <div class="row">
                            <div class="col s12 m12 l10 offset-l1" style="margin-top: 2%;">
                                <h5 class="italic">Grupos Pequeños</h5>
                                <p>Listado de grupos pequeños que pertencen a la escuela sabática " "</p>
                                <table class="highlight light italic">
                                    <tbody id="list_body"></tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </section>            
            </div>
        </div>
        <div class="fixed-action-btn" style="bottom: 10%; right: 19px;" >
            <a class="btn-floating btn-large green accent-4 btn tooltipped" onclick="createGroup()" data-tooltip="Añadir"  >
                <i class="mdi-content-add"></i>
            </a>
        </div>
        <div id="modal1" class="modal">
            <div class="modal-header-mobile z-depth-1 green accent-4 white-text hide-on-med-and-up">
                <a class="btn-flat modal-close"><i class="mdi-navigation-arrow-back white-text"></i></a>
                Registrar Grupo Pequeño
                <a class="btn-flat right" onclick="save()"><i class="mdi-navigation-check white-text"></i></a>
            </div>
            <div class="modal-content">
                
            </div>
            <div class="modal-footer hide-on-small-only">
                <a class="waves-effect waves-light grey btn darken-1 modal-action modal-close left">Cerrar</a>
                <a class="waves-effect waves-light green btn accent-3 modal-action modal-close right" onclick="save()">Guardar</a>
            </div>
        </div>
        <%@include file="../../jspf/footer.jspf" %>
        <script src="<c:url value="/resources/js/service/jsGrupoService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsGrupo.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/util/jsColors.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
