//berikut merupakan beberapa contoh fungsi dengan ekspresi karena menggunakan variabel, 
//ada yang memiliki parameters dan ada juga yang tidak berparameters. serta ada yang mengembalikan 
//nilai ada juga yang tidak.

// 1. function dengan namaFungsi square(berparameter dan mengembalikan nilai)
/*
const square = function(x){
    return x*x
}
console.log(square(12))
*/

//2. function makeNoise(tidak berparameter dan tidak mengembalikan nilai)
/*
const makeNoise = function () {
    console.log('Ping Ping Ping!')
}
makeNoise();
*/

//3. function power (berparameter dan mengembalikan nilai)
/*
const power = function (base, exponent) {
    let result = 1;
    for (let count = 0; count < exponent; count++){
        result *= base
    }
    return result;
}
console.log(power(2,10))
*/

//4. function penjumlahan
// ini merupakan binding dan scope
/*
let x = 10
if (true) {
    let y = 20
    let z = 30
    console.log(x + y + z)
}
*/

//5. function pembagian
/*
const halve = function (n) {
    return n / 2
}
let n = 10
console.log(halve(100))
*/

//6. Nested Scope
