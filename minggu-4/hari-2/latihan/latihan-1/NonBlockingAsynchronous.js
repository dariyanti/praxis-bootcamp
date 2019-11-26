/*var startTime = new Date().getTime();
var getEndTime = () => {
    var tempEndTime = new Date().getTime();
    var second = (tempEndTime - startTime) / 1000
    return `took ${second} sec...to finish\n`
}

console.log('1: start App', getEndTime())
setTimeout(() => {
    console.log('2: setTimeout', getEndTime())
}, 1000)
console.log('3: End App', getEndTime())
*/

// console -> Process Order:  1 -> 3 -> 2
// jadi proses 3 dijalankan terlebih dahulu baru 
//proses nomer 2 karena nomer 2 di beri setTimeout sebanyak 1000 milisecond
//setTimeout digunakan untuk simulasi asynchronous.
//Karena sebenarnya kita tidak bisa membuat proses asynchronous murni tanpa di set terlebih dahulu.

// ini contoh yang lebih sederhana lagi 
function p1() {
    console.log("p1 selesai")
}
//pada p2 kita bisa menuliskan setTimeout untuk membuat agar p2 di delay selama 1000 ms
function p2() {
    setTimeout(function () {
        console.log("p2 di delay dulu setelah p3 jalan")
    }, 1000);
}

function p3() {
    console.log("p3 selesai")
}
p1()
p2()
p3()