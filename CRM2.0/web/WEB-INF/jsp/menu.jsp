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
            .card-panel{
                width: 250px;
                height: 350px;
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
                color: #e53935;
            }
            .cUS:hover{
                color: #3949ab;
            }
            .cAD:hover{
                color: #fdd835;
            }
            .contModulos{
                margin-top: 5%;
            }
            @media only screen and (max-width: 600px) {
                .card-panel{
                    width: 90%;
                }
            }
        </style>
    </head>
    <body class="white">
        <%@include file="../jspf/header.jspf" %> 
    <center>
        <div class="row contModulos">
            <div class="row">
                <div class="card-panel  waves-effect waves-light cGP" id="modGP" onclick="redirect(this.id)">
                    <center>
                        <i class="mdi-social-group large" style="width: 90px;height: 90px;"></i>
                        <h5 class="light italic">Grupo Pequeño</h5>
                    </center>
                    <p class="grey-text">

                    </p>
                    <form method="post" action="">
                        
                    </form>
                </div>
                <div class="card-panel waves-effect waves-light cUS" id="modUS" onclick="redirect(this.id)">
                    <center>
                        <i class="mdi-social-person large" style="width: 90px;height: 90px;"></i>
                        <h5 class="light italic">Usuario</h5>
                    </center>
                    <p class="grey-text">
                    </p>
                </div>
                <div class="card-panel waves-effect waves-light cAD" id="modAD" onclick="redirect(this.id)">
                    <center>
                        <i class="mdi-action-settings large" style="width: 90px;height: 90px;"></i>
                        <h5 class="light italic">Administrador</h5>
                    </center>
                    <p class="grey-text">
                    </p>
                </div>
            </div>
            <!-- 
             <div class="row">
                 
                 <div class=" card-panel waves-effect waves-light cMI" onclick="redirect(this.id)">
                     <center>
                         <i class="mdi-action-favorite large" style="width: 90px;height: 90px;"></i>
                         <h5 class="light italic">Ministerios</h5>
                     </center>
                     <p class="grey-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                 </div>
                 <div class=" card-panel waves-effect waves-light cES" onclick="redirect(this.id)">
                     <center>
                         <i class="mdi-action-book large" style="width: 90px;height: 90px;"></i>
                         <h5 class="light italic">Escuela Sabática</h5>
                     </center>
                     <p class="grey-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                 </div>
                 
                 <div class=" card-panel waves-effect waves-light cTM" onclick="redirect(this.id)">
                     <center>
                         <i class="mdi-action-wallet-travel large" style="width: 90px;height: 90px;"></i>
                         <h5 class="light italic">Trabajo Misionero</h5>
                     </center>
                     <p class="grey-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                 </div>
             </div>
            -->
        </div>
    </center>
    <script>
        function redirect(id) { //POR MIENTRAS HASTA TENER LOS LINKS EN LA DB
            if (id !== "modUS") {
                /*var privilegio = {
                    prvLink: "hola"
                };*/
                location.href = "privilegio/main";
                //$.get("privilegio/main", privilegio);
                /*var connector = new jsConnector();
                connector.get(url,JSON.stringify(privilegio));*/
            } else {
                location.href = "usuario/main";
            }
        }
    </script>
</body>
</html>
