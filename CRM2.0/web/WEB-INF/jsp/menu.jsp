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
            footer {
                width: 100%;
                position: fixed;
                bottom: 0;
            }
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

        </style>
    </head>
    <body>

        <header id="header" class="page-topbar">
            <div class="navbar-fixed">
                <nav class="navbar-color blue-grey darken-3">
                    <div class="nav-wrapper">
                        <ul class="left">
                        </ul>
                        <ul class="side-nav" id="mobile-demo">
                            <li><a href="sass.html">Sass</a></li>
                            <li><a href="badges.html">Components</a></li>
                            <li><a href="collapsible.html">Javascript</a></li>
                            <li><a href="mobile.html">Mobile</a></li>
                        </ul>
                        <ul class="right hide-on-med-and-down">
                            <li><a href="javascript:void(0);" class="waves-effect waves-block waves-light">
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </header>
        <aside id="left-sidebar-nav">
            <ul id="slide-out" class="side-nav leftside-navigation">
                <li class="user-details blue darken-1">
                    <div class="row">
                        <div class="col col s4 m4 l4">
                            <img src="images/avatar.jpg" alt="" class="circle responsive-img valign profile-image">
                        </div>
                        <div class="col col s8 m8 l8">
                            <ul id="profile-dropdown" class="dropdown-content">
                                <li><a href="#"><i class="mdi-action-face-unlock"></i> Profile</a>
                                </li>
                                <li><a href="#"><i class="mdi-action-settings"></i> Settings</a>
                                </li>
                                <li><a href="#"><i class="mdi-communication-live-help"></i> Help</a>
                                </li>
                                <li class="divider"></li>
                                <li><a href="#"><i class="mdi-action-lock-outline"></i> Lock</a>
                                </li>
                                <li><a href="#"><i class="mdi-hardware-keyboard-tab"></i> Logout</a>
                                </li>
                            </ul>
                            <a class="btn-flat dropdown-button waves-effect waves-light white-text profile-btn" href="#" data-activates="profile-dropdown">John Doe<i class="mdi-navigation-arrow-drop-down right"></i></a>
                            <p class="user-roal">Administrator</p>
                        </div>
                    </div>
                </li>
                <li class="bold active"><a href="index.html" class="waves-effect waves-cyan"><i class="mdi-action-dashboard"></i> Dashboard</a>
                </li>
                <li class="bold"><a href="app-email.html" class="waves-effect waves-cyan"><i class="mdi-communication-email"></i> Mailbox <span class="new badge">4</span></a>
                </li>
                <li class="bold"><a href="app-calendar.html" class="waves-effect waves-cyan"><i class="mdi-editor-insert-invitation"></i> Calender</a>
                </li>  
            </ul>
            <a href="#" data-activates="slide-out" class="sidebar-collapse btn-floating btn-medium waves-effect waves-light  blue darken-1"><i class="mdi-navigation-menu"></i></a>
        </aside>
        <div class="seaction" style="display: table;margin: auto;padding: 1%;">
            <!--ADECUAR LAS SECCIONES DEPENDIENDO DEL ROL Y SUS PRIVILEGIOS-->
            <div style="margin-top: 20%">
                <div class="row">
                    <div class="circulo waves-effect waves-light green accent-3" style="display: table-cell;
                         vertical-align: middle;" >
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
                            <i class="mdi-action-favorite-outline large icon-demo size-icon"></i>
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

        <footer class="page-footer blue-grey darken-4" style="padding-left: 0;">
            <div class="footer-copyright">
                <div class="container">
                    © 2017 Copyright 
                    <a class="grey-text text-lighten-4 right thin" href="https://www.facebook.com/mipes.upeu" target="_blank">Facebook</a>
                </div>
            </div>
        </footer>

        <script>
            $(document).ready(function () {
                $(".button-collapse").sideNav();
            });
        </script>
    </body>
</html>
