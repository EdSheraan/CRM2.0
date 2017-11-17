var agService = new asmiemgpService();
var asistencia = [];

function addAsisMiemgp(idAsistenciaevt) {
    for (var i = 0, max = document.getElementById("list_miembros").rows.length; i < max; i++) {
        var a = document.getElementById("list_miembros").rows[i].cells[3].innerHTML.split('value="');
        var b = a[1].split('"');
        var idMiembro = b[0];
        var asis = "0";
        if ($("#as" + idMiembro).prop('checked')) {
            asis = "1";
        }
        asistencia.push(createAsmiemgp(idAsistenciaevt, idMiembro, asis));
    }
    agService.addAsmiemgp(asistencia, function () {
        loadHeader();
    });
}

function createAsmiemgp(idAsevt, idMiembro, asistencia) {
    var asmiemgp = {
        eventogrupo: {
            idAsistenciaevt: idAsevt
        },
        eventopersona: {
            EventopersonaId: {
                idPersona: idMiembro,
                idEvento: idAsevt
            }
        },
        asgAsistencia: asistencia
    };
    return asmiemgp;
}

/*var agService = new asmiemgpService();
 
 function addAsisMiemgp(idAsistenciaevt) {
 for (var i = 0, max = document.getElementById("list_miembros").rows.length; i < max; i++) {
 var a = document.getElementById("list_miembros").rows[i].cells[3].innerHTML.split('value="');
 var b = a[1].split('"');
 var idMiembro = b[0];
 var asis = "0";
 if ($("#as" + idMiembro).prop('checked')) {
 asis = "1";
 }
 agService.addAsmiemgp(createAsmiemgp(idAsistenciaevt, idMiembro, asis), function (rpta) {
 });
 loadHeader();
 }
 
 }
 
 function createAsmiemgp(idAsevt, idMiembro, asistencia) {
 var asmiemgp = {
 asistenciaevt: {
 idAsistenciaevt: idAsevt
 },
 miembrogp: {
 idMiembrogp: idMiembro
 },
 asgAsistencia: asistencia
 };
 return asmiemgp;
 }
 */