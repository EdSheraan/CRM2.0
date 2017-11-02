var list_body = $('#list_body');
var gService = new grupoService();
var grupoAct;
$(document).ready(function () {
    gService.listGrupo({idEscuela: 1}, listGrupo);
});

function listGrupo(list) {
    var s = "";
    for (var i = 0; i < list.length; i++) {
        var grupo = list[i];
        var r = getLetter(grupo.gpoNombre);
        var date = new Date(grupo.gpoFechaCreacion);
        var year = date.getFullYear();
        var month = 1 + date.getMonth();
        var day = date.getDate();
        s += '<tr>';
        s += '<td style="width:38px;"><button class="btn-floating waves-effect waves-light ' + getColor() + '">' + r + '</button></td>';
        s += '<td class="condensed"><h6><strong>' + grupo.gpoNombre.toUpperCase() + '</strong></h6></td>';
        s += '<td class="tR"><small>Registrado el</small> ' + day + '/' + month + '/' + year + '</td>';
        //s += '<td class="tR"><strong><small>Lider : </small> Arnold Danilo Morales Gomez</strong></td>';
        s += '<td class="tR">' + grupo.gpoLugarReunion + '</td>';
        s += '<td style="float:right">';
        s += '<a class="grey-text tR" onclick="updateGrupo(' + grupo.idGrupo + ')"><i class="mdi-editor-mode-edit actCRUD"></i></a>';
        s += '<a class="grey-text tR" onclick="deleteGrupo(' + grupo.idGrupo + ')"><i class="mdi-action-delete actCRUD"></i></a>';
        s += '<a class="grey-text tR"><i class="mdi-social-group actCRUD"></i></a>';
        s += '<a class="grey-text tS"><i class="mdi-action-info-outline actCRUD"></i></a>';
        s += '<a class="grey-text dropdown-button tS" data-activates="dropdown' + i + '"><i class="mdi-navigation-more-vert actCRUD"></i></a>';
        s += '<ul id="dropdown' + i + '" class="dropdown-content">';
        s += '<li><a onclick="updateGrupo(' + grupo.idGrupo + ')" class="-text">Editar</a></li>';
        s += '<li><a onclick="deleteGrupo(' + grupo.idGrupo + ')" class="-text">Eliminar</a></li>';
        s += '<li><a href="#!" class="-text">Miembros</a></li>';
        s += '</ul>';
        s += '</td>';
        s += '</tr>';
    }
    $(list_body).empty();
    $(list_body).append(s);
    $('.dropdown-button').dropdown();
}

function updateGrupo(id) {
    var grupo = {idGrupo: id};
    gService.getGrupo(grupo, function (data) {
        grupoAct = data;
        var s = createModal("update", data.gpoNombre, data.gpoLugarReunion, "active");
        $(".modal-content").empty();
        $(".modal-content").append(s);
        $('#modal1').openModal();
    });
}

function deleteGrupo(idGrupo) {
    confirmMessage({
        title: 'Eliminar Grupo Pequeño',
        content: '¿Seguro que desea eliminar este grupo?'
    }, function () {
        var grupo = {idGrupo: idGrupo};
        gService.deleteGrupo(grupo, reload);
    });
}

function save() {
    var nombregp = $("#ngpo").val();
    var lreunion = $("#lgreu").val();
    var tip = $("#tipModal").val();
    if (nombregp !== "" && lreunion !== "") {
        var grupo;
        if (tip === "create") {
            grupo = {
                gpoNombre: nombregp,
                gpoLugarReunion: lreunion,
                escuela: {idEscuela: 1}
            };
            gService.addGrupo(grupo, reload);
        }
        if (tip === "update") {
            grupo = {
                gpoNombre: nombregp,
                gpoLugarReunion: lreunion,
                idGrupo: grupoAct.idGrupo,
                gpoEstado: grupoAct.gpoEstado,
                gpoUsuAdd: grupoAct.gpoUsuAdd,
                gpoFechaCreacion: grupoAct.gpoFechaCreacion,
                gpoFechaAdd : grupoAct.gpoFechaAdd,
                escuela: {idEscuela: grupoAct.escuela.idEscuela}
            };
            gService.updateGrupo(grupo, reload);
        }
    } else {
        alert("Campos Incompletos...");
    }
}

function reload(id) {
    if (id !== 0) {
        gService.listGrupo({idEscuela: 1}, listGrupo);
    }
}

function createModal(tipo, nombre, lugar, clase) {
    var s = '';
    s += '<h5 class="hide-on-small-only">Grupo Pequeño</h5>';
    s += '<div class="row">';
    s += '<form class="col s12">';
    s += '<div class="row">';
    s += '<div class="input-field col s12 l6 m6">';
    s += '<i class="mdi-social-group prefix"></i>';
    s += '<input id="ngpo" type="text" class="validate" value="' + nombre + '">';
    s += '<label for="ngpo" class="' + clase + '">Nombre</label>';
    s += '</div>';
    s += '<div class="input-field col s12 l6 m6">';
    s += '<i class="mdi-action-home prefix"></i>';
    s += '<input id="lgreu" type="text" class="validate" value="' + lugar + '">';
    s += '<label for="lgreu" class="' + clase + '">Lugar de Reunión</label>';
    s += '</div>';
    s += '</div>';
    s += '<input type="hidden" value=' + tipo + ' id="tipModal">';
    s += '</form>';
    s += '</div>';
    return s;
}

function createGroup() {
    var s = createModal("create", "", "", "");
    $(".modal-content").empty();
    $(".modal-content").append(s);
    $('#modal1').openModal();
}
                                                                