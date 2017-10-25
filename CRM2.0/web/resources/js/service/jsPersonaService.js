/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function personaService() {
    //Aqui se registra cada método a utilizarse
    //Evitar la interaccion con HTML
    var connector = new jsConnector();

    this.addPersona = function (persona, _callback) {
        console.log(persona);
        try {
            connector.post(url.persona.add, JSON.stringify(persona), function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.persona.add.title,
                        content: message.persona.add.success
                    });
                    _callback(result);
                } else {
                    errorMessage({
                        title: message.persona.add.title,
                        content: message.persona.add.error
                    });
                }

            });
        } catch (e) {
            console.log(e);
        }
    };


    this.updatePersona = function (persona, _callback) {

    };


    this.deletePersona = function (persona, _callback) {

    };


    this.listPersona = function (_callback) {
        var connectionUrl = "/persona/list";
        try {
            connector.post(connectionUrl, JSON.stringify({id: 1}), function (result) {
                //Aqui va la validación de la respuesta del servidor
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
