/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function usuarioService() {
    var connector = new jsConnector();
    //Aqui se registra cada método a utilizarse
    //Evitar la interaccion con HTML
    this.addUsuario = function (usuario, _callback) {
        try {
            connector.post(url.usuario.add, usuario, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.usuario.add.title,
                        content: message.usuario.add.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.usuario.add.title,
                        content: message.usuario.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateUsuario = function (usuario, _callback) {
        try {
            connector.post(url.usuario.update, usuario, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.usuario.update.title,
                        content: message.usuario.update.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.usuario.update.title,
                        content: message.usuario.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };

    this.deleteUsuario = function (usuario, _callback) {
        try {
            connector.post(url.usuario.delete, usuario, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.usuario.delete.title,
                        content: message.usuario.delete.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.usuario.delete.title,
                        content: message.usuario.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.listUsuario = function (_callback) {
        try {
            connector.post(url.usuario.list, JSON.stringify({id: 1}), function (result) {
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.usuario.list.title,
                        content: message.usuario.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}