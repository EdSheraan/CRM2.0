/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var list_body = $('#list_body');
var gService = new grupoService();
$(document).ready(function () {
    gService.listGrupo({idEscuela: 1}, listGrupo);
});

function listGrupo(list) {
    var s = "";
    for (var i = 0; i < list.length; i++) {
        var grupo = list[i];
        s += '<tr>';
        s += '<td><button class="btn-floating waves-effect waves-light">D</button></td>';
        s += '<td class="condensed"><strong>' + grupo.gpoNombre + '</strong></td>';
        s += '<td class="condensed">Arnold Morales Gomez</td>';
        s += '<td>';
        s += '<a class="grey-text"><i class="mdi-editor-mode-edit tiny"></i></a>';
        s += '<a class="grey-text"><i class="mdi-content-clear tiny"></i></a>';
        s += '<a class="grey-text"><i class="mdi-navigation-more-vert tiny"></i></a>';
        s += '</td>';
        s += '</tr>';
    }
    $(list_body).empty();
    $(list_body).append(s);
}

function save() {
    var nombregp = $("#ngpo").val();
    var lreunion = $("#lgreu").val();
    var grupo = {
        gpoNombre: nombregp,
        gpoLugarReunion: lreunion,
        escuela: {
            idEscuela: 1
        }        
    };
    gService.addGrupo(grupo, alert);
}

                                                                