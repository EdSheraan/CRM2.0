function asistenciaevtService(){
    var connector = new jsConnector();
    this.addAsistenciaevt = function(asistenciaevt,_callback){
        try {
            connector.post(url.asistenciaevt.add, JSON.stringify(asistenciaevt), function (result) {
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.asistenciaevt.add.title,
                        content: message.asistenciaevt.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.asistenciaevt.add.title,
                       content:message.asistenciaevt.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateAsistenciaevt = function(asistenciaevt, _callback){
        try {
            connector.post(url.asistenciaevt.update,asistenciaevt,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.asistenciaevt.update.title,
                        content:message.asistenciaevt.update.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.asistenciaevt.update.title,
                       content:message.asistenciaevt.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    
    this.deleteAsistenciaevt = function(asistenciaevt, _callback){
        try {
            connector.post(url.asistenciaevt.delete,asistenciaevt,function(result){
                if (result!== undefined && result!==null && result === 1) {
                    successMessage({
                        title:message.asistenciaevt.delete.title,
                        content:message.asistenciaevt.delete.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.asistenciaevt.delete.title,
                       content:message.asistenciaevt.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.listAsistenciaevt = function (_callback) {
        //No implementado aún
    };
}