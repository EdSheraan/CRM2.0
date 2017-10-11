/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function asmiemgpService (){
    this.addAsmiemgp = function (asmiemgp, _callback){
        
    };
    
    this.updateAsmiemgp = function(asmiemgp, _callback){
        
    };
    
    this.deleteAsmiemgp = function(asmiemgp, _callback){
        
    };
    
    this.listAsmiemgp = function(_callback){
        var connectionUrl = "/asmiemgp/list";
        var connector = new jsConnector();
        try {
            connector.post(connectionUrl, null, function (result) {
                if (result !== undefined && result !== null && result.length>0) {
                    _callback(result);
                }else{
                    infoMessage({
                       title:message.persona.list.title,
                       content:message.persona.list.empty
                    });
                }
            });
        } catch (e) {
            console.log(e);
        }
    };
}

