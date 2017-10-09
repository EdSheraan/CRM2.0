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
        <title>JSP Page</title>
        <style>
            footer {
                width: 100%;
                position: fixed;
                bottom: 0;
            }
            .circulo {
                width: 100px;
                height: 100px;
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
                width: 50px;
                height: 50px;
                -moz-border-radius: 50%;
                -webkit-border-radius: 50%;
                border-radius: 50%;
                margin: 25px 21px;
            }

            .size-icon {
                /*padding-top: 25px;
                padding-right: 21px;
                padding-left: 21px;
                padding-bottom: 25px;*/
                color: white;
            }

        </style>
    </head>
    <body>
        <div class="seaction" style="display: table;margin: auto;padding: 1%;">
            <!--ADECUAR LAS SECCIONES DEPENDIENDO DEL ROL Y SUS PRIVILEGIOS-->
            <div>
                <h4 class="thin">Usuario</h4>
                <div class="row">
                    <div class="circulo waves-effect waves-light tooltipped blue darken-4" data-position="bottom" data-delay="50" data-tooltip="Perfil" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-social-person medium icon-demo size-icon"></i>
                        </div>
                    </div>
                </div>
            </div>
            <div>
                <h4 class="thin">Grupo Pequeño</h4>
                <div class="row">
                    <div class="circulo waves-effect waves-light tooltipped green accent-2" data-position="bottom" data-delay="50" data-tooltip="Administrar DM" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-social-group medium icon-demo size-icon"></i>
                        </div>
                    </div>
                    <div class="circulo waves-effect waves-light tooltipped green accent-1" data-position="bottom" data-delay="50" data-tooltip="Asistencia de G.P." style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-toggle-check-box medium icon-demo size-icon"></i>
                        </div>
                    </div>
                    <!--<div class="circulo waves-effect waves-light tooltipped green accent-4" data-position="bottom" data-delay="50" data-tooltip="asdasd'" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-action-search medium icon-demo size-icon"></i>
                        </div>
                    </div>
                    <div class="circulo waves-effect waves-light tooltipped green accent-3" data-position="bottom" data-delay="50" data-tooltip="asdasd'" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-action-search medium icon-demo size-icon"></i>
                        </div>
                    </div>-->
                </div>
            </div>
            <div>
                <h4 class="thin">Reportes</h4>
                <div class="row">
                    <div class="circulo waves-effect waves-light tooltipped blue darken-1" data-position="bottom" data-delay="50" data-tooltip="Administrar Iglesia'" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-action-trending-up medium icon-demo size-icon"></i>
                        </div>
                    </div>
                    <div class="circulo waves-effect waves-light tooltipped blue darken-3" data-position="bottom" data-delay="50" data-tooltip="Administrar E.S" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-social-group medium icon-demo size-icon"></i>
                        </div>
                    </div>
                    <!--<div class="circulo waves-effect waves-light tooltipped blue darken-4" data-position="bottom" data-delay="50" data-tooltip="asdasd'" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-action-search medium icon-demo size-icon"></i>
                        </div>
                    </div>
                    <div class="circulo waves-effect waves-light tooltipped blue darken-2" data-position="bottom" data-delay="50" data-tooltip="asdasd'" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-action-search medium icon-demo size-icon"></i>
                        </div>
                    </div>
                    <div class="circulo waves-effect waves-light tooltipped blue" data-position="bottom" data-delay="50" data-tooltip="asdasd'" style="display: table-cell;
                         vertical-align: middle;" >
                        <div class='circulo2'>
                            <i class="mdi-action-search medium icon-demo size-icon"></i>
                        </div>
                    </div>-->
                </div>
            </div>
        </div>
    </body>
</html>
