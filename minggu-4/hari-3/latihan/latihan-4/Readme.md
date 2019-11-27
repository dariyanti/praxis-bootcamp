# Tentang DOM(Document Object Model)

DOM adalah cara javascript melihat suatu halaman html. `DOM adalah sebuah platform dan interface yang memperbolehkan pengaksesan dan perubahan pada konten, struktur, dan style pada sebuah dokumen oleh program dan script`. Istilah HTML DOM mengacu kepada dokumen html. jadi konten, struktur, dan style pada dokumen html dapat diakses dan dirubah dengan menggunakan sintaks javascript.

Pada model DOM ini, setiap elemen html dipandang sebagai sebuah object. Setiap object bisa terdiri dari object-object lain, sama halnya dengan dokumen html yang terdiri dari elemen root (elemen `<html>)`, elemen root terdiri dari elemen `<head>` dan elemen `<body>` elemen `<body>` boleh jadi terdiri dari elemen `<a>` `<h1>` `<p>` dst.
Elemen-elemen pada dokumen html membentuk sebuah object document yang merupakan object dari dokumen html itu sendiri

Elemen pada dokumen html ini memiliki `property` yaitu nilai pada elemen html yang bisa ditetapkan atau dirubah dan method yakni aksi yang dapat dilakukan pada elemen html. Contoh property yang biasa digunakan ialah `innerHTML` yang digunakan untuk memperoleh atau merubah konten dari elemen html itu sendiri. Kemudian method, contoh misalnya `getElementById(“id”)` milik object document yang digunakan untuk mengakses elemen html dalam dokumen html berdasarkan id.

Ada beberapa metode dalam javaScript untuk manipulasi DOM

1. Metode querySelector()
   mengembalikan elemen pertama yang cocok dengan satu atau lebih pemilih CSS. Jika tidak ada kecocokan yang ditemukan, itu mengembalikan nol.

2. Metode querySelectorAll()
   Tidak seperti querySelector() yang hanya mengembalikan instance pertama dari semua elemen yang cocok, `querySelectorAll()` mengembalikan semua elemen yang cocok dengan pemilih CSS yang ditentukan. Elemen yang cocok dikembalikan sebagai objek NodeList yang akan menjadi objek kosong jika tidak ada elemen yang cocok ditemukan.

3. Metode addEventListener()
   Event merujuk pada apa yang terjadi pada elemen HTML, seperti mengklik, memfokuskan, atau memuat, yang dapat bereaksi dengan JavaScript, ketika tombol diklik maka akan ada sesuatu yang terjadi setelahnya.
   Metode `addEventListener()` (solusi ketiga) memiliki beberapa kelebihan; ini adalah standar terbaru - memungkinkan penugasan lebih dari satu fungsi

4. Metode createElement()
   Metode `createElement()` membuat elemen HTML baru menggunakan nama tag HTML yang akan dibuat, seperti 'p' atau 'div'.

5. Metode appendChild()
   Metode `appendChild()` menambahkan elemen sebagai child terakhir ke elemen HTML yang memanggil metode ini.

   Child yang akan dimasukkan dapat berupa elemen yang baru dibuat, atau yang sudah ada. Dalam kasus terakhir, ia akan dipindahkan dari posisi sebelumnya ke posisi child terakhir
