//berikut adalah contoh tipe data reference
//pertama. ada variabel berupa object mike yang berisi nama ini merupakan bentuk object
let mike = {
    name: "mike"
}
//kedua. variabel odd dengan bentuk dan isi array
let odd = [1]
//ketiga ada variabel morning yang berisi fungsi yang mengembalikan nilai greetings
let morning = function () {
    return "greetings!"
}
//ini merupakan object jadi didalam variabel itu bsa diisi fungsi dan object karena js itu dinamis
//jadi kita bisa menambahkan properti pada object
morning.info = "fungsi greeting morning"

//dari variabel diatas kemudian ditugaskan kembali kedalam variabel yang baru
//pada variabel ini yang diambil yaitu reference nya bukan value didalam variabel
//jadi ini merupakn contoh call by reference
let john = mike
let even = odd
let evening = morning

//ini juga merupakan variabel baru dengan memodifikasi nilai 
//dengan mengalokasikan memori baru untuk kate dan var mike tidak terpengaruh
var kate = mike

//kemudian buat object baru dengan nama sesuai var yg telah di modifikasi sebelumnya
kate = {
    name: "kate"
}
//setelah itu memodifikasi properti
evening.info = "fungsi greeting evening"
john.name = "john"
even[0] = 1

//pertama yaitu berupa output dari variabel awal yang belum termodifikasi
console.log("first", morning.info, mike, odd)
//kedua berupa output setelah ada modifikasi
console.log("second", evening.info, john, even)