// 5: Dynamic Number Processor
// Separate:
// • Even numbers
// • Odd numbers
// Also calculate:
// • Sum of even numbers
// • Sum of odd numbers

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const evenNumbers = numbers.filter(num=>num%2===0)
console.log(`even numbers are ${evenNumbers}`)
const evenTotal = evenNumbers.reduce((num,res)=>num+res,0)
console.log(`evenTotal is ${evenTotal}`)


const oddNumbers = numbers.filter(num=>num%2!==0)
console.log(`odd numbers are ${oddNumbers}`)
const oddTotal = oddNumbers.reduce((num,res)=>num+res,0)
console.log(`The sum odd numbers is ${oddTotal}`)