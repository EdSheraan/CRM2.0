/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var list_body = $('#list_body');

$(document).ready(function(){
    var uService = new unionpService();
    uService.listUnionp(listUnionp);
});

function listUnionp(list){
    var s = "";
    console.log(list);
    for (var i = 0; i < list.length; i++) {
        var unionp = list[i];
        s += '<li class="collection-item avatar">';
        s += '<div class="col l2 ">';
        s += '<div class="circle red" style="display: table;margin: auto;">';
        s += '<h5 style="display: table-cell;vertical-align: middle;text-align: center;color: white">B</h5>';
        s += '</div>';
        s += '<strong><span class="title">'+unionp.uniNombre+'</span></strong>';
        s += '<p class="collections-content"><span class="task-cat green accent-3">Activo</span></p>';
        s += '</div>';
        s += '<div class="col l4">';
        s += '<p class="collections-content">asfhgdsahsdghfsdhgfhgd</p>';
        s += '<p class="collections-content"><span class="task-cat blue darken-1">MIPES de G.P.</span></p>';
        s += '</div>';
        s += '<div class="col l3">';
        s += '<p class="collections-content">17-09-2017</p>';
        s += '<p class="collections-content"><span class="task-cat amber darken-1">'+unionp.uniFechaCreacion+'</span></p>';
        s += '</div>';
        s += '<div class="col l3">';
        s += '<a class="btn-floating waves-effect btn-large waves-light blue darken-1 btn modal-trigger tooltipped blue darken-2" href="#modal2" data-tooltip="Editar"><i class="mdi-content-create"></i></a>';
        s += '<a class="btn-floating waves-effect btn-large waves-light red"><i class="mdi-content-clear"></i></a>';
        s += '</div>';
        s += '</li>';
    }
    $(list_body).empty();
    $(list_body).append(s);
}