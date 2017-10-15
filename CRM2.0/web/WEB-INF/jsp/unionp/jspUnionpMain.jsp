<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../jspf/general.jspf" %>
        <style>
            @media only screen and (max-width: 600px) {
                .oc{
                    display: none;
                }
            }
        </style>
    </head>
    <body>
        <%@include file="../../jspf/header.jspf" %>
        <div class="col s12 m12 l12">
            <div class="row">
                <h5 class="col offset-l1">Lista de <strong>UNIONES</strong></h5>
                <div id="work-collections">
                    <div class="row">
                        <div class="col s12 m12 l10 offset-l1">
                            <ul id="list_body" class="collection">
                                <!--<li class="collection-item avatar">
                                    <div class="col l4">
                                        <div class="circle red" style="display: table;margin: auto;">
                                            <h5 style="display: table-cell;vertical-align: middle;text-align: center;color: white">U</h5>
                                        </div>
                                        <strong><span class="title">Unión Peruana del Norte</span></strong>
                                        <p class="collections-content"><span class="task-cat green accent-3">Activo</span></p>
                                    </div>
                                    <div class="col l4 oc">
                                        <p class="collections-content">EDER BENDEZU ALGO MAS</p>
                                        <p class="collections-content"><span class="task-cat blue darken-1">MIPES de UNION</span></p>
                                    </div>
                                    <div class="col l3 oc">
                                        <a class="btn-floating waves-effect btn-large waves-light blue darken-1 btn modal-trigger tooltipped blue darken-2" href="#modal2" data-tooltip="Editar"><i class="mdi-content-create"></i></a>
                                        <a class="btn-floating waves-effect btn-large waves-light red"><i class="mdi-content-clear"></i></a>
                                    </div>
                                    <div class="col s1">
                                        <a class="dropdown-button waves-effect waves-light" href="#!" data-activates="dropdown1">
                                            <i class="mdi-navigation-more-vert right"></i>
                                        </a>
                                        <ul id="dropdown1" class="dropdown-content">
                                            <li><a href="#!" class="-text">Asignar Lider</a>
                                            </li>
                                        </ul>
                                    </div>
                                </li>-->
                            </ul>
                        </div>
                    </div>
                </div>
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
