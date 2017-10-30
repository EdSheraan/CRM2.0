<%-- 
    Document   : jspAsistenciaevtMain
    Created on : 16/10/2017, 02:18:15 PM
    Author     : Leandro Burgos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../jspf/general.jspf" %>
        <link href="<c:url value='/resources/css/jquery.easy-pie-chart.css'></c:url>" rel="stylesheet" type="text/css"/>
            <style>
                .titleGP{
                    text-align: right
                }
                td,th{
                    padding:0px 5px; 
                }
            </style>
        </head>
        <body class="white">
        <%@include file="../../jspf/header.jspf" %>   
        <div id="main">
            <div class="wrapper">
                <%@include file="../../jspf/left_aside.jspf" %>
                <section id="content">
                    <div class="container">
                        <div class="row">
                            <div class="col s12 m12 l12">
                                <ol class="breadcrumbs light italic">
                                    <li class="active">Evento n° 10</li>
                                    <li class="active">Reunión de Grupo Pequeño</li>
                                    <li class="active">23 de octubre del 2017</li>
                                    <li class="active">Vence el 30 de octubre</li>
                                </ol>
                            </div>
                            <div class="col s12 m12 l10 offset-l1 row">

                                <div class="col l7 s12">
                                    <div class="row">
                                        <h5 class="light italic left">Registro de Asistencia</h5>
                                    </div>
                                    <table class="highlight light italic">
                                        <tbody id="list_miembros">
                                        </tbody>
                                    </table>
                                </div>
                                <div class="col l5 s12">
                                    <h5 class="light italic titleGP"></h5>
                                    <table class="row">
                                        <tr style="margin: 0;padding: 0;">
                                            <td class="col s3 offset-s3 green-text accent-3" style="text-align: center"><h3 class="thin preV">0</h3><small>Presentes</small></td>
                                        <input type="hidden" class="valP" value="0">
                                        <td class="col s3 grey-text darken-3" style="text-align: center"><h3 class="thin falV">0</h3><small>Faltas</small></td>
                                        <input type="hidden" class="valF" value="0">    
                                        </tr>                                            
                                    </table>
                                    <div class="row">
                                        <div class="input-field col s10 offset-s1">
                                            <i class="mdi-social-people prefix grey-text darken-3"></i>
                                            <input id="nvisitas" type="number" class="validate">
                                            <label for="nvisitas" class="">Número de visitas</label>
                                        </div>
                                        <div class="input-field col s10 offset-s1 contLR">
                                        </div>
                                    </div>
                                    <br>
                                    <button class="btn waves-effect waves-light green accent-3 col l12 m12 s12" onclick="saveAsis()">Registrar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </section> 
            </div>
        </div>
        <%@include file="../../jspf/footer.jspf" %>
        <script src="<c:url value='/resources/js/plugins/jquery.easypiechart.min.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/service/jsAsistenciaevtService.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/service/jsAsmiemgpService.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/service/jsMiembrogpService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/service/jsGrupoService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/vista/jsAsistenciaevt.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/vista/jsAsmiemgp.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/util/jsColors.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
