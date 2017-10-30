var principal = [
    "red",
    "indigo",
    "lime",
    "green",
    "amber",
    "brown",
    "blue",
    "deep-orange",
    "blue-grey",
    "light-green",
    "deep-purple"
];

var complement = [
    "lighten-1",
    "lighten-2",
    "lighten-3"
];

function getRandom(max) {
    return Math.round(Math.random() * max);
}

function getLetter(nombre) {
    var letter = nombre.split("");
    var Let = letter[0];
    return Let.toUpperCase();
}

function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
}

function getColor() {
    return getPrincipal() + " " + getComplement();
}

function getPrincipal() {
    return principal[getRandom(principal.length)];
}

function getComplement() {
    return complement[getRandom(complement.length)];
}