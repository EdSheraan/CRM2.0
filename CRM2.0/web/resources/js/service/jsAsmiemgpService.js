function asmiemgpService() {
    var connector = new jsConnector();

    this.addAsmiemgp = function (asmiemgp, _callback) {
        try {
            connector.post(url.asmiemgp.add, JSON.stringify(asmiemgp), function (result) {
                if (result !== undefined && result !== null) {
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.asmiemgp.title,
                        content: message.asmiemgp.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.updateAsmiemgp = function (asmiemgp, _callback) {

    };

    this.deleteAsmiemgp = function (asmiemgp, _callback) {

    };

    this.listAsmiemgp = function (_callback) {
        var connectionUrl = "/asmiemgp/list";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl, null, function (result) {
                if (result !== undefined && result !== null && result.length > 0) {
                    _callback(result);
                } else {
                    infoMessage({
                        title: message.persona.list.title,
                        content: message.persona.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}

