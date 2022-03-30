let [a, b] = lines.shift().split(' ').map((x) => parseInt(x));

if(a < b)   [a, b] = [b, a];

console.log((a % b === 0) ? "Sao Multiplos" : "Nao sao Multiplos");

// usando resta zero % e operador condicional ?
