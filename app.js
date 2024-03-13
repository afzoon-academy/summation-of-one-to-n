// summation of 1 to N
// time complexity of this algorithms is O(n)
/*const readline = require('readline-sync');

let n = Number(readline.question('Enter a number: '));

let sumOfOneToN = 0;
for (let i = 1; i <= n; i++) {
    sumOfOneToN += i;
}

console.log(`The summation of 1 to ${n} is ${sumOfOneToN}`);*/

// summation of 1 to N
// time complexity of this algorithms is O(1)
const readline = require('readline-sync');

let n = Number(readline.question('Enter a number: '));

let sumOfOneToN = n * (n + 1) / 2;

console.log(`The summation of 1 to ${n} is ${sumOfOneToN}`);