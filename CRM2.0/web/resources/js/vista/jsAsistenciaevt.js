var aService = new asistenciaevtService();
var nMiembros = 0;
var mgpService = new miembrogpService();
var list_miembros = $("#list_miembros");

$(document).ready(function () {
    var grupo = {idGrupo: 1};
    mgpService.listMiembrogp(grupo, loadMiembros);
});

function loadMiembros(list) {
    console.log(list);
    var s = "";
    for (var i = 0, max = list.length; i < max; i++) {
        var r = getLetter(list[i].persona.perNombres);
        s += '<tr>';
        s += '<td style="width:38px;"><button style="' + color[getRandom(color.length)] + '" class="btn-floating waves-effect waves-light">' + r + '</button></td>';
        s += '<td class="ligth italic">' + list[i].persona.perNombres + ' ' + list[i].persona.perApellidos + '</td>';
        s += '<td>';
        s += '<span class="chart presente" data-percent="' + getRandomArbitrary(37, 100) + '">';
        s += '<span class="percent"></span>';
        s += '</span>';
        s += '</td>';
        s += '<td><input type="hidden" value="' + list[i].idMiembrogp + '"></td>';
        s += '<td><p><input type="checkbox" class="checkO" onclick="changePF(this.id)" id="as' + list[i].idMiembrogp + '"><label for="as' + list[i].idMiembrogp + '"></label></p></td>';
        s += '</tr>';

    }
    $(list_miembros).empty();
    $(list_miembros).append(s);
    startPieChart();
    nMiembros = list.length;
    $(".valF").attr("value", nMiembros);
    $(".falV").empty();
    $(".falV").append(nMiembros);
}

function saveAsis() {
    (new PNotify({
        title: 'Registro de Asistencia',
        text: '¿Está seguro que desea registrar?',
        addclass: 'crm-pnotify',
        icon: 'mdi-communication-chat white-text',
        hide: false,
        confirm: {
            confirm: true
        },
        buttons: {
            closer: false,
            sticker: false
        },
        history: {
            history: false
        }
    })).get().on('pnotify.confirm', function () {
        addAsistenciaevt();
    });
}

function addAsistenciaevt() {
    var P = parseInt($(".valP").val());
    var F = parseInt($(".valF").val());
    var V = $("#nvisitas").val();
    var L = $("#lreunion").val();
    if (V === "") {
        V = 0;
    }
    parseInt(V);
    var asistenciaevt = {
        astPresentes: P,
        astFaltas: F,
        astVisitas: V,
        astDescripcion: "",
        astLugar: L,
        evento: {
            idEvento: 1
        }
    };
    aService.addAsistenciaevt(asistenciaevt, addAsisMiemgp);
}

function startPieChart() {
    $('.presente').easyPieChart({
        easing: 'easeOutBounce',
        lineWidth: '3',
        barColor: '#00e676',
        size: 60,
        animate: 2000,
        onStep: function (from, to, percent) {
            $(this.el).find('.percent').text(Math.round(percent));
        }
    });
}

function changeAll() {
    if ($("#as").prop('checked')) {
        $(".checkO").attr("checked", "true");
    } else {
        $(".checkO").removeAttr("checked");
    }
}

function changePF(id) {
    var P = parseInt($(".valP").val());
    var F = parseInt($(".valF").val());
    if ($("#" + id).prop('checked')) {
        P = P + 1;
        F = F - 1;
    } else {
        F = F + 1;
        P = P - 1;
    }
    $(".valF").attr("value", F);
    $(".falV").empty();
    $(".falV").append(F);
    $(".valP").attr("value", P);
    $(".preV").empty();
    $(".preV").append(P);
}