# Catatan Untuk diri sendiri

Materi Hari 2 tentang `asynchronous programing di javascript`.

1. Asynchronous
   merupakan proses input output. `konsep Asynchronous dapat menjalankan sesuatu tanpa mengunggu proses lain selesai`.
   `hasil eksekusi atau output tidak selalu berdasarkan urutan kode, tetapi berdasarkan waktu proses`. Eksekusi dengan asynchronous tidak akan membloking atau menunggu suatu perintah sampai selesai. Daripada menunggu, asynchronous akan mengeksekusi perintah selanjutnya.

`console.log('Hello');`
`setTimeout(() => { console.log('Javascript')},100) // tunda selama 100 miliseconds`
`console.log('Coder');`

`/* ----------`
`Output :`
`Hello!`
`Coder`
`Javascipt`
`------------*/`

`setTimeout` digunakan untuk menunda eksekusi dalam satuan `milisecond` dalam hal ini untuk simulasi prosess async.
Perhatikan bahwa outputnya tidak berurutan sesuai input (kode). Karena `cara kerja asynchronous adalah berdasarkan waktu proses`. Jika ada salah satu eksekusi membutuhkan proses yang agak lama, maka sembari menunggu prosess tersebut javascript mengeksekusi perintah selanjutnya

2. Synchronous
   Synchronous adalah yang paling umum dan mudah di mengerti. konsepnya `Setiap perintah di eksekusi satu persatu sesuai urutan kode yang anda tuliskan`.
   contoh :
   `console.log('Hello')`
   `console.log('Javascript')`
   `console.log('Coder')`

`/*`
`Output :`
`Hello!`
`Javascipt`
`Coder`
`*/`
Output dari kode diatas akan sesuai urutan, karena setiap perintah harus menunggu perintah sebelumnya selesai. Proses seperti ini disebut `blocking`.

3. Javascript secara default mengeksekusi perintah secara `synchronous`, kecuali untuk beberapa hal seperti : ajax,websocket, worker, file, database, animasi dan beberapa hal lainya.
4. Kita tidak bisa membuat proses asynchronous murni. Tapi untuk membuat simulasinya kita bisa menggunakan `fungsi setInternal dan setTimeout`
5. Teknik `Asynchronous` paling banyak digunakan mengelola komunikasi yang tidak mungkin sinkron atau harus menunggu seperti proses `request ajax, operasi file, koneksi ke database, websocket, real time communication` seperti pada aplikasi chating dan masih banyak lagi.
6. Blocking vs Non-blocking
   Blocking mengacu pada operasi yang memblokir eksekusi selanjutnya sampai operasi itu selesai. sedangkan Non-blocking mengacu pada kode yang tidak memblokir eksekusi selanjutnya. Dalam contoh yang diberikan, `localStorage` adalah operasi pemblokiran karena menghentikan eksekusi untuk dibaca. Di sisi lain, fetch adalah operasi non-blocking karena tidak menghentikan peringatan dari eksekusi. contoh

`// Blocking: 1,... 2`
`alert(1);`
`var value = localStorage.getItem('foo');`
`alert(2);`

`// Non-blocking: 1, 3,... 2`
`alert(1);`
`fetch('example.com').then(() => alert(2));`
`alert(3);`

7. Callback
   merupakan sebuah function. bedanya dengan fungsi biasa adalah pada cara eksekusinya. Jika function pada umumnya di eksekusi berurutan dari atas ke bawah. sedangkan `konsep callback di eksekusi pada point tertentu`, itu sebabnya di sebut `callback` Callback disebut juga dengan `high-order function`. Jika function pada umumnya di eksekusi secara langsung. `callback di eksekusi dalam function lain melalui parameter`. contoh :

`function main(param1,param2,callBack){`
`console.log(param1, param2)`
`callBack()`
`}`

`function myCallback(){`
`console.log ('hello callback')`
`}`

`main(1,2,myCallback)`

`/*`

`===================`

`Output :`
`1 2`

`hello callback`

`===================`

`*/`

8. Kenapa function bisa di jadikan sebagai parameter ?
   -Function dalam javascript adalah object atau sering disebut first-class object, yang artinya :
   -Function bisa di jadikan parameter
   -Function dapat disimpan ke dalam variabel
   -Seperti object pada umumnya, function bisa memiliki property dan method
   -Function dapat mengembalikan value dalam bentuk function
9. Node.js
   merupakan mesin untuk menjalankan kode javascript dengan cara buka terminal lalu ketikan kode `node namaProject.js`
10. Promise
jika callback adalah function maka promise adalah object. karena promise akan selalu berjalan asynchronous 
