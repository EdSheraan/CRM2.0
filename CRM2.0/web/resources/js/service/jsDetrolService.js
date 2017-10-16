/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function detrolService(){
    var connector = new jsConnector();
    this.addDetrol = function(detrol,_callback){
        try {
            connector.post(url.detrol.add, detrol, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.detrol.add.title,
                        content: message.detrol.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.detrol.add.title,
                       content:message.detrol.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateDetrol = function(detrol, _callback){
        try {
            connector.post(url.detrol.update,detrol,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.detrol.update.title,
                        content:message.detrol.update.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.detrol.update.title,
                       content:message.detrol.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    
    this.deleteDetrol = function(detrol, _callback){
        try {
            connector.post(url.detrol.delete,detrol,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.detrol.delete.title,
                        content:message.detrol.delete.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.detrol.delete.title,
                       content:message.detrol.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.listDetrol = function (_callback) {
        try {
            connector.post(url.detrol.list, JSON.stringify({id:1}), function (result) {
                if (result !== undefined && result !== null && result.length>0) {
                    _callback(result);
                }else{
                    infoMessage({
                       title:message.detrol.list.title,
                       content:message.detrol.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}