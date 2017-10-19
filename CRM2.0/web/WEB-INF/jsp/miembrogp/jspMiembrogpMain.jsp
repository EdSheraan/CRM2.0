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
                                    <h5>Miembros</h5>
                                    <table class="highlight">
                                        <tbody id="list_body">
                                            <tr style="margin: 0;padding: 0;">
                                                <td><button style="" class="btn-floating waves-effect waves-light purple">L</button></td>
                                                <td class="ligth italic">Leandro Jair Burgos Robles</td>
                                                <td class="thin tR"><i class="mdi-communication-call"></i>  963258741</td>
                                                <td class="thin tR"><i class="mdi-communication-email"></i>  leandroburgos@upeu.edu.pe</td>
                                                <td style="float:right">
                                                    <a class="grey-text" ><i class="mdi-editor-mode-edit actCRUD"></i></a>
                                                    <a class="grey-text" ><i class="mdi-action-delete actCRUD"></i></a>
                                                    <a class="grey-text"><i class="mdi-navigation-more-vert actCRUD"></i></a>
                                                </td>
                                            </tr>
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
    </body>
</html>
