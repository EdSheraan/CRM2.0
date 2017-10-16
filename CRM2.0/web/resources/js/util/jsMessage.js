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
    },
    grupo: {
        add: {
            title:"Registro de Grupo Pequeño",
            success: "Grupo Pequeño registrado con éxito.",
            error: "Hubo un error al momento de registrar al Grupo Pequeño."
        },
        update: {
            title:"Actualización de Grupo Pequeño",
            success: "Los datos del Grupo Pequeño han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos del Grupo Pequeño."
        },
        delete: {
            title:"Eliminación de Grupo Pequeño",
            success: "Grupo Pequeño eliminado con éxito.",
            error: "Hubo un error al momento de eliminar al Grupo Pequeño."
        },
        list: {
            title:"Listado de Grupos Pequeños",
            empty: "Aún no hay Grupos Pequeños registrados en el sistema"
        }
    },
    evento: {
        add: {
            title:"Registro de Evento",
            success: "Evento registrado con éxito.",
            error: "Hubo un error al momento de registrar el Evento"
        },
        update: {
            title:"Actualización del Evento",
            success: "Los datos del Evento han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos del Evento"
        },
        delete: {
            title:"Eliminación del Evento",
            success: "Evento eliminado con éxito.",
            error: "Hubo un error al momento de eliminar el Evento."
        },
        list: {
            title:"Listado de Eventos",
            empty: "Aún no hay Eventos registrados en el sistema"
        }
    },
    unionp: {
        add: {
            title:"Registro de Unión",
            success: "Unión registrado con éxito.",
            error: "Hubo un error al momento de registrar Unión"
        },
        update: {
            title:"Actualización de Unión",
            success: "Los datos del Unión han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de Unión"
        },
        delete: {
            title:"Eliminación de Unión",
            success: "Unión eliminado con éxito.",
            error: "Hubo un error al momento de eliminar Unión."
        },
        list: {
            title:"Listado de Unións",
            empty: "Aún no hay Uniones registrados en el sistema"
        }
    },
    asmiemgp: {
        add: {
            title:"Registro de Unión",
            success: "Unión registrado con éxito.",
            error: "Hubo un error al momento de registrar Unión"
        },
        update: {
            title:"Actualización de Unión",
            success: "Los datos del Unión han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de Unión"
        },
        delete: {
            title:"Eliminación de Unión",
            success: "Unión eliminado con éxito.",
            error: "Hubo un error al momento de eliminar Unión."
        },
        list: {
            title:"Listado de Unións",
            empty: "Aún no hay Uniones registrados en el sistema"
        }
    },
    campo: {
        add: {
            title:"Registro de Campo",
            success: "Campo registrado con éxito.",
            error: "Hubo un error al momento de registrar el Campo"
        },
        update: {
            title:"Actualización de Campo",
            success: "Los datos del Campo han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de Campo"
        },
        delete: {
            title:"Eliminación de Campo",
            success: "Campo eliminado con éxito.",
            error: "Hubo un error al momento de eliminar Campo."
        },
        list: {
            title:"Listado de Campos",
            empty: "Aún no hay Campos registrados en el sistema"
        }
    },
    distrito: {
        add: {
            title:"Registro de Distrito Misionero",
            success: "Distrito Misionero registrado con éxito.",
            error: "Hubo un error al momento de registrar al Distrito Misionero"
        },
        update: {
            title:"Actualización de Distrito Misionero",
            success: "Los datos del Distrito Misionero han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de Distrito Misionero"
        },
        delete: {
            title:"Eliminación de Distrito Misionero",
            success: "Distrito Misionero eliminado con éxito.",
            error: "Hubo un error al momento de eliminar al Distrito Misionero."
        },
        list: {
            title:"Listado de Distritos Misioneros",
            empty: "Aún no hay Distritos Misioneros registrados en el sistema"
        }
    },
    escuela: {
        add: {
            title:"Registro de Escuela Sabática",
            success: "Escuela Sabática registrado con éxito.",
            error: "Hubo un error al momento de registrar a la Escuela Sabática"
        },
        update: {
            title:"Actualización de Escuela Sabática",
            success: "Los datos de Escuela Sabática han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de la Escuela Sabática"
        },
        delete: {
            title:"Eliminación de Escuela Sabática",
            success: "Escuela Sabática eliminado con éxito.",
            error: "Hubo un error al momento de eliminar a la Escuela Sabática."
        },
        list: {
            title:"Listado de Escuelas Sabáticas",
            empty: "Aún no hay Escuelas Sabáticas registrados en el sistema"
        }
    },
    iglesia: {
        add: {
            title:"Registro de Iglesia",
            success: "Iglesia registrado con éxito.",
            error: "Hubo un error al momento de registrar a la Iglesia"
        },
        update: {
            title:"Actualización de Iglesia",
            success: "Los datos del Iglesia han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de la Iglesia"
        },
        delete: {
            title:"Eliminación de Iglesia",
            success: "Iglesia eliminado con éxito.",
            error: "Hubo un error al momento de eliminar a la Iglesia."
        },
        list: {
            title:"Listado de Iglesias",
            empty: "Aún no hay Iglesias registrados en el sistema"
        }
    },
    miembrogp: {
        add: {
            title:"Registro del Mimebro de Grupo Pequeño",
            success: "Mimebro de Grupo Pequeño registrado con éxito.",
            error: "Hubo un error al momento de registrar al Mimebro de Grupo Pequeño"
        },
        update: {
            title:"Actualización del Mimebro de Grupo Pequeño",
            success: "Los datos del Mimebro de Grupo Pequeño han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos del Mimebro de Grupo Pequeño"
        },
        delete: {
            title:"Eliminación del Mimebro de Grupo Pequeño",
            success: "Mimebro de Grupo Pequeño eliminado con éxito.",
            error: "Hubo un error al momento de eliminar al Mimebro de Grupo Pequeño."
        },
        list: {
            title:"Listado de Mimebros de Grupo Pequeño",
            empty: "Aún no hay Mimebros de Grupo Pequeño registrados en el sistema"
        }
    },
    miembromin: {
        add: {
            title:"Registro del Mimebro de Ministerio",
            success: "Mimebro de Ministerio registrado con éxito.",
            error: "Hubo un error al momento de registrar al Mimebro de Ministerio"
        },
        update: {
            title:"Actualización de Mimebro de Ministerio",
            success: "Los datos del Mimebro de Ministerio han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de Mimebro de Ministerio"
        },
        delete: {
            title:"Eliminación del Mimebro de Ministerio",
            success: "Mimebro de Ministerio eliminado con éxito.",
            error: "Hubo un error al momento de eliminar al Mimebro de Ministerio."
        },
        list: {
            title:"Listado de los Mimebros de Ministerio",
            empty: "Aún no hay Mimebros de Ministerio registrados en el sistema"
        }
    },
    ministerio: {
        add: {
            title:"Registro de Ministerio",
            success: "Ministerio registrado con éxito.",
            error: "Hubo un error al momento de registrar el Ministerio"
        },
        update: {
            title:"Actualización de Ministerio",
            success: "Los datos del Ministerio han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos de Ministerio"
        },
        delete: {
            title:"Eliminación de Ministerio",
            success: "Ministerio eliminado con éxito.",
            error: "Hubo un error al momento de eliminar el Ministerio."
        },
        list: {
            title:"Listado de Ministerios",
            empty: "Aún no hay Ministerios registrados en el sistema"
        }
    },
    periodo: {
        add: {
            title:"Registro del Periodo de Trabajo",
            success: "Periodo de Trabajo registrado con éxito.",
            error: "Hubo un error al momento de registrar Periodo de Trabajo"
        },
        update: {
            title:"Actualización del Periodo de Trabajo",
            success: "Los datos del Periodo de Trabajo han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos del Periodo de Trabajo"
        },
        delete: {
            title:"Eliminación del Periodo de Trabajo",
            success: "Periodo de Trabajo eliminado con éxito.",
            error: "Hubo un error al momento de eliminar el Periodo de Trabajo."
        },
        list: {
            title:"Listado de Periodos de Trabajo",
            empty: "Aún no hay Uniones registrados en el sistema"
        }
    },
    tipoevento: {
        add: {
            title:"Registrar Tipo de Evento",
            success: "El Tipo de Evento fue registrado con éxito.",
            error: "Hubo un error al momento de registrar el Tipo de Evento"
        },
        update: {
            title:"Actualización del Tipo de Evento",
            success: "Los datos del Tipo de Evento han sido actualizados con éxito.",
            error: "Hubo un error al momento de actualizar los datos del Tipo de Evento"
        },
        delete: {
            title:"Eliminación del Tipo de Evento",
            success: "El Tipo de Evento fue eliminado con éxito.",
            error: "Hubo un error al momento de eliminar el Tipo de Evento."
        },
        list: {
            title:"Listado de los Tipos de Eventos",
            empty: "Aún no hay Tipos de Eventos registrados en el sistema"
        }
    } 
};