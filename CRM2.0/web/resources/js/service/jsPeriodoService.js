/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function periodoService() {
    var connector = new jsConnector();
    //Aqui se registra cada método a utilizarse
    //Evitar la interaccion con HTML
    this.addPeriodo = function (periodo, _callback) {
        try {
            connector.post(url.periodo.add, periodo, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.periodo.add.title,
                        content: message.periodo.add.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.periodo.add.title,
                        content: message.periodo.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updatePeriodo = function (periodo, _callback) {
        try {
            connector.post(url.periodo.update, periodo, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.periodo.update.title,
                        content: message.periodo.update.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.periodo.update.title,
                        content: message.periodo.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };

    this.deletePeriodo = function (periodo, _callback) {
        try {
            connector.post(url.periodo.delete, periodo, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.periodo.delete.title,
                        content: message.periodo.delete.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.periodo.delete.title,
                        content: message.periodo.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.listPeriodo = function (_callback) {
        try {
            connector.post(url.periodo.list, JSON.stringify({id: 1}), function (result) {
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.periodo.list.title,
                        content: message.periodo.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}