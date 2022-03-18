let [x1, y1] = lines.shift().split(" ").map((x) => parseFloat(x));
let [x2, y2] = lines.shift().split(" ").map((x) => parseFloat(x));

let d1 = x2 - x1;
let d2 = y2 - y1;

d1 = Math.pow(d1, 2);
d2 = Math.pow(d2, 2);

let distancia = Math.sqrt(d1 + d2);

console.log(distancia.toFixed(4));