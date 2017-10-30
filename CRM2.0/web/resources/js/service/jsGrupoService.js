function grupoService() {
    var connector = new jsConnector();
    this.addGrupo = function (grupo, _callback) {
        try {
            connector.post(url.grupo.add, JSON.stringify(grupo), function (result) {
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.grupo.add.title,
                        content: message.grupo.add.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.grupo.add.title,
                        content: message.grupo.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
    this.updateGrupo = function (grupo, _callback) {
        try {
            connector.post(url.grupo.update, grupo, function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.grupo.update.title,
                        content: message.grupo.update.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.grupo.update.title,
                        content: message.grupo.update.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };

    this.deleteGrupo = function (grupo, _callback) {
        try {
            connector.post(url.grupo.delete, JSON.stringify(grupo), function (result) {
                if (result !== undefined && result !== null && result === 1) {
                    successMessage({
                        title: message.grupo.delete.title,
                        content: message.grupo.delete.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.grupo.delete.title,
                        content: message.grupo.delete.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.listGrupo = function (escuela, _callback) {
        try {
            connector.post(url.grupo.list, JSON.stringify(escuela), function (result) {
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.grupo.list.title,
                        content: message.grupo.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.getGrupo = function (grupo, _callback) {
        try {
            connector.post("/grupo/get", JSON.stringify(grupo), function (result) {
                if (result.gpoNombre !== undefined) {
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.grupo.list.title,
                        content: message.grupo.list.empty
                    });
                }
            });
        } catch (e) {
            console.error(e);
        }

    };

}
