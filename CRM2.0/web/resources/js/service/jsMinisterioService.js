/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function ministerioService(){
    var connector = new jsConnector();
    this.addMinisterio = function(ministerio,_callback){
        try {
            connector.post(url.ministerio.add, ministerio, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.ministerio.add.title,
                        content: message.ministerio.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.ministerio.add.title,
                       content:message.ministerio.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateMinisterio = function(ministerio, _callback){
        try {
            connector.post(url.ministerio.update,ministerio,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.ministerio.update.title,
                        content:message.ministerio.update.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.ministerio.update.title,
                       content:message.ministerio.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    
    this.deleteMinisterio = function(ministerio, _callback){
        try {
            connector.post(url.ministerio.delete,ministerio,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.ministerio.delete.title,
                        content:message.ministerio.delete.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.ministerio.delete.title,
                       content:message.ministerio.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.listMinisterio = function (_callback) {
        try {
            connector.post(url.ministerio.list, JSON.stringify({id:1}), function (result) {
                if (result !== undefined && result !== null && result.length>0) {
                    _callback(result);
                }else{
                    infoMessage({
                       title:message.ministerio.list.title,
                       content:message.ministerio.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}