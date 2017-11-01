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
                                <h5 class="italic">Iglesias</h5>
                                <p>Listado de iglesias que pertencen al distrito misionero " "</p>
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
            <a class="btn-floating btn-large green accent-4 btn tooltipped" onclick="createIglesia()" data-tooltip="Añadir"  >
                <i class="mdi-content-add"></i>
            </a>
        </div>
        <div id="modal1" class="modal">
            <button class="modal-close btn-flat blue-grey-text" style="position:absolute;top:0;right:0;">
                <i class="mdi-navigation-cancel"></i>
            </button>
            <div class="modal-content"></div>
            <div class="modal-footer">
                <a class="waves-effect waves-light grey btn darken-1 modal-action modal-close left">Cerrar</a>
                <a class="waves-effect waves-light green btn accent-3 modal-action modal-close right" onclick="save()">Guardar</a>
            </div>
        </div>
        <%@include file="../../jspf/footer.jspf" %>
        <script src="<c:url value="/resources/js/service/jsIglesiaService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsIglesia.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/util/jsColors.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
