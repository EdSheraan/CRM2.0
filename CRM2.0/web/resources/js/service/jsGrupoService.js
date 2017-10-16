/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function grupoService(){
    var connector = new jsConnector();
    this.addGrupo = function(grupo,_callback){
        try {
            connector.post(url.grupo.add, JSON.stringify(grupo), function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.grupo.add.title,
                        content: message.grupo.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.grupo.add.title,
                       content:message.grupo.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateGrupo = function(grupo, _callback){
        var connectionUrl = "/grupo/update";
        try {
            connector.post(connectionUrl,grupo,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.grupo.update.title,
                        content:message.grupo.update.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.grupo.update.title,
                       content:message.grupo.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    
    this.deleteGrupo = function(grupo, _callback){
        var connectionUrl = "/grupo/delete";
        try {
            connector.post(connectionUrl,grupo,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.grupo.delete.title,
                        content:message.grupo.delete.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.grupo.delete.title,
                       content:message.grupo.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.listGrupo = function (escuela,_callback) {
        var connectionUrl = "/grupo/list";
        try {
            connector.post(connectionUrl, JSON.stringify(escuela), function (result) {
                if (result !== undefined && result !== null && result.length>0) {
                    _callback(result);
                }else{
                    infoMessage({
                       title:message.grupo.list.title,
                       content:message.grupo.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}