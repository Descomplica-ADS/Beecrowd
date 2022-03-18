let numero_funcionario = parseInt(lines.shift());
let horas = parseInt(lines.shift());
let qtd_recebe_horas = parseFloat(lines.shift());

let salario = horas * qtd_recebe_horas;

console.log(`NUMBER = ${numero_funcionario}\nSALARY = U$ ${salario.toFixed(2)}`);