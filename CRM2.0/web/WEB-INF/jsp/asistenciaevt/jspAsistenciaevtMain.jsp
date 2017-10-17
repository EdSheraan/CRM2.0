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
    <body class="white">
        <%@include file="../../jspf/header.jspf" %>   
        <div id="main">
            <div class="wrapper">
                <%@include file="../../jspf/left_aside.jspf" %>
                <section id="content">
                    <div class="container">
                        <div class="row">
                            <div class="col s12 m12 l10 offset-l1" style="margin-top: 2%;">
                                <h5>Lista de Grupos Pequeños</h5>
                                <table class="highlight">
                                    <tbody id="list_body">
                                        <tr>
                                            <td style="width:38px;"><button style="" class="btn-floating waves-effect waves-light">D</button></td>
                                            <td class="condensed"><h6><strong>ASDAS</strong></h6></td>
                                            <td class="condensed">ADASDS</td>
                                            <td style="float:right">
                                                <a class="grey-text" onclick="updateGrupo(' + grupo.idGrupo + ')"><i class="mdi-editor-mode-edit actCRUD"></i></a>
                                                <a class="grey-text" onclick="deleteGrupo(' + grupo.idGrupo + ')"><i class="mdi-content-clear actCRUD"></i></a>
                                                <a class="grey-text"><i class="mdi-navigation-more-vert actCRUD"></i></a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </section>            
            </div>
        </div>
    </body>
</html>
