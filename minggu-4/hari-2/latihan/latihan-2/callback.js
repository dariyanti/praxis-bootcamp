//ini merupakan contoh callback blocking jadi program berjalan sesuai urutan
// di code ini yang muncul lebih dulu adalah isi dari input.text baru program ended.
//kalau non-bloking yang di munculkan program ended dulu baru input text
var fs = require("fs");
var data = fs.readFileSync('input.txt'); //fungsi ini memanggil dari file input.txt dengan Sync jadi berurutan

console.log(data.toString());
console.log("Program Ended");