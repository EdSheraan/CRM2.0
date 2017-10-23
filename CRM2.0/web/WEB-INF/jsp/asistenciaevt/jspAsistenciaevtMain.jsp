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
                            <!--<h6 class="light italic left">Evento n° 10 || 23 de octubre del 2017</h6>-->
                            <div class="chip green accent-3 white-text light italic" style="margin-top: 2%">Evento n° 10</div>
                            <div class="chip amber white-text light italic" style="margin-top: 2%">23 de octubre del 2017</div>
                            <div class="chip deep-orange darken-2 white-text light italic" style="margin-top: 2%">Reunión de Grupo Pequeño</div>
                            <div class="chip blue darken-1 white-text right light italic" style="margin-top: 2%">Vence el 30 de octubre
                            <i class="material-icons mdi-navigation-close"></i></div>
                            <div class="col s12 m12 l10 offset-l1 row">

                                <div class="col l7 s12">
                                    <div class="row">
                                    <h5 class="light italic left">Registro de Asistencia</h5>
                                    <p class="right" style="margin-right: 6%;"><input type="checkbox" onclick="changeAll()" id="as"><label for="as"></label></p>
                                    </div>
                                    <table class="highlight light italic">
                                        <tbody id="list_miembros">
                                        </tbody>
                                    </table>
                                </div>
                                <div class="col l5 s12">
                                    <h5 class="thin titleGP"><small>Grupo Pequeño</small><br>Damasco</h5>
                                    <table class="row">
                                        <tr style="margin: 0;padding: 0;">
                                            <td class="col s3 offset-s3 blue-text darken-1" style="text-align: center"><h3 class="thin preV">0</h3><small>Presentes</small></td>
                                        <input type="hidden" class="valP" value="0">
                                        <td class="col s3 red-text darken-1" style="text-align: center"><h3 class="thin falV">0</h3><small>Faltas</small></td>
                                        <input type="hidden" class="valF" value="0">    
                                        </tr>                                            
                                    </table>
                                    <div class="row">
                                        <div class="input-field col s10 offset-s1">
                                            <i class="mdi-social-people prefix"></i>
                                            <input id="nvisitas" type="number" class="validate">
                                            <label for="nvisitas" class="">Número de visitas</label>
                                        </div>
                                        <div class="input-field col s10 offset-s1">
                                            <i class="mdi-action-home prefix"></i>
                                            <input id="lreunion" type="text" class="validate">
                                            <label for="lreunion" class="">Lugar de Reunión</label>
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
        <script src="<c:url value='/resources/js/vista/jsAsistenciaevt.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/vista/jsAsmiemgp.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/util/jsColors.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
