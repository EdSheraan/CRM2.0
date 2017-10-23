var list_body = $('#list_body');
var mgpService = new miembrogpService();

$(document).ready(function () {
    var grupo = {idGrupo: 1};
    mgpService.listMiembrogp(grupo, mostrar);
});

function mostrar(list) {
    var s = "";
    for (var i = 0, max = list.length; i < max; i++) {
        var r = getLetter(list[i].persona.perNombres);
        var t = list[i].persona.perTelefono;
        (t === undefined) ? t = "Sin celular" : t;
        var c = list[i].persona.perCorreo;
        (c === undefined) ? c = "Sin correo" : c;
        s += '<tr>';
        s += '<td style="width:38px;"><button style="' + color[getRandom(color.length)] + '" class="btn-floating waves-effect waves-light">' + r + '</button></td>';
        s += '<td class="ligth italic">' + list[i].persona.perNombres + ' ' + list[i].persona.perApellidos + '</td>';
        s += '<td class="thin tR"><i class="mdi-communication-call"></i>  ' + t + '</td>';
        s += '<td class="thin tR"><i class="mdi-communication-email"></i>  ' + c + '</td>';
        s += '<td style="float:right">';
        s += '<a class="grey-text" ><i class="mdi-action-delete actCRUD"></i></a>';
        s += '<a class="grey-text"><i class="mdi-social-person actCRUD"></i></a>';
        //s += '<a class="grey-text"><i class="mdi-navigation-more-vert actCRUD"></i></a>';
        s += '</td>';
        s += '</tr>';
    }
    $(list_body).empty();
    $(list_body).append(s);

}
