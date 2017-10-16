<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../jspf/general.jspf" %>
        
        <style>
            .actCRUD{
                font-size: 20px;
                cursor: pointer;
            }
            .actCRUD:hover{
                color: #212121;
            }
        </style>
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
                                <h5>Lista de Grupos Pequeños</h5>
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
            <a class="btn-floating btn-large green accent-3 modal-trigger" href="#modal1">
                <i class="mdi-content-add"></i>
            </a>
        </div>

        <div id="modal1" class="modal">
            <div class="modal-content">
                <h5>Nueva Unión Peruana</h5>
                <div class="row">
                    <form class="col s12">
                        <div class="row">
                            <div class="input-field col s12 l6 m6">
                                <i class="mdi-action-account-balance prefix"></i>
                                <input id="nuni" type="text" class="validate">
                                <label for="nuni">Nombre</label>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <a class="waves-effect waves-light grey btn darken-1 modal-action modal-close left">Cerrar</a>
                <a class="waves-effect waves-light green btn accent-3 modal-action modal-close right">Guardar</a>
            </div>
        </div>
        <script src="<c:url value="/resources/js/service/jsUnionpService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsUnionp.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
