/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function distritoService() {
    var connector = new jsConnector();
    this.addDistrito = function (distrito, _callback) {
        try {
            connector.post(url.distrito.add, JSON.stringify(distrito), function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.distrito.add.title,
                        content: message.distrito.add.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.distrito.add.title,
                        content: message.distrito.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateDistrito = function (distrito, _callback) {
        try {
            connector.post(url.distrito.update, JSON.stringify(distrito), function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.distrito.update.title,
                        content: message.distrito.update.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.distrito.update.title,
                        content: message.distrito.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };

    this.deleteDistrito = function (distrito, _callback) {
        try {
            connector.post(url.distrito.delete, JSON.stringify(distrito), function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.distrito.delete.title,
                        content: message.distrito.delete.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.distrito.delete.title,
                        content: message.distrito.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.listDistrito = function (campo, _callback) {
        try {
            connector.post(url.distrito.list, JSON.stringify(campo), function (result) {
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.distrito.list.title,
                        content: message.distrito.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
    
    this.getDistrito = function (distrito, _callback) {
        try {
            connector.post("/distrito/get", JSON.stringify(distrito), function (result) {
                if (result.disNombre !== undefined) {
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.distrito.list.title,
                        content: message.distrito.list.empty
                    });
                }
            });
        } catch (e) {
            console.error(e);
        }

    };
}