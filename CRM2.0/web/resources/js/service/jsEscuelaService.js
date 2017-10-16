/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function escuelaService(){
    var connector = new jsConnector();
    this.addEscuela = function(escuela,_callback){
        try {
            connector.post(url.escuela.add, escuela, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.escuela.add.title,
                        content: message.escuela.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.escuela.add.title,
                       content:message.escuela.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateEscuela = function(escuela, _callback){
        try {
            connector.post(url.escuela.update,escuela,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.escuela.update.title,
                        content:message.escuela.update.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.escuela.update.title,
                       content:message.escuela.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    
    this.deleteEscuela = function(escuela, _callback){
        try {
            connector.post(url.escuela.delete,escuela,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.escuela.delete.title,
                        content:message.escuela.delete.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.escuela.delete.title,
                       content:message.escuela.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.listEscuela = function (_callback) {
        try {
            connector.post(url.escuela.list, JSON.stringify({id:1}), function (result) {
                if (result !== undefined && result !== null && result.length>0) {
                    _callback(result);
                }else{
                    infoMessage({
                       title:message.escuela.list.title,
                       content:message.escuela.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}