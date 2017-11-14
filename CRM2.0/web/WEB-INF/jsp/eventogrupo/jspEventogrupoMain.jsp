<%-- 
    Document   : jspEventogrupoMain
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
        <link href="<c:url value='/resources/css/jquery.easy-pie-chart.css'></c:url>" rel="stylesheet" type="text/css"/>
            <style>
                .titleGP{
                    text-align: right
                }
                td,th{
                    padding:0px 5px; 
                }
                #content .container{
                    padding-bottom: 30px;
                }
            </style>
        </head>
        <body class="white">
        <%@include file="../../jspf/header.jspf" %>   
        <div id="main">
            <div class="wrapper">
                <%@include file="../../jspf/left_aside.jspf" %>
                <section id="content">
                    <div class="container">
                        <div class="row">
                            <div class="col s12 m12 l12">
                                <ol class="breadcrumbs light italic conH">                                    
                                </ol>
                            </div>
                            <div class="col s12 m12 l10 offset-l1 row contAsis">                                
                            </div>
                        </div>
                    </div>
                </section> 
            </div>
        </div>
        <%@include file="../../jspf/footer.jspf" %>
        <script src="<c:url value='/resources/js/plugins/jquery.easypiechart.min.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/service/jsEventoService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/service/jsEventogrupoService.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/service/jsAsmiemgpService.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/service/jsMiembrogpService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/service/jsGrupoService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/vista/jsEventogrupo.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value='/resources/js/vista/jsAsmiemgp.js'></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/util/jsColors.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/util/jsDateConverter.js"></c:url>" type="text/javascript"></script>        
    </body>
</html>
