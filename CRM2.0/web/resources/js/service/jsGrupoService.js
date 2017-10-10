/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function grupoService(){
    
    this.addGrupo = function(grupo,_callback){
        var connectionUrl ="/grupo/add";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl, grupo, function (result) {
                //Aqui va la validación de la respuesta del servidor
                if (result !== undefined && result !== null) {
                    successMessage({
                        title: message.grupo.add.title,
                        content: message.grupo.add.success
                    });
                    _callback(result);
                }else{
                    errorMessage({
                       title:message.grupo.add.title,
                       content:message.grupo.add.error
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }

    };
}