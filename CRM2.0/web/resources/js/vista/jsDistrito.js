var list_body = $('#list_body');
var dService = new distritoService();
$(document).ready(function () {
    var campo = {
        idCampo: 1
    };
    dService.listDistrito(campo, listDistrito);
});

function listDistrito(list) {
    var s = "";
    for (var i = 0; i < list.length; i++) {
        var distrito = list[i];
        var r = getLetter(distrito.disNombre);
        var date = new Date(distrito.disFechaCreacion);
        var year = date.getFullYear();
        var month = 1 + date.getMonth();
        var day = date.getDate();
        s += '<tr>';
        s += '<td style="width:38px;"><button class="btn-floating waves-effect waves-light ' + getColor() + '">' + r + '</button></td>';
        s += '<td class="condensed"><h6><strong>' + distrito.disNombre.toUpperCase() + '</strong></h6></td>';
        s += '<td class="tR"><small>Registrado el</small> ' + day + '/' + month + '/' + year + '</td>';
        s += '<td style="float:right">';
        s += '<a class="grey-text tR" onclick="updateDistrito(' + distrito.idDistrito + ')"><i class="mdi-editor-mode-edit actCRUD"></i></a>';
        s += '<a class="grey-text tR" onclick="deleteDistrito(' + distrito.idDistrito + ')"><i class="mdi-action-delete actCRUD"></i></a>';
        s += '<a class="grey-text tR"><i class="mdi-social-group actCRUD"></i></a>';
        s += '<a class="grey-text tS"><i class="mdi-action-info-outline actCRUD"></i></a>';
        s += '<a class="grey-text dropdown-button tS" data-activates="dropdown' + i + '"><i class="mdi-navigation-more-vert actCRUD"></i></a>';
        s += '<ul id="dropdown' + i + '" class="dropdown-content">';
        s += '<li><a onclick="updateDistrito(' + distrito.idDistrito + ')" class="-text">Editar</a></li>';
        s += '<li><a onclick="deleteDistrito(' + distrito.idDistrito + ')" class="-text">Eliminar</a></li>';
        //s += '<li><a href="#!" class="-text">Miembros</a></li>';
        s += '</ul>';
        s += '</td>';
        s += '</tr>';
    }
    $(list_body).empty();
    $(list_body).append(s);
    $('.dropdown-button').dropdown();
}

function updateDistrito(id) {
    var distrito = {idDistrito: id};
    dService.getDistrito(distrito, function (data) {
        var s = createModal(data.disNombre, "active");
        $(".modal-content").empty();
        $(".modal-content").append(s);
        $('#modal1').openModal();
    });
}

function deleteDistrito(idDistrito) {    
    confirmMessage({
        title: 'Eliminar Distrito Misionero',
        content: '¿Seguro que desea eliminar este distrito?'
    }, function(){
        var distrito = {idDistrito: idDistrito};
        dService.deleteDistrito(distrito, reload);
    });
}

function save() {
    var nombregp = $("#ndis").val();
    var lreunion = $("#lgreu").val();
    if (nombregp !== "" && lreunion !== "") {
        var distrito = {
            disNombre: nombregp,
            disLugarReunion: lreunion,
            campo: {idCampo: 1}
        };
        dService.addDistrito(distrito, reload);
    } else {
        alert("Campos Incompletos...");
    }
}

function reload(id) {
    if (id !== 0) {
        dService.listDistrito({idCampo: 1}, listDistrito);
    }
}

function createModal(nombre, clase) {
    var s = '';
    s += '<h5 class="thin">Distrito</h5>';
    s += '<div class="row">';
    s += '<form class="col s12">';
    s += '<div class="row">';
    s += '<div class="input-field col s12 l6 m6">';
    s += '<i class="mdi-social-group prefix"></i>';
    s += '<input id="ndis" type="text" class="validate" value="' + nombre + '">';
    s += '<label for="ndis" class="' + clase + '">Nombre</label>';
    s += '</div>';
    s += '</div>';
    s += '</form>';
    s += '</div>';
    return s;
}

function createDistrito() {
    var s = createModal("",  "");
    $(".modal-content").empty();
    $(".modal-content").append(s);
    $('#modal1').openModal();
}
                                                                