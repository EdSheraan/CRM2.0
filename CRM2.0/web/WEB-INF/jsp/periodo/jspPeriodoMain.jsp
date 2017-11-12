<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                            <div class="col s12 m12 l10 offset-l1" style="margin-top: 2%;">
                                <h5>Gestion de Periodos de Trabajo</h5>
                                <p>Administración de todos los periodos de trabajo <span id="title_periodo"></span></p>
                                <table class="highlight light italic">
                                    <tbody id="list_body"></tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </section>            
            </div>
        </div>
        <div class="modal">
            <div class="modal-content">
                
            </div>
        </div>

        <script src="<c:url value="/resources/js/service/jsPeriodoService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsPeriodo.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
