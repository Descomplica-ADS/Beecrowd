let raio = parseInt(lines.shift());
const pi = 3.14159;

let volume = (4 / 3.0) * pi * Math.pow(raio, 3);

console.log(`VOLUME = ${volume.toFixed(3)}`);