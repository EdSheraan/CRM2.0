<%-- 
    Document   : index
    Created on : 07/10/2017, 10:19:48 PM
    Author     : Leandro Burgos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../jspf/general.jspf" %>
        <style>            
            .circulo {
                width: 200px;
                height: 200px;
                -moz-border-radius: 50%;
                -webkit-border-radius: 50%;
                border-radius: 50%;
                display: inline-block;
                cursor: pointer;
            }

            .circulo:hover {
                -webkit-transform: scale(1.3);
                -ms-transform: scale(1.3);
                transform: scale(1.3);
                position: relative;
                z-index: 1;

            }

            .circulo:not(:hover){
                position: relative;
                z-index: 0;
            }

            .circulo2 {
                width: 100px;
                height: 100px;
                -moz-border-radius: 50%;
                -webkit-border-radius: 50%;
                border-radius: 50%;
                margin: 15% 25%;
            }

            .size-icon {
                margin-top: 10px;
                margin-right: 5px;
                margin-left: 5px;
                margin-bottom: 25px;
                color: white;
            }
            .card-panel:hover{
                -webkit-transform: scale(1.2);
                -ms-transform: scale(1.2);
                transform: scale(1.2);
                position: relative;
                z-index: 1;
            }
            .card-panel:not(:hover){
                position: relative;
                z-index: 0;
            }
        </style>
    </head>
    <body class="white">
        <!--
                <div class="seaction" style="display: table;margin: auto;padding: 1%;">
                    <div style="margin-top: 20%">
                        <div class="row">
                            <div class="circulo waves-effect waves-light green accent-3" style="display: table-cell;
                                 vertical-align: middle;" onclick="redirect()" >
                                <div class='circulo2'>
                                    <i class="mdi-action-home large icon-demo size-icon"></i>
                                    <h6 style="text-align: center" class="white-text regular">Grupos Pequeños</h6>
                                </div>
                            </div>
                            <div class="circulo waves-effect waves-light green darken-1" style="display: table-cell;
                                 vertical-align: middle;" >
                                <div class='circulo2'>
                                    <i class="mdi-action-wallet-travel large icon-demo size-icon"></i>
                                    <h6 style="text-align: center" class="white-text regular">Trabajo Misionero</h6>
                                </div>
                            </div>
                            <div class="circulo waves-effect waves-light green accent-4" style="display: table-cell;
                                 vertical-align: middle;" >
                                <div class='circulo2'>
                                    <i class="mdi-action-favorite large icon-demo size-icon"></i>
                                    <h6 style="text-align: center" class="white-text regular">Ministerios</h6>
                                </div>
                            </div>
                            <div class="circulo waves-effect waves-light green darken-2" style="display: table-cell;
                                 vertical-align: middle;" >
                                <div class='circulo2'>
                                    <i class="mdi-action-book large icon-demo size-icon"></i>
                                    <h6 style="text-align: center" class="white-text regular">Escuelas Sabáticas</h6>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        -->
        <%@include file="../jspf/header.jspf" %>   
        <div class="row col l12" style="margin-top: 4%;">
                <div class="col l2 offset-l2 card-panel waves-effect waves-light" onclick="redirect()">
                    <center>
                        <i class="mdi-social-group large grey-text darken-4" style="width: 90px;height: 90px;"></i>
                        <h5 class="light italic">Grupo Pequeño</h5>
                    </center>
                    <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                </div>
                <div class="col l2 card-panel waves-effect waves-light " >
                    <center>
                        <i class="mdi-action-wallet-travel large grey-text darken-4" style="width: 90px;height: 90px;"></i>
                        <h5 class="light italic">Trabajo Misionero</h5>
                    </center>
                    <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                </div>
                <div class="col l2 card-panel waves-effect waves-light" >
                    <center>
                        <i class="mdi-action-favorite large grey-text darken-4" style="width: 90px;height: 90px;"></i>
                        <h5 class="light italic">Ministerios</h5>
                    </center>
                    <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                </div>
                <div class="col l2 card-panel waves-effect waves-light" >
                    <center>
                        <i class="mdi-action-book large grey-text darken-4" style="width: 90px;height: 90px;"></i>
                        <h5 class="light italic">Escuela Sabática</h5>
                    </center>
                    <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                </div>
            </div>
        <script>
            function redirect() { //POR MIENTRAS HASTA TENER LOS LINKS EN LA DB
                location.href = "privilegios";
            }
        </script>
    </body>
</html>
