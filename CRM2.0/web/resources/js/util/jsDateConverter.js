var date;
var year;
var month;
var day;

var months = [
    "enero",
    "febrero",
    "marzo",
    "abril",
    "mayo",
    "junio",
    "julio",
    "agosto",
    "septiembre",
    "octubre",
    "noviembre",
    "diciembre"
];

function getActualDateLong() {
    date = new Date();
    year = date.getFullYear();
    month = date.getMonth();
    day = date.getDate();
    return day + " de " + months[month] + " del " + year;
}

function getDateLong(date) {
    year = date.getFullYear();
    month = date.getMonth();
    day = date.getDate();
    return day + " de " + months[month] + " del " + year;
}

function getFormatMySQL(date) {
    year = date.getFullYear();
    month = parseInt(date.getMonth()) + 1;
    day = date.getDate();
    return year + "-" + month + "-" + day;
}
