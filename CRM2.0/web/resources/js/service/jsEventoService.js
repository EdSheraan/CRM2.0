/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function eventoService() {
    var connector = new jsConnector();
    /**
     * Registrar un nuevo evento
     * @param {type} evento : bean evento
     * @param {type} _callback : funcion a ejecutarse luego de registrar
     * @returns {undefined}
     */
    this.addEvento = function (evento, _callback) {
        try {
            connector.post(url.evento.add, evento, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.evento.add.title,
                        content: message.evento.add.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.evento.add.title,
                        content: message.evento.add.error
                    });
                }

            });
        } catch (e) {
            console.log(e);
        }
    };

    /**
     * Actualizar datos de un evento
     * @param {type} evento : bean evento
     * @param {type} _callback : funcion a ejecutarse luego de actualizar
     * @returns {undefined}
     */
    this.updateEvento = function (evento, _callback) {
        try {
            connector.post(url.evento.update, evento, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null && result !== 0) {
                    successMessage({
                        title: message.evento.update.title,
                        content: message.evento.update.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.evento.update.title,
                        content: message.evento.update.error
                    });
                }

            });
        } catch (e) {
            console.log(e);
        }
    };

    /**
     * Eliminar un evento
     * @param {type} evento : bean evento
     * @param {type} _callback : funcion a ejecutarse luego de eliminar
     * @returns {undefined}
     */
    this.deleteEvento = function (evento, _callback) {
        try {
            connector.post(url.evento.delete, evento, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null && result !== 0) {
                    successMessage({
                        title: message.evento.delete.title,
                        content: message.evento.delete.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.evento.delete.title,
                        content: message.evento.delete.error
                    });
                }

            });
        } catch (e) {
            console.log(e);
        }
    };

    /**
     * Listar los Eventos por periodo
     * @param {type} periodo : bean periodo
     * @param {type} _callback : funcion 
     * @returns {array} evento
     */
    this.listEvento = function (periodo, _callback) {
        try {
            connector.post(url.evento.list, JSON.stringify(periodo), function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.evento.list.title,
                        content: message.evento.list.empty
                    });
                }

            });
        } catch (e) {
            console.log(e);
        }
    };

    this.listEventoActGroup = function (grupo, _callback) {
        try {
            connector.post(url.evento.evtActGr, JSON.stringify(grupo), function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.evento.list.title,
                        content: message.evento.list.empty
                    });
                }

            });
        } catch (e) {
            console.log(e);
        }
    };
}
