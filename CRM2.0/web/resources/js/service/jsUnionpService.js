/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function unionpService(){
    
    this.addUnionp = function(unionp,_callback){
        var connectionUrl ="/unionp/add";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl, unionp, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.unionp.add.title,
                        content: message.unionp.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.unionp.add.title,
                       content:message.unionp.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateUnionp = function(unionp, _callback){
        var connectionUrl = "/unionp/update";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl,unionp,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.unionp.update.title,
                        content:message.unionp.update.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.unionp.update.title,
                       content:message.unionp.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    
    this.deleteUnionp = function(unionp, _callback){
        var connectionUrl = "/unionp/delete";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl,unionp,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.unionp.delete.title,
                        content:message.unionp.delete.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.unionp.delete.title,
                       content:message.unionp.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.listUnionp = function (_callback) {
        var connectionUrl = "/unionp/list";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl, JSON.stringify({id:1}), function (result) {
                if (result !== undefined && result !== null && result.length>0) {
                    _callback(result);
                }else{
                    infoMessage({
                       title:message.unionp.list.title,
                       content:message.unionp.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}