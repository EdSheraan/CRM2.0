<%-- 
  Document  : privilegios
  Created on : 11/10/2017, 12:21:18 PM
  Author   : Leandro Burgos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../jspf/general.jspf" %>
        <style>
            .contPriv{
                padding: 1%;
                color:white;
            }
            .contPriv:hover{
                -webkit-transform: scale(1.2);
                -ms-transform: scale(1.2);
                transform: scale(1.2);
                position: relative;
                z-index: 1;
            }
            .contPriv:not(:hover){
                position: relative;
                z-index: 0;
            }
            .size-icon{
                font-size: 60px;                
            }
        </style>
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>
        <div class="seaction">      
            <center>
                <div class="row light italic" style="margin-top: 10%">
                    <a href="<%=request.getContextPath()%>/grupo/main" class="contPriv waves-effect waves-light green darken-2">
                        <i class="mdi-action-list icon-demo size-icon"></i>
                        <p>Grupos Pequeños</p>
                    </a>
                    <a href="<%=request.getContextPath()%>/asistenciaevt/main" class="contPriv waves-effect waves-light green darken-1">
                        <i class="mdi-toggle-check-box icon-demo size-icon"></i>
                        <p>Registrar Asistencia</p>
                    </a>
                </div>
            </center>
        </div>
    </body>
</html>
