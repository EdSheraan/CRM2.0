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
            .cGP.cTM.cMI.cES{
                color:#212121;
            }
            .cGP:hover{
                color: #00e676;
            }
            .cMI:hover{
                color: #1e88e5;
            }
            .cTM:hover{
                color: #ff6f00;
            }
            .cES:hover{
                color: #1de9b6;
            }
            .contModulos{
                margin-top: 5%;
            }
        </style>
    </head>
    <body class="white">
        <%@include file="../jspf/header.jspf" %>   
    <div class="row contModulos">
            <div class="col l2 card-panel waves-effect waves-light cGP" onclick="redirect()">
                <center>
                    <i class="mdi-social-group large" style="width: 90px;height: 90px;"></i>
                    <h5 class="light italic">Grupo Pequeño</h5>
                </center>
                <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
            </div>
            <div class="col l2 card-panel waves-effect waves-light cTM" >
                <center>
                    <i class="mdi-action-wallet-travel large " style="width: 90px;height: 90px;"></i>
                    <h5 class="light italic">Trabajo Misionero</h5>
                </center>
                <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
            </div>
            <div class="col l2 card-panel waves-effect waves-light cMI" >
                <center>
                    <i class="mdi-action-favorite large " style="width: 90px;height: 90px;"></i>
                    <h5 class="light italic">Ministerios</h5>
                </center>
                <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
            </div>
            <div class="col l2 card-panel waves-effect waves-light cES" >
                <center>
                    <i class="mdi-action-book large " style="width: 90px;height: 90px;"></i>
                    <h5 class="light italic">Escuela Sabática</h5>
                </center>
                <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
            </div>
        <div class="col l2 card-panel waves-effect waves-light cUS" >
                <center>
                    <i class="mdi-social-person large " style="width: 90px;height: 90px;"></i>
                    <h5 class="light italic">Usuario</h5>
                </center>
                <p class="grey-text" style="text-align: center">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
            </div>
        <div class="col l2 card-panel waves-effect waves-light cUS" >
                <center>
                    <i class="mdi-action-settings large " style="width: 90px;height: 90px;"></i>
                    <h5 class="light italic">Administrador</h5>
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
