let numbers = [] = lines[0].split(' ').map(parseFloat)
var numbersUnsorted = numbers.slice()

for (let i = 0; i < 3; i++) {
    numbers.sort((a, b) => a - b)
    console.log(numbers[i])
}
console.log();
for (let i = 0; i < 3; i++) {
    console.log(numbersUnsorted[i])
}
