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
        <style>
            .btnAc:hover{
                background: white;
                color: black;
            }
        </style>
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
                            <li>
                                <a class="btn-login waves-effect waves-block waves-light blue modal-trigger hide-on-med-and-down" href="#modal1">
                                    Ingresar al Sistema
                                </a>
                            </li>
                            <li>
                                <a class="dropdown-button waves-effect waves-light hide-on-large-only" href="#!" data-activates="dropdown1">Menú<i class="mdi-navigation-arrow-drop-down right"></i></a>
                                <ul id="dropdown1" class="dropdown-content">
                                    <li><a href="#inicio" class="waves-effect waves-block waves-light scroll">Inicio</a></li>
                                    <li><a href="#grupo" class="waves-effect waves-block waves-light scroll">Grupos Pequeños</a></li>
                                    <li><a href="#ministerio" class="waves-effect waves-block waves-light scroll">Ministerios</a></li>
                                    <li><a href="#pm" class="waves-effect waves-block waves-light scroll">Parejas Misioneras</a></li>
                                    <li><a href="#escuela" class="waves-effect waves-block waves-light scroll">Escuelas Sabáticas</a></li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="right"> 
                            <li><a class="btn-login waves-effect waves-block waves-light blue hide-on-large-only darken-1 modal-trigger" href="#modal1">
                                    Ingresar al Sistema
                                </a>
                            </li>
                        </ul>
                        <ul class="right hide-on-med-and-down">
                            <li><a href="#inicio" class="waves-effect waves-block waves-light scroll">Inicio</a></li>
                            <li><a href="#grupo" class="waves-effect waves-block waves-light scroll">Grupos Pequeños</a></li>
                            <li><a href="#ministerio" class="waves-effect waves-block waves-light scroll">Ministerios</a></li>
                            <li><a href="#pm" class="waves-effect waves-block waves-light scroll">Parejas Misioneras</a></li>
                            <li><a href="#escuela" class="waves-effect waves-block waves-light scroll">Escuelas Sabáticas</a></li>
                        </ul>
                    </div>
                </nav>
            </div>
        </header>
        <div id="inicio" class="blue-grey darken-3 white-text">
            <div class="row">
                <div class="container col s12 m6 l5 offset-l1">
                    <br>
                    <c:url var="img_logo" value="/resources/images/crm_logo2_ligth_color.png"></c:url>
                    <img src="${img_logo}" width="80%" alt="crm_logo"/>
                    <h5 class="thin">Sistema de Gestión de las actividades del
                        Ministerio Personal y la Escuela Sabática</h5>

                    <br/>
                    <a class="btn waves-effect waves-light blue" target="_blank" href="https://www.youtube.com">Tutoriales
                        <i class="mdi-av-video-collection right"></i>
                    </a>
                    <br>
                    <br>
                </div>
                <div class="container col s12 m6 l5">
                    <br>
                    <h5 class="thin right">Nuestras metas CRM</h5>
                    <div class="card-image offset-l2">
                        <img src="<c:url value="/resources/images/metas_crm.png"/>" alt="" style="width: 100%"/>
                    </div>
                </div>
            </div>
            <div class="row hide-on-small-only">
                <br />
                <br />
            </div>
        </div>
        <div id="grupo" class="green accent-4 white-text" style="margin-top: -20px">
            <div class="row">

                <div class="container col l4 m6 s12">
                    <h4><i class="mdi-action-home"></i>&nbsp;Grupos Pequeños</h4>
                    <br>
                    <p class="text-justify font-small">
                        Piensa en un grupo de buenos amigos, que tienen un encuentro marcado un día a la semana. El lugar no es tan importante; puede ser en casa de alguno de ellos o incluso un parque bonita de la ciudad. Ahora, lo que no puede faltar es la alegría de compartir buenos momentos, experiencias y sonrisas junto a personas que se preocupan unas por otras. En esto consiste un Grupo Pequeño; es amistad, es relacionamiento, es conocer el amor de Jesús a través del amor de mis amigos, es llevar a más amigos a los pies de Jesús.

                        Dentro de un Grupo Pequeño las personas también son motivadas a orar unas por las otras, estudiar detalladamente las verdades de la Biblia, compartir experiencias de la vida cristiana e invitar nuevo amigos a participar también.
                    </p>
                </div>
                <div class="container col l8 m6 s12 no-padding">
                    <c:url var="gp_image" value="/resources/images/gp_1.jpg"></c:url>
                    <img src="${gp_image}" width="100%" alt="gp_1"/>
                </div>

            </div>
            <div class="row">
                <div class="col l12 m12 s12">
                    <h5>Top 5 del Mes</h5>
                </div>
                <%for (int i = 0; i < 6; i++) {%>
                <div class="col l2 m3 s6">
                    <div class="card">
                        <div class="card-content green-text">
                            <center><i class="mdi-action-grade large"></i></center>
                        </div>
                        <div class="card-action black-text">
                            <center>
                                <b>Distrito Misionero</b><br>
                                <span class="font-medium">SHADAI</span><br>
                                <b>Escuela Sabática</b><br>
                                <span class="font-medium">PENIEL</span>
                            </center>
                        </div>
                    </div>

                </div>
                <%}%>
            </div>
        </div>
        <div id="ministerio" class="red white-text" style="margin-top: -20px">
            <div class="row">
                <div class="container col l8 m6 s12 no-padding">
                    <c:url var="m_image" value="/resources/images/ministerio_1.jpg"></c:url>
                    <img src="${m_image}" width="100%" alt="ministerio_1"/>
                </div>
                <div class="container col l4 m6 s12">
                    <h4><i class="mdi-action-favorite"></i>&nbsp;Ministerios</h4>
                    <br>
                    <p class="text-justify font-small">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum
                    </p>
                </div>

            </div>
            <div class="row">
                <div class="col l12 m12 s12">
                    <h5 class="right">Top 5 del Mes</h5>
                </div>
                <%for (int i = 0; i < 6; i++) {%>
                <div class="col l2 m3 s6">
                    <div class="card">
                        <div class="card-content red-text">
                            <center><i class="mdi-action-grade large"></i></center>
                        </div>
                        <div class="card-action black-text">
                            <center>
                                <b>Distrito Misionero</b><br>
                                <span class="font-medium">SHADAI</span><br>
                                <b>Escuela Sabática</b><br>
                                <span class="font-medium">PENIEL</span>
                            </center>
                        </div>
                    </div>

                </div>
                <%}%>
            </div>
        </div>
        <div id="pm" class="blue white-text" style="margin-top: -20px">
            <div class="row">
                <div class="container col l4 m6 s12">
                    <h4><i class="mdi-social-people"></i>&nbsp;Parejas Misioneras</h4>
                    <br>
                    <p class="text-justify font-small">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt 
                        ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation 
                        ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in 
                        reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                        Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt 
                        mollit anim id est laborum
                    </p>
                </div>
                <div class="container col l8 m6 s12 no-padding">
                    <c:url var="m_image" value="/resources/images/gp_2.jpg"></c:url>
                    <img src="${m_image}" width="100%" alt="grupo_2"/>
                </div>


            </div>
            <div class="row">
                <div class="col l12 m12 s12">
                    <h5>Top 5 del Mes</h5>
                </div>
                <%for (int i = 0; i < 5; i++) {%>
                <div class="col l2 m3 s6">
                    <div class="card">
                        <div class="card-content blue-text">
                            <center><i class="mdi-action-grade large"></i></center>
                        </div>
                        <div class="card-action black-text">
                            <center>
                                <b>Distrito Misionero</b><br>
                                <span class="font-medium">SHADAI</span><br>
                                <b>Escuela Sabática</b><br>
                                <span class="font-medium">PENIEL</span>
                            </center>
                        </div>
                    </div>

                </div>
                <%}%>
            </div>
        </div>
        <div id="escuela" class="yellow darken-1 white-text" style="margin-top: -20px">
            <div class="row">
                <div class="container col l8 m6 s12 no-padding">
                    <c:url var="m_image" value="/resources/images/escuela_1.jpg"></c:url>
                    <img src="${m_image}" width="100%" alt="escuela_1"/>
                </div>
                <div class="container col l4 m6 s12">
                    <h4><i class="mdi-social-people"></i>&nbsp;Escuela Sabática</h4>
                    <br>
                    <p class="text-justify font-small">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col l12 m12 s12">
                    <h5>Top 5 del Mes</h5>
                </div>
                <%for (int i = 0; i < 5; i++) {%>
                <div class="col l2 m3 s6">
                    <div class="card">
                        <div class="card-content yellow-text">
                            <center><i class="mdi-action-grade large"></i></center>
                        </div>
                        <div class="card-action black-text">
                            <center>
                                <b>Distrito Misionero</b><br>
                                <span class="font-medium">SHADAI</span><br>
                                <b>Escuela Sabática</b><br>
                                <span class="font-medium">PENIEL</span>
                            </center>
                        </div>
                    </div>
                </div>
                <%}%>
            </div>
        </div>
        <footer class="page-footer blue-grey darken-3" id="footer" style="margin-top: -20px">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">CRM Digital 2.0</h5>
                        <p class="condensed offset-l2 font-small white-text text-justify">
                            El departamento de <strong>Ministerio Personal y Escuela Sabática</strong> de la <strong>Iglesia Villa Unión</strong> te da la bienvenida a esta plataforma digital
                            en la cual tú como líder podrás monitorear la asistencia a los <strong>Grupos Pequeños</strong> de tus compañeros y así tambien el trabajo misionero que ellos realizan.
                            De esta manera, <strong>juntos</strong> ,como hermanos en la fe, prodremos cumplir con nuestras metas <strong>CRM</strong>.
                        </p>
                    </div>
                    <div class="col l4 offset-l2 s12">
                        <h5 class="white-text">Links</h5>
                        <ul>
                            <li><a class="grey-text text-lighten-3" href="#!">Facebook</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Correo</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Youtube</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Instagram</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    Sistema de Gestión de Grupos Pequeños y 
                    Trabajo Misionero desarrollado por Alpha Team.
                    © 2017. Todos los derechos reservados
                    <a class="grey-text text-lighten-4 right" href="#!">Ayuda</a>
                </div>
            </div>
        </footer>
        <!--Inicio de modal LOGIN-->
        <div id="modal1" class="modal">
            <div class="modal-content">
                <div class="row">
                    <div class="col l5 m6 s12 hide-on-small-only">
                        <br><br>
                        <c:url var="img_login" value="/resources/images/crm_logo_ligth_color.png"></c:url>
                            <center>
                                <img src="${img_login}" width="180px" alt="crm_logo"/>
                        </center>
                        <br>
                        <p class="text-justify font-small">Sistema de Gestión de Grupos Pequeños y 
                            Trabajo Misionero desarrollado por Alpha Team.
                            © 2017. Todos los derechos reservados</p>
                    </div>
                    <div class="col l7 m6 s12">
                        <form name="f" action="<c:url value="/j_spring_security_check"/>" method="POST">
                            <center><h5>Iniciar Sesión</h5></center>
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
                                <button type="submit" name="submit" class="waves-effect waves-light btn blue col l12 m12 s12">Ingresar</button>
                            </div>
                            <br>
                            <br>
                            <p class="font-small"><b>¿No tienes una cuenta en el sistema? </b><a href="" class="blue-text">Registrate Aqui</a></p>
                            <br />
                            <br />
                            <br />
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--Fin de modal LOGIN-->
        <script src="<c:url value='/resources/js/vista/jsMain.js'></c:url>" type="text/javascript"></script>
    </body>
</html>
