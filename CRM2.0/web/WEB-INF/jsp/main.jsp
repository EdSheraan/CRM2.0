<%-- 
    Document   : login
    Created on : 02/10/2017, 05:43:19 PM
    Author     : Leandro Burgos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRM Digital</title>
        <%@include file="../jspf/general.jspf" %>
        <script src="<c:url value='/resources/js/plugins.min.js'></c:url>" type="text/javascript"></script>
    </head>
    <body>        
        <div id="loader-wrapper">
            <div id="loader"></div>        
            <div class="loader-section section-left"></div>
            <div class="loader-section section-right"></div>
        </div>

        <header id="header" class="page-topbar">
            <div class="navbar-fixed">
                <nav class="navbar-color blue-grey darken-3">
                    <div class="nav-wrapper">
                        <ul class="left"> 
                            <li><a class="waves-effect waves-block waves-light blue darken-1 modal-trigger" href="#modal1">
                                    Ingresar
                                </a>
                            </li>
                        </ul>
                        <ul class="right hide-on-med-and-down">

                            <li><a href="#inicio" class="waves-effect waves-block waves-light">
                                    Inicio
                                </a>
                            </li>
                            <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">
                                    Grupos Pequeños
                                </a>
                            </li>
                            <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">
                                    Ministerios
                                </a>
                            </li>
                            <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">
                                    Parejas Misioneras
                                </a>
                            </li>
                            <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">
                                    Escuelas Sabáticas
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </header>
        <div class="contenedor col l12">
            <div style="width: 100%;height: 598px;" class="section row" id="inicio">
                <div class="container col s6 m6 l6">
                    <h2 class="thin">¡Bienvenidos!</h2>
                    <p class="condensed">
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                    </p>
                    <br/>
                    <a style="margin-left: 3%;" class="btn blue darken-1">Tutoriales</a>
                </div>

                <div class="col s6 m6 l6">
                    <div class="card-image">
                    </div>

                </div>
            </div>
        </div>


        <div id="modal1" class="modal">
            <div class="modal-content">
                <div class="row">
                    <form name="f" action="<c:url value="/j_spring_security_check"/>" method="POST">
                        <div class="col s6 l6 m6 offset-s3 offset-l3 offset-m3">
                            <center><h5 class="thin">Iniciar Sesión</h5></center>
                            <div class="input-field">
                                <i class="mdi-action-account-circle prefix"></i>
                                <input id="icon_prefix3" type="text" name="username" class="validate">
                                <label for="icon_prefix3" class="">Usuario</label>
                            </div>
                            <div class="input-field">
                                <i class="mdi-action-lock-outline prefix"></i>
                                <input id="icon_prefix4" name="password" type="password" class="validate">
                                <label for="icon_prefix4" class="">Contraseña</label>
                            </div>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                            <div class="input-field">
                                <button type="submit" name="submit" class="waves-effect waves-light btn blue darken-1 col l12 m12 s12">Ingresar</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer" style="margin-top: -15px;">
                <a href="#" class="waves-effect waves-light btn modal-action modal-close left grey darken-1" >Cancelar</a>
            </div>
        </div>
    </body>
</html>
