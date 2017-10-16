/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function rolService() {
    var connector = new jsConnector();
    //Aqui se registra cada método a utilizarse
    //Evitar la interaccion con HTML
    this.addRol = function (rol, _callback) {
        try {
            connector.post(url.rol.add, rol, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.rol.add.title,
                        content: message.rol.add.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.rol.add.title,
                        content: message.rol.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateRol = function (rol, _callback) {
        try {
            connector.post(url.rol.update, rol, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.rol.update.title,
                        content: message.rol.update.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.rol.update.title,
                        content: message.rol.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };

    this.deleteRol = function (rol, _callback) {
        try {
            connector.post(url.rol.delete, rol, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.rol.delete.title,
                        content: message.rol.delete.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.rol.delete.title,
                        content: message.rol.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.listRol = function (_callback) {
        try {
            connector.post(url.rol.list, JSON.stringify({id: 1}), function (result) {
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.rol.list.title,
                        content: message.rol.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}