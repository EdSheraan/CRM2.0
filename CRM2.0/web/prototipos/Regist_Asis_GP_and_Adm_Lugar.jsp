<%-- 
    Document   : Hola1
    Created on : 19/09/2017, 01:44:52 PM
    Author     : alum.fial7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="js/plugins/data-tables/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <title>Asistencia de Grupos Pequeños</title>
    </head>

    <body>
        <nav>
            <div class="nav-wrapper" style="background:#37474f;">
                <a href="#" class="brand-logo"> <i style="margin-left: 10px;" class="large material-icons">dehaze</i></a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                </ul>
            </div>
        </nav>

        <div class="container" style="margin-top: 10px;width: 60%;">
            <table class="striped" style="margin-top: 15px;" id="example" >
                <thead>
                    <tr><h3 style="color:#1e88e5;"> Lista de asistencia del Grupo Pequeño Siloé</h3></tr>
                <tr>
                    <th style="text-align: center;">Nombre Completo</th>
                    <th style="text-align: center;">Nivel de Asistencia</th>
                    <th style="text-align: center;">Asistencia</th>
                </tr>
                </thead>    
                <tbody>
                    <tr>
                        <td><lu style="margin-right: 10px  ;"><i style="margin-top: " class="small material-icons">account_circle</i></lu>Estrella Barrientos Mogollon </td>
                <td>                                   
                    <div class="progress">
                        <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:85%">
                            85%
                        </div>
                    </div>
                </td>
                <td><div class="switch" >
                        <div style="text-align: center;">  <label>No <input type="checkbox"><span class="lever" ></span> Si  </label></div>
                    </div></td>
                </tr>

                <tr>
                    <td><lu style="margin-right: 10px  ;"><i style="margin-top: " class="small material-icons">account_circle</i></lu>Arnold Morales Gomes </td>
                <td>                                   
                    <div class="progress">
                        <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:90%">
                            90%
                        </div>
                    </div>
                </td>
                <td><div class="switch" >
                        <div style="text-align: center;">  <label>No <input type="checkbox"><span class="lever" ></span> Si  </label></div>
                    </div></td>
                </tr>

                <tr>
                    <td><lu style="margin-right: 10px  ;"><i style="margin-top: " class="small material-icons">account_circle</i></lu>Igor Chipana Berrocal </td>
                <td>                                   
                    <div class="progress">
                        <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:70%">
                            70%
                        </div>
                    </div>
                </td>
                <td><div class="switch" >
                        <div style="text-align: center;">  <label>No <input type="checkbox"><span class="lever" ></span> Si  </label></div>
                    </div></td>
                </tr>

                <tr>
                    <td><lu style="margin-right: 10px  ;"><i style="margin-top: " class="small material-icons">account_circle</i></lu>Leandro Burgos Robles </td>
                <td>                                   
                    <div class="progress">
                        <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:77%">
                            77%
                        </div>
                    </div>
                </td>
                <td><div class="switch" >
                        <div style="text-align: center;">  <label>No <input type="checkbox"><span class="lever" ></span> Si  </label></div>
                    </div></td>
                </tr>

                <tr>
                    <td><lu style="margin-right: 10px  ;"><i style="margin-top: " class="small material-icons">account_circle</i></lu>Jeiner Castro Vasquez </td>
                <td>                                   
                    <div class="progress">
                        <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:100%">
                            100%
                        </div>
                    </div>
                </td>
                <td><div class="switch" >
                        <div style="text-align: center;">  <label>No <input type="checkbox"><span class="lever" ></span> Si  </label></div>
                    </div></td>
                </tr>

                <tr>
                    <td><lu style="margin-right: 10px  ;"><i style="margin-top: " class="small material-icons">account_circle</i></lu>Juan Lucho Menecez </td>
                <td>                                   
                    <div class="progress">
                        <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:65%">
                            65%
                        </div>
                    </div>
                </td>
                <td><div class="switch" >
                        <div style="text-align: center;">  <label>No <input type="checkbox"><span class="lever" ></span> Si  </label></div>
                    </div></td>
                </tr>
                </tbody>
            </table>
            <div style="float: right; margin-top: 15px;margin-bottom: 20px;">
                <button class="btn waves-effect btn modal-trigger" type="" style="background:#1e88e5;" data-target="modal1" name="action">Registrar
                    <i class="material-icons right">send</i>
                </button>
            </div>
        </div>


        <!-- Modal Structure -->
        <div id="modal1" class="modal" style=" height: 38%;width: 40%;">
            <div class="modal-content">
                <h3 style="color:#37474f;">Registrar Lugar</h3>

                <form class="col s12" >
                    <div class="row">
                     
                        <div class="input-field col s4" >
                            <input type="number" class="validate">
                            <label style="color: #1e88e5;" > Número total de Asistentes </label>
                        </div>
                        <div class="input-field col s4">
                            <input type="number" class="validate">
                            <label style="color: #1e88e5;"> Número total de Faltas </label>
                        </div>
                           <div class="input-field col s4">
                            <input type="number" class="validate">
                            <label style="color: #1e88e5;;" > Número de visitantes </label>
                        </div>
                        
                    </div>
                </form>
                <form class="col s12">
                    <div class="row">
                        <div class="input-field col s1">
                        </div>
                        <div class="input-field col s10">
                            <input type="text" class="validate">
                            <label style="color: #1e88e5;" > Lugar donde se reunieron </label>
                        </div>
                        <div class="input-field col s1">
                        </div>
                    </div>
                </form>


                <form class="col s12">
                    <div class="row"> 
                        <div class="input-field col s1">
                        </div>   
                        <div class="input-field col s2"> 
                          <a class="modal-action modal-close waves-effect btn" style="background:#e53935;" >Cancelar</a>
                        </div>
                        <div class="input-field col s6"> 
                        </div> 
                        <div class="input-field col s2">                          
                          <a class="modal-action modal-close waves-effect btn" style="background:#1e88e5;" >Registrar</a>
                        </div>
                        <div class="input-field col s1">
                        </div>
                    </div>
                </form>
              </div>
       </div>
    </body>
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
    <script src="js/materialize.min.js" type="text/javascript"></script>
    <script src="js/materialize.js" type="text/javascript"></script>
    <script src="js/plugins.min.js" type="text/javascript"></script>
    <script src="js/custom-script.js" type="text/javascript"></script>
    <script src="js/materialize.min.js" type="text/javascript"></script>

    <!-- <script src="js/plugins/data-tables/js/jquery.js" type="text/javascript"></script>
    <script src="js/plugins/data-tables/js/jquery.dataTables.min.js" type="text/javascript"></script>-->
    <!--Descomentar estos dos links para que funcione la datatable-->

    <script type="text/javascript">
        $(document).ready(function () {
            $('.modal-trigger').leanModal();
        });
    </script>

</html>