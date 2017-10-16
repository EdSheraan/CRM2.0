var list_body = $('#list_body');
var gService = new grupoService();
$(document).ready(function () {
    gService.listGrupo({idEscuela: 1}, listGrupo);
});

function listGrupo(list) {
    var s = "";
    for (var i = 0; i < list.length; i++) {
        var grupo = list[i];
        var r = getLetter(grupo.gpoNombre);
        s += '<tr>';
        s += '<td><button class="btn-floating waves-effect waves-light amber">' + r + '</button></td>';
        s += '<td class="condensed"><h6><strong>' + grupo.gpoNombre + '</strong></h6></td>';
        s += '<td class="condensed">' + grupo.gpoLugarReunion + '</td>';
        s += '<td style="float:right">';
        s += '<a class="grey-text" onclick="updateGrupo()"><i class="mdi-editor-mode-edit actCRUD"></i></a>';
        s += '<a class="grey-text" onclick="deleteGrupo()"><i class="mdi-content-clear actCRUD"></i></a>';
        s += '<a class="grey-text"><i class="mdi-navigation-more-vert actCRUD"></i></a>';
        s += '</td>';
        s += '</tr>';
    }
    $(list_body).empty();
    $(list_body).append(s);
}

function getLetter(nombre) {
    var letter = nombre.split("");
    var Let = letter[0];
    return Let.toUpperCase();
}

function updateGrupo(){
    console.log("Loading...");
}

function deleteGrupo() {
    var reply = confirm("¿Seguro que desea eliminar este grupo?");
    if (reply === true) {
        console.log("Eliminando...");
    }else{
        console.log("nancy");
    }
}

function save() {
    var nombregp = $("#ngpo").val();
    var lreunion = $("#lgreu").val();
    var grupo = {
        gpoNombre: nombregp,
        gpoLugarReunion: lreunion
    };
    gService.addGrupo(grupo, reload);
}
function reload(id) {
    if (id !== 0) {
        gService.listGrupo({idEscuela: 1}, listGrupo);
    }
}

                                                                