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
    </head>
    <body>
        <%@include file="../../jspf/header.jspf" %>   
        <div id="main">
            <div class="wrapper">
                <%@include file="../../jspf/left_aside.jspf" %>
                <section id="content">
                    <div class="container">
                        <div class="section">

                            <div class="row">
                                <div class="col s12 m10 l10 offset-l1">
                                    <div class="card-panel">
                                        <h5>Asistencia del Grupo Pequeño - <strong>SAMARIA</strong></h5>
                                        <div id="work-collections">
                                            <div class="row">
                                                <div class="col l4" style="text-align: center;">
                                                    <a class="blue-grey-text darken-3">Nombre Completo</a>
                                                </div>
                                                <div class="col l5" style="text-align: center;">
                                                    <a class="blue-grey-text darken-3">Nivel de Asistencia</a>
                                                </div>
                                                <div class="col l3" style="text-align: center;">
                                                    <a class="blue-grey-text darken-3">Asistencia</a>
                                                </div>
                                                <div class="col s12 m12 l12">
                                                    <ul id="projects-collection" class="collection">                                                
                                                        <li class="collection-item avatar">
                                                            <div class="col l4">
                                                                <button class="circle amber white-text waves-effect waves-light">A</button>
                                                                <p class="collections-content">Arnold Danilo Morales Gomes</p>
                                                                <p class="collections-content"><span class="task-cat green accent-3">MIPES de G.P.</span></p>
                                                            </div>
                                                            <div class="col l5">        
                                                                <div class="progress">
                                                                    <div class="determinate green accent-3" style="width: 90%">  </div>
                                                                </div>
                                                                <p style="text-align: center;">90%</p>
                                                            </div>                                                                                                      
                                                            <div class="col l3">        
                                                                <p style="text-align: center;margin-left: 30px;">
                                                                    <input type="checkbox" id="test1" />
                                                                    <label for="test1"></label>
                                                                </p>
                                                            </div>
                                                        </li>
                                                        <li class="collection-item avatar">
                                                            <div class="col l4"><!--Nombre-->
                                                                <img src="../../template/images/avatar.jpg" alt="" class="circle">
                                                                <p class="collections-content">Igor Alexis Chipana Berrocal</p>
                                                                <p class="collections-content"><span class="task-cat blue accent-3">Miembro</span></p>
                                                            </div>
                                                            <div class="col l5">        
                                                                <div class="progress">
                                                                    <div class="determinate" style="width: 70%">  </div>
                                                                </div>
                                                                <p style="text-align: center;">70%</p>
                                                            </div>                                                                                                      
                                                            <div class="col l3">        
                                                                <p style="text-align: center;margin-left: 30px;">
                                                                    <input type="checkbox" id="test2" />
                                                                    <label for="test2"></label>
                                                                </p>
                                                            </div>
                                                        </li>
                                                        <li class="collection-item avatar">
                                                            <div class="col l4"><!--Nombre-->
                                                                <img src="../../template/images/avatar2.png" alt="" class="circle">
                                                                <p class="collections-content">Leandro Jair Burgos Robles</p>
                                                                <p class="collections-content"><span class="task-cat blue accent-3">Miembro</span></p>
                                                            </div>
                                                            <div class="col l5">        
                                                                <div class="progress">
                                                                    <div class="determinate red accent-3" style="width: 33%">  </div>
                                                                </div>
                                                                <p style="text-align: center;">33%</p>
                                                            </div>                                                                                                      
                                                            <div class="col l3">        
                                                                <p style="text-align: center;margin-left: 30px;">
                                                                    <input type="checkbox" id="test7" />
                                                                    <label for="test7"></label>
                                                                </p>
                                                            </div>
                                                        </li>
                                                    </ul>  
                                                </div>
                                                <div style="float: right; margin-bottom: 40px;margin-right: 15px;">
                                                    <button class="btn modal-trigger" type="button" style="background:#1e88e5" data-target="modal1" name="action">Registrar
                                                    </button>
                                                </div>


                                            </div>    
                                        </div>
                                    </div>   
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </div></div>
    </body>
</html>
