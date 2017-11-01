/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function iglesiaService(){
    var connector = new jsConnector();
    this.addIglesia = function(iglesia,_callback){
        try {
            connector.post(url.iglesia.add, JSON.stringify(iglesia), function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.iglesia.add.title,
                        content: message.iglesia.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.iglesia.add.title,
                       content:message.iglesia.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateIglesia = function(iglesia, _callback){
        try {
            connector.post(url.iglesia.update,JSON.stringify(iglesia),function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.iglesia.update.title,
                        content:message.iglesia.update.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.iglesia.update.title,
                       content:message.iglesia.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    
    this.deleteIglesia = function(iglesia, _callback){
        try {
            connector.post(url.iglesia.delete,JSON.stringify(iglesia),function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.iglesia.delete.title,
                        content:message.iglesia.delete.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.iglesia.delete.title,
                       content:message.iglesia.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.listIglesia = function (distrito,_callback) {
        try {
            connector.post(url.iglesia.list, JSON.stringify(distrito), function (result) {
                if (result !== undefined && result !== null && result.length>0) {
                    _callback(result);
                }else{
                    infoMessage({
                       title:message.iglesia.list.title,
                       content:message.iglesia.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.getIglesia = function (iglesia, _callback) {
        try {
            connector.post("/iglesia/get", JSON.stringify(iglesia), function (result) {
                if (result.iglNombre !== undefined) {
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.iglesia.list.title,
                        content: message.iglesia.list.empty
                    });
                }
            });
        } catch (e) {
            console.error(e);
        }

    };
}