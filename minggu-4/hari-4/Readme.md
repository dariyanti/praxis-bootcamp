# Materi tentang Vue.js

`Vue.js adalah suatu librari Javascript` yang digunakan untuk membangun antar muka sebuah website yang interaktif. Library dari Vue difokuskan hanya pada view layer dan sangat mudah diimplementasikan dan diintegrasikan dengan library lain ataupun juga dengan project yang sudah ada sebelumnya.

didalam vue js terdapat beberapa istilah CDN, CLI dan SRC.

1. CLI = Command Line Interface
Sebelum memulai vue-cli harus ada pra kondisi yang wajib dipenuhi yaitu `Install node.js`node.js merupakan server side javascript engine sedangkan `npm` meupakan paket manager untuk node.
Untuk memasang vue-cli ( yang merupakan paket node ) secara global gunakan skrip berikut:

`$ npm install -g vue-cli`

Setelah usai memamsang vue-cli. mulai bisa menggunakan vue-cli alias command line untuk vue.

2. CDN = Content Delivery Network

3. SRC = source


berikut merupakan salah satu penulisan class method pada Vue :

===========

ini untuk html

`<div id="app">`

`{{ message }}`

`</div>`

===========

ini untuk JavaScript

`var app = new Vue({`

`el: '#app',`

`data: {`

`message: 'Hello Vue!'`

`}`

`})`

===========

Untuk menggunakan vue, pertama-tama kita buat `vue instance` dahulu, pada contoh kode diatas adalah `new Vue({})`. Langkah selanjutnya adalah menentukan sebuah model yang berasosiasi dengan vue tersebut, pada contoh kode diatas adalah data yang nantinya semua object yang ada di dalamnya dapat ditampilkan. Langkah terakhir adalah kita tentukan area kerja dari vue.

Browser tidak menampilkan sesuatu yang kita inginkan, itu karena kita belum merelasikan vue tersebut dengan input element yang ada. Untuk itu kita perlu menambahkan `v-model` di input element dan kemudian kita tambahkan `<p>` value dari input adalah: `{{message}}`. `</p>` di bawah input element tadi. Apabila kita refresh halaman browser maka pada input element tadi akan tertulis “Hello World” dan nilai dari tag p adalah “value dari input adalah: Hello World”. Apabila kita rubah nilai dari input element maka secara otomatis nilai dari tag p juga akan berubah.

langkah-langkah :

- Buat sebuah `vue instance`.
- Bind dengan element HTML DOM.
- Spesifikasikan sebuah data atau model untuk vue.
- Gunakan `v-model` untuk pada form input untuk menampilkan data model.
