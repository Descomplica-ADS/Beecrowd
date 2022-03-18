let [A, B, C] = lines.shift().split(" ").map((x) => parseInt(x));

let maiorAB = ((A+B+(Math.abs(A-B)))/2);

let maior = ((maiorAB+C+(Math.abs(maiorAB-C)))/2);

console.log(`${maior} eh o maior`);