var list_body = $('#list_body');
var gService = new grupoService();
$(document).ready(function () {
    gService.listGrupo({idEscuela: 1}, listGrupo);
});

function listGrupo(list) {
    console.log("Cargando Grupos ...");
    var s = "";
    var state = "";
    for (var i = 0; i < list.length; i++) {
        var grupo = list[i];
        var r = getLetter(grupo.gpoNombre);
        var status = grupo.gpoEstado;
        if (parseInt(status) === 1) {
            state = "<h6 class='thin black-text'>Activo</h6>";
        } else {
            state = "<h6 class='thin black-text'>Inactivo</h6>";
        }
        s += '<tr>';
        s += '<td style="width:38px;"><button style="' + color[getRandom(color.length)] + '" class="btn-floating waves-effect waves-light">' + r + '</button></td>';
        s += '<td class="condensed"><h6><strong>' + grupo.gpoNombre.toUpperCase() + '</strong></h6></td>';
        s += '<td class="condensed">' + state + '</td>';
        s += '<td style="float:right">';
        s += '<a class="grey-text" onclick="updateGrupo(' + grupo.idGrupo + ')"><i class="mdi-editor-mode-edit actCRUD"></i></a>';
        s += '<a class="grey-text" onclick="deleteGrupo(' + grupo.idGrupo + ')"><i class="mdi-action-delete actCRUD"></i></a>';
        s += '<a class="grey-text"><i class="mdi-navigation-more-vert actCRUD"></i></a>';
        s += '</td>';
        s += '</tr>';
    }
    $(list_body).empty();
    $(list_body).append(s);
}

function updateGrupo(id) {
    console.log("Comenzando a editar...");
    var s = createModal("Damasco I", "Casa de Arnold", "active");
    $(".modal-content").empty();
    $(".modal-content").append(s);
    $('#modal1').openModal();
}

function deleteGrupo(idGrupo) {
    var reply = confirm("¿Seguro que desea eliminar este grupo?");
    if (reply === true) {
        console.log(idGrupo);
        console.log("Eliminando...");
        var grupo = {idGrupo: idGrupo, escuela:{idEscuela:1}};
        gService.deleteGrupo(grupo, reload);
    } else {
        console.log("nancy");
    }
}

function save() {
    var nombregp = $("#ngpo").val();
    var lreunion = $("#lgreu").val();
    var grupo = {
        gpoNombre: nombregp,
        gpoLugarReunion: lreunion,
        escuela:{idEscuela:1}
    };
    gService.addGrupo(grupo, reload);
}

function reload(id) {
    if (id !== 0) {
        gService.listGrupo({idEscuela: 1}, listGrupo);
    }
}

function createModal(nombre, lugar, clase) {
    var s = '';
    s += '<h5 class="thin">Grupo Pequeño</h5>';
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
    s += '</form>';
    s += '</div>';
    return s;
}

function createGroup() {
    var s = createModal("", "", "");
    $(".modal-content").empty();
    $(".modal-content").append(s);
    $('#modal1').openModal();
}
                                                                