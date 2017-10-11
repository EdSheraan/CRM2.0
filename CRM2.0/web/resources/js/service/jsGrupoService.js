/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function grupoService(){
    
    this.addGrupo = function(grupo,_callback){
        var connectionUrl ="/grupo/add";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl, grupo, function (result) {
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
        var connector = new jsConnector();
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
        var connector = new jsConnector();
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
    
    this.listGrupo = function (_callback) {
        var connectionUrl = "/grupo/list";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl, null, function (result) {
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