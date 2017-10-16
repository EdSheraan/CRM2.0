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
                                <li><a class="waves-effect waves-block waves-light green accent-3 modal-trigger hide-on-med-and-down" href="#modal1">Ingresar</a></li>
                                <li>
                                    <a class="dropdown-button waves-effect waves-light hide-on-large-only" href="#!" data-activates="dropdown1">Menú<i class="mdi-navigation-arrow-drop-down right"></i></a>
                                    <ul id="dropdown1" class="dropdown-content">
                                        <li><a href="#inicio" class="waves-effect waves-block waves-light">Inicio</a></li>
                                        <li><a href="#grupo" class="waves-effect waves-block waves-light">Grupos Pequeños</a></li>
                                        <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">Ministerios</a></li>
                                        <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">Parejas Misioneras</a></li>
                                        <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">Escuelas Sabáticas</a></li>
                                    </ul>
                                </li>
                            </ul>
                            <ul class="right"> 
                                <li><a class="waves-effect waves-block waves-light green accent-3 hide-on-large-only darken-1 modal-trigger" href="#modal1">
                                        Ingresar
                                    </a>
                                </li>
                            </ul>
                            <ul class="right hide-on-med-and-down">
                                <li><a href="#inicio" class="waves-effect waves-block waves-light">Inicio</a></li>
                                <li><a href="#grupo" class="waves-effect waves-block waves-light">Grupos Pequeños</a></li>
                                <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">Ministerios</a></li>
                                <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">Parejas Misioneras</a></li>
                                <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">Escuelas Sabáticas</a></li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </header>
            <div class="container col l12 s12 m12">
                
        </div>
        <div>
            <section id="inicio" style="display: block;width: 100%;margin-top: 10%;">
                <div class="row">
                    <div class="container col s12 m6 l5 offset-l1">
                        <h2 class="thin">¡Bienvenidos!</h2>
                        <p class="condensed offset-l2">
                            El departamento de <strong>Ministerio Personal y Escuela Sabática</strong> de la <strong>Iglesia Villa Unión</strong> te da la bienvenida a esta plataforma digital
                            en la cual tú como líder podrás monitorear la asistencia a los <strong>Grupos Pequeños</strong> de tus compañeros y así tambien el trabajo misionero que ellos realizan.
                            De esta manera, <strong>juntos</strong> ,como hermanos en la fe, prodremos cumplir con nuestras metas <strong>CRM</strong>.
                        </p>
                        <br/>
                    </div>
                    <div class="container col s12 m6 l5">
                        <div class="card-image offset-l2">
                            <img src="<c:url value="/resources/images/metasCRM.png"/>" alt="" style="width: 100%"/>
                    </div>
                </div>
            </div>
            </section>
            <section id="grupo" style="display: block;width: 100%;height: 100%;">
                
            </section>
            <section></section>
            <section></section>
            <section></section>
        </div>
        <!--Inicio de modal LOGIN-->
        <div id="modal1" class="modal">
            <div class="modal-content">
                <div class="row">
                    <form name="f" action="<c:url value="/j_spring_security_check"/>" method="POST">
                        <div class="col s12 l6 m6 offset-l3 offset-m3">
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
            <div class="modal-footer">
                <a class="btn waves-effect waves-light grey darken-1 modal-action modal-close left">Cancelar</a>
            </div>
        </div>
        <!--Fin de modal LOGIN-->
    </body>
</html>
