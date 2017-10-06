/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function errorMessage(params) {
    params.type ="error";
    showMessage(params);
}

function infoMessage(params) {
    params.type ="info";
    showMessage(params);
}

function successMessage(params) {
    params.type ="success";
    showMessage(params);
}

function showMessage(params){
    //Esto es por mientras, luego se pondrá segun el plugin del materialize
    alert(params.type+": "+params.title + "\n"+ params.content);
}

/**
 * No modifcar la estructura que ya esta desarrollada, solo el contenido de los mensajes.
 * La estructura es la siguiente:
 * message>[OBJETO] > [METODO] > [TITULO_MENSAJE],[TIPO_MENSAJE].
 * - Cada OBJETO esta delimitado por comas.
 * - Es obligatorio poner el TITULO_MENSAJE en cada METODO
 * - Los mensajes que muestran algo resultado positivo, bueno, ok, son del tipo: success
 * - Los mensajes que muestran algun resultado erroneo, una falla, etc. Son del tipo: error
 * - Los mensajes que muestran solo información, son del tipo : info
 * @type Object
 */
var message = {
    persona: {
        add: {
            title:"Registro de Persona",
            success: "Persona registrada con éxito.",
            error: "Hubo un error al momento de registrar a la persona."
        },
        update: {
            title:"Actualización de datos Personales",
            success: "Los datos de la persona han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de la persona."
        },
        delete: {
            title:"Eliminación de Persona",
            success: "Persona eliminada con éxito.",
            error: "Hubo un error al momento de eliminar a la persona."
        },
        list: {
            title:"Listado de Personas",
            empty: "Aún no hay personas registradas en el sistema"
        }
    },
    connector: {
        title:"Sistema CRM Digital 2.0",
        error: "Ocurrió un error al momento de enviar la información, asegurese de que tiene conexión a internet. " +
                "De lo contrario, comuníquese con el administrador del sistema."
    }
};