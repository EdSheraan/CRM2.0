/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function campoService() {
    var connector = new jsConnector();

    this.addCampo = function (campo, _callback) {
        try {
            connector.post(url.campo.add, campo, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.campo.add.title,
                        content: message.campo.add.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.campo.add.title,
                        content: message.campo.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateCampo = function (campo, _callback) {
        try {
            connector.post(url.campo.update, campo, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.campo.update.title,
                        content: message.campo.update.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.campo.update.title,
                        content: message.campo.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };

    this.deleteCampo = function (campo, _callback) {
        try {
            connector.post(url.campo.delete, campo, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.campo.delete.title,
                        content: message.campo.delete.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.campo.delete.title,
                        content: message.campo.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.listCampo = function (_callback) {
        try {
            connector.post(url.campo.list, JSON.stringify({id: 1}), function (result) {
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.campo.list.title,
                        content: message.campo.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}