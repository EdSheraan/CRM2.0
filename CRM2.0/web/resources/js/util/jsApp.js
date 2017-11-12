/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var dependencies = [''];
var userInfo ={};
$(document).ready(function () {
    userInfo ={
    union :{
        idUnion: $('#crm_idUnion').val(),
        uniNombre : $('#crm_uniNombre').val()
    },
    campo :{
        idCampo: $('#crm_idCampo').val(),
        cmpNombre : $('#crm_cmpNombre').val()
    },
    distrito:{
        idDistrito: $('#crm_idDistrito').val(),
        disNombre:$('#crm_disNombre').val()
    },
    iglesia:{
        idIglesia: $('#crm_idIglesia').val(),
        iglNombre:$('#crm_iglNombre').val()
    },
    escuela:{
        idEscuela: $('#crm_idEscuela').val(),
        escNombre:$('#crm_escNombre').val()
    },
    ministerio:{
        idMinisterio: $('#crm_idMinisterio').val(),
        minNombre:$('#crm_minNombre').val()
    },
    grupo:{
        idGrupo: $('#crm_idGrupo').val(),
        gpoNombre:$('#crm_gpoNombre').val()
    },
    perNombre: $('#crm_perNombre').val(),
    perApellidos: $('#crm_perApellidos').val(),
    idPersona: $('#crm_idPersona').val()
};
});
/**
 * 
 * @param {type} name
 * @returns {undefined}
 */
function checkDependecies(name) {

}
