/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var pService  = new periodoService();

$(document).ready(function(){
    if(userInfo.distrito.idDistrito!== 'null'){
        if(userInfo.iglesia.idIglesia !== 'null'){
            $('#title_periodo').text("de la Iglesia "+ userInfo.iglesia.iglNombre);
        }else{
            $('#title_periodo').text("del distrito "+ userInfo.distrito.disNombre);
        }
    }
    
});

function listPeriodo(){
    
}


