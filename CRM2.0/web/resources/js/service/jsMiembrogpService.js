function miembrogpService(){
    var connector = new jsConnector();
    this.addMiembrogp = function(miembrogp,_callback){
        try {
            connector.post(url.miembrogp.add, miembrogp, function (result) {
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.miembrogp.add.title,
                        content: message.miembrogp.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.miembrogp.add.title,
                       content:message.miembrogp.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateMiembrogp = function(miembrogp, _callback){
        try {
            connector.post(url.miembrogp.update,miembrogp,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.miembrogp.update.title,
                        content:message.miembrogp.update.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.miembrogp.update.title,
                       content:message.miembrogp.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    
    this.deleteMiembrogp = function(miembrogp, _callback){
        try {
            connector.post(url.miembrogp.delete,miembrogp,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.miembrogp.delete.title,
                        content:message.miembrogp.delete.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.miembrogp.delete.title,
                       content:message.miembrogp.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.listMiembrogp = function (grupo,_callback) {
        try {
            connector.post(url.miembrogp.list, JSON.stringify(grupo), function (result) {
                if (result !== undefined && result !== null && result.length>0) {
                    _callback(result);
                }else{
                    infoMessage({
                       title:message.miembrogp.list.title,
                       content:message.miembrogp.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}