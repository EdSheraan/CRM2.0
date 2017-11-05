<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../jspf/general.jspf" %>
        <link href="<c:url value='/resources/css/custom/privilegio.css'></c:url>" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>
        <div class="seaction">      
            <center>
                <div class="row light italic" style="margin-top: 10%">
                    <c:forEach items="${sessionScope.prvRol}" var="modulo">
                        <c:if test="${!empty modulo.childs}">
                            <c:if test="${modulo.parent.idPrivilegio == sessionScope.modSelected}">
                                <c:forEach items="${modulo.childs}" var="child">
                                    <a href="<%=request.getContextPath()%>/${child.prvLink}" class="contPriv waves-effect waves-light ${child.prvColor}">
                                        <i class="${child.prvIcono} icon-demo size-icon"></i>
                                        <p>${child.prvNombre}</p>
                                    </a>
                                </c:forEach>
                            </c:if> 
                        </c:if>                        
                    </c:forEach>
                </div>
            </center>
        </div>
    </body>
</html>
