var color = [];
color.push("background:#e57373;");
color.push("background:#f06292;");
color.push("background:#ba68c8;");
color.push("background:#9575cd;");
color.push("background:#7986cb;");
color.push("background:#64b5f6;");
color.push("background:#4fc3f7;");
color.push("background:#4dd0e1;");
color.push("background:#4db6ac;");
color.push("background:#81c784;");
color.push("background:#aed581;");
color.push("background:#dce775;");
color.push("background:#fff176;");
color.push("background:#ffd54f;");
color.push("background:#ffb74d;");
color.push("background:#ff8a65;");
color.push("background:#a1887f;");

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