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
            <a class="btn-floating btn-large green accent-3 modal-trigger" href="#modal1">
                <i class="mdi-social-person-add"></i>
            </a>
        </div>
        <%@include file="../../jspf/footer.jspf" %>
        <script src="<c:url value="/resources/js/service/jsMiembrogpService.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/vista/jsMiembrogp.js"></c:url>" type="text/javascript"></script>
        <script src="<c:url value="/resources/js/util/jsColors.js"></c:url>" type="text/javascript"></script>
    </body>
</html>
