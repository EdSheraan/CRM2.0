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
                            <div class="col s12 m12 l10 offset-l1 row card-panel">
                                <div class="col l7 s12">
                                    <h5>Registro de Asistencia</h5>
                                    <table class="highlight">
                                        <tbody id="list_body">
                                            <tr style="margin: 0;padding: 0;">
                                                <td><button style="" class="btn-floating waves-effect waves-light">L</button></td>
                                                <td class="ligth italic">Leandro Jair Burgos Robles</td>
                                                <td>
                                                    <span class="chart presente" data-percent="12">
                                                        <span class="percent"></span>
                                                    </span>
                                                </td>
                                                <td><p><input type="checkbox" class="checkO" onclick="changePF(this.id)" id="test5"><label for="test5"></label></p></td>
                                            </tr>
                                            <tr style="margin: 0;padding: 0;">
                                                <td><button style="" class="btn-floating waves-effect waves-light amber">A</button></td>
                                                <td class="ligth italic">Arnold Danilo Morales Gomez</td>
                                                <td>
                                                    <span class="chart presente" data-percent="42">
                                                        <span class="percent"></span>
                                                    </span>
                                                </td>
                                                <td><p><input type="checkbox" class="checkO" onclick="changePF(this.id)" id="asfsf"><label for="asfsf"></label></p></td>
                                            </tr>
                                            <tr style="margin: 0;padding: 0;">
                                                <td><button style="" class="btn-floating waves-effect waves-light pink">C</button></td>
                                                <td class="ligth italic">Carlos David Tocto Mamani</td>
                                                <td>
                                                    <span class="chart presente" data-percent="20">
                                                        <span class="percent"></span>
                                                    </span>
                                                </td>
                                                <td><p><input type="checkbox" class="checkO" onclick="changePF(this.id)" id="tesadast5"><label for="tesadast5"></label></p></td>
                                            </tr>
                                            <tr style="margin: 0;padding: 0;">
                                                <td><button style="" class="btn-floating waves-effect waves-light brown">P</button></td>
                                                <td class="ligth italic">Pamela Sandra Flores Garcia</td>
                                                <td>
                                                    <span class="chart presente" data-percent="82">
                                                        <span class="percent"></span>
                                                    </span>
                                                </td>
                                                <td><p><input type="checkbox" class="checkO" onclick="changePF(this.id)" id="dasdsa"><label for="dasdsa"></label></p></td>
                                            </tr>
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
                                            <input id="icon_prefix3" type="number" name="username" class="validate">
                                            <label for="icon_prefix3" class="">Número de visitas</label>
                                        </div>
                                        <div class="input-field col s10 offset-s1">
                                            <i class="mdi-action-home prefix"></i>
                                            <input id="icon_prefix3" type="text" name="username" class="validate">
                                            <label for="icon_prefix3" class="">Lugar de Reunión</label>
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

        <script type="text/javascript">
            $(document).ready(function () {
                startPieChart();
                var nMiembros = document.getElementById("list_body").rows.length;
                $(".valF").attr("value",nMiembros);
                $(".falV").empty();
                $(".falV").append(nMiembros);
            });

            function saveAsis(){
                confirm("¿Seguro que desea guardar?");
            }

            function startPieChart() {
                $('.presente').easyPieChart({
                    easing: 'easeOutBounce',
                    lineWidth: '3',
                    barColor: '#00e676',
                    size: 60,
                    animate: 3000,
                    onStep: function (from, to, percent) {
                        $(this.el).find('.percent').text(Math.round(percent));
                    }
                });
            }
            
            function changePF(id){
                var P = parseInt($(".valP").val());
                var F = parseInt($(".valF").val());
                if ($("#"+id).prop('checked')) {
                    P = P + 1;
                    F = F - 1;
                } else {
                    F = F + 1;
                    P = P - 1;
                }
                $(".valF").attr("value", F);
                $(".falV").empty();
                $(".falV").append(F);
                $(".valP").attr("value", P);
                $(".preV").empty();
                $(".preV").append(P);
            }

        </script>
        <script src="<c:url value='/resources/js/plugins/jquery.easypiechart.min.js'></c:url>" type="text/javascript"></script>
    </body>
</html>
