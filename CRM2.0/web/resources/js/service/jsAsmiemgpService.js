function eventopersonaService() {
    var connector = new jsConnector();

    this.addEventopersona = function (asistencia, _callback) {
        try {
            connector.post(url.eventopersona.add, JSON.stringify(asistencia), function (result) {
                if (result !== undefined && result !== null) {
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.eventopersona.title,
                        content: message.eventopersona.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };

    this.updateEventopersona = function (eventopersona, _callback) {

    };

    this.deleteEventopersona = function (eventopersona, _callback) {

    };

    this.listEventopersona = function (_callback) {
        var connectionUrl = "/eventopersona/list";
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

