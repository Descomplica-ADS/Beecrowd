let [A, B, C] = lines.shift().split(" ").map((x) => parseFloat(x));

const pi = 3.14159;

const triangulo = ((A * C) / 2);
const circulo = ((pi * Math.pow(C, 2)));
const trapezio = ((A + B) / 2) * C;
const quadrado = Math.pow(B, 2);
const retangulo = A * B;

console.log(`TRIANGULO: ${triangulo.toFixed(3)}`);
console.log(`CIRCULO: ${circulo.toFixed(3)}`);
console.log(`TRAPEZIO: ${trapezio.toFixed(3)}`);
console.log(`QUADRADO: ${quadrado.toFixed(3)}`);
console.log(`RETANGULO: ${retangulo.toFixed(3)}`);