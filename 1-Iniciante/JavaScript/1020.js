let qtdDias = parseInt(input)

let qtdAnos, qtdMeses

qtdAnos = parseInt(qtdDias / 365)
qtdDias = qtdDias % 365

qtdMeses = parseInt(qtdDias / 30)
qtdDias = qtdDias % 30

let resultado = `${qtdAnos} ano(s)
${qtdMeses} mes(es)
${qtdDias} dia(s)`
console.log(resultado)