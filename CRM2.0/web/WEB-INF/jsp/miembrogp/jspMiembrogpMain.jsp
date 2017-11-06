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
                        <div class="row">
                            <div class="col s12 m12 l10 offset-l1 row">
                                <div class="col l12 s12">
                                    <h5 class="light italic">Miembros</h5>
                                    <table class="highlight">
                                        <tbody class="light italic" id="list_body">                                            
                                        </tbody>
                                    </table>
                                </div>
                                <div class="col">
                                </div>
                            </div>
                        </div>
                    </div>
                </section>            
            </div>
        </div>
        <div class="fixed-action-btn " style="bottom: 10%; right: 19px;" >
            <a class="btn-floating btn-large green accent-3 modal-trigger animated infinite pulse" href="#modal1">
                <i class="mdi-social-person-add"></i>
            </a>
        </div>
        <div id="modal1" class="modal white">
            <div class="modal-content" style="padding: 0px">
                <div id="basic-tabs" class="section">
                    <div class="row">
                        <div class="col s12 m12 l12">

                            <div class="row">
                                <!--<div class="col s12">
                                    <ul class="tabs tab-demo z-depth-1">
                                        <li class="tab col s3"><a class="active" href="#test1">Buscar</a>
                                        </li>
                                        <li class="tab col s3"><a href="#test2">Registrar</a>
                                        </li>
                                    </ul>
                                </div>-->
                                <div class="col s12">
                                    <!--<div id="test1" class="col s12">
                                        <p>BUSCADOR</p>                                        
                                    </div>-->
                                    <div id="test2" class="col s12">
                                        <h5>Registrar Persona</h5>
                                        <div class="row light italic">
                                            <div class="col l6 m6 s12">
                                                <div class="input-field">
                                                    <i class="mdi-social-person-outline prefix"></i>
                                                    <input id="inombre" type="text" class="validate">
                                                    <label for="inombre">Nombre(s)</label>
                                                </div>
                                                <div class="input-field">
                                                    <i class="mdi-social-person-outline prefix"></i>
                                                    <input id="iapellido" type="text" class="validate">
                                                    <label for="iapellido">Apellidos</label>
                                                </div>                                                
                                                <div class="switch">Bautizado : 
                                                    <label>No<input type="checkbox" id="chckB"><span class="lever"></span>Si</label>
                                                </div>
                                            </div>
                                            <div class="col l6 m6 s12">
                                                <div class="select-wrapper input-field">
                                                    <select id="idoc">
                                                        <option value="" disabled="" selected="">Tipo de Documento de Identificación</option>
                                                        <option value="1">Documento Nacional de Identidad</option>
                                                        <option value="2">Carné Universitario</option>
                                                        <option value="3">Carné de Extranjería</option>
                                                    </select>
                                                </div>
                                                <div class="input-field">
                                                    <i class="mdi-action-credit-card prefix"></i>
                                                    <input id="idocumento" name="password" type="text" class="validate">
                                                    <label for="idocumento">N° de Documento</label>
                                                </div>
                                                <div class="select-wrapper input-field">
                                                    <select id="isexo">
                                                        <option value="" disabled="" selected="">Sexo</option>
                                                        <option value="M">Masculino</option>
                                                        <option value="F">Femenino</option>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="input-field" style="">
                                                <button type="button" onclick="regPersona()" class="waves-effect waves-light btn blue darken-1 col l6 offset-l3 m12 s12">Registrar</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>

            </div>
            <div class="modal-footer white">
                <a class="btn waves-effect waves-light btn-flat modal-action modal-close left white">Cancelar</a>
            </div>
        </div>
        <%@include file="../../jspf/footer.jspf" %>
        <script src="<c:url value="/resources/js/service/jsMiembrogpService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/service/jsPersonaService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsMiembrogp.js"></c:url>" type="text/javascript"></script>        
        <script src="<c:url value="/resources/js/vista/jsPersona.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/util/jsColors.js"></c:url>" type="text/javascript"></script>
        <script>
                                                    function regPersona() {
                                                        var nombre = $("#inombre").val();
                                                        var apellidos = $("#iapellido").val();
                                                        var idDoc = $("#idoc").val();
                                                        var isexo = $("#isexo").val();
                                                        var idocumento = $("#idocumento").val();
                                                        var a = $("#chckB").prop('checked');
                                                        var ibautizado = 0;
                                                        if (a) {
                                                            ibautizado = 1;
                                                        }
                                                        regBasicPersona(idDoc, idocumento, nombre, apellidos, isexo, ibautizado);
                                                    }
        </script>
    </body>
</html>
