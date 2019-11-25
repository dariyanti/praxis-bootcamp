# Catatan Untuk diri sendiri

Javascript itu bentuknya dinamis jadi variabel bisa berisi fungsi maupun object

Tipe data dalam javascript itu ada 2:
`PRIMITIVE DAN REFERENCE`

1. Tipe data primitive(String, number, boolean,undifined,null)
   berarti ketika Anda membuat variabel, menyimpan nilai dari setiap tipe data primitif yang diberikan di dalamnya, lalu mendeklarasikan variabel lain yang ditugaskan (dengan nilai) ke variabel pertama, variabel kedua hanya menerima salinan nilai dari variabel pertama. contoh :
   a= 1
   b=a(varabel kedua hanya menerima nilai salinan dari variabel kedua)
   hasilnya
   a=1 dan b =1(nilai b sama dengan nilai didalam a)
   ketika a dirubah
   a=2
   hasilnya a berubah jadi 2. tetapi ketika kita ingin melihat nilai dari b maka
   b = 1. nilai b tetap berisi angka 1. itu dinamakan `CALL BY VALUE`.
   maksud dari call by value itu adalah ketika sbuah nilai parameter didalam fungsi dirubah nilainya maka variabel yang berada diluar fungsi tidak ikut berubah atau Setiap perubahan yang dilakukan pada nilai tidak memperbarui referensi aktual dari nilai aslinya
   berikut ini merupakan contoh call by value

   `let nilai = 10`
   `function updateNilai(nilaiBaru){`
   `nilaiBaru +=5`
   `console.log("nilai setelah ditambah "+nilaiBaru)`
   `}`
   `updateNilai(nilai)`
   `console.log(nilai)`

2. Tipe data `Reference/non-primitive`(Array dan Object)
   jadi saat kita membuat sebuah sebuah variabel yang berisi nilai maka nilai tersebut akan disimpan didalam sebuah memori (terjadi secara internal) Ketika kita membuat variabel A. kemudian variabel B seperti B = A, alih-alih menyalin nilai A dalam variabel B, variabel B hanya mendapatkan referensi memori dari nilai A, jadi bukan nilai yang di salin ke var B melainkan hanya referensi memori dari si var A saja itu yang disebut `call by reference`. contoh

`let nilaiKu = {`
`nilai = 10`
`}`
`function updateNilai(nilaiRef){`
`nilaiRef.value=20`
`}`
`updateNilai(nilaiKu)`
`console.log(nilaiKu.value)`
jadi output yang dihasilkan yaitu 20
