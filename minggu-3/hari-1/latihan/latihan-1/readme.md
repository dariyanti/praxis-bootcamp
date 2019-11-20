# Install Mongodb

menginstal mongodb di windows.

1. Download mongodb community edition.
   a. Pusat Unduhan harus menampilkan informasi unduhan Server Komunitas MongoDB.
   b. Jika tidak, pilih Server, lalu klik tab Server Komunitas MongoDB.
   c. Di dropdown versi, pilih versi yang sesuai dengan MongoDB Server 4.2 terbaru.
   d. Dalam dropdown OS, Windows 64-bit X64 harus dipilih.
   e. Dalam drop down Paket, MSI harus dipilih.
   f. Klik Unduh.

2. Run installer mongodb
   Misalnya, dari Windows Explorer / File Explorer:
   a. Buka direktori tempat Anda mengunduh pemasang MongoDB (file .msi). Secara default, ini adalah direktori Unduhan Anda.
   b. Klik dua kali file .msi.

3. Ikuti panduan instalasi Edisi Komunitas MongoDB
   Panduan langkah Anda melalui instalasi MongoDB dan MongoDB Compass.

   a. Pilih Jenis Pengaturan
   Anda dapat memilih tipe Complete (disarankan untuk sebagian besar pengguna) atau Kustom. Opsi pengaturan Lengkap menginstal MongoDB dan alat MongoDB ke lokasi default. Opsi pengaturan Kustom memungkinkan Anda untuk menentukan executable mana yang diinstal dan di mana.
   b. Konfigurasi Layanan
   Mulai di MongoDB 4.0, Anda dapat mengatur MongoDB sebagai layanan Windows selama instalasi atau hanya menginstal binari. Mulai di MongoDB 4.0, Anda dapat mengonfigurasi dan memulai MongoDB sebagai layanan Windows selama instalasi, dan layanan MongoDB dimulai setelah instalasi berhasil.

   ![alt text](gambar/windows-installer.png)

a. Pilih Instal MongoD sebagai Layanan MongoDB sebagai layanan.

Pilih salah satu:

-Jalankan layanan sebagai pengguna Layanan Jaringan (Default)

-Ini adalah akun pengguna Windows yang terintegrasi dengan Windows
atau

-Jalankan layanan sebagai pengguna lokal atau domain

-Untuk akun pengguna lokal yang ada, tentukan periode (mis.) Untuk Domain Akun dan tentukan Nama Akun dan Kata Sandi Akun untuk pengguna.
-Untuk pengguna domain yang ada, tentukan Domain Akun, Nama Akun, dan Kata Sandi Akun untuk pengguna itu
Nama layanan.
-Tentukan nama layanan. Nama default adalah MongoDB. Jika Anda sudah memiliki layanan dengan nama yang ditentukan, Anda harus memilih nama lain.

-Direktori Data. Tentukan direktori data, yang sesuai dengan --dbpath. Jika direktori tidak ada, penginstal akan membuat direktori dan mengatur akses direktori ke pengguna layanan.

-Direktori Log. Tentukan direktori Log, yang sesuai dengan --logpath. Jika direktori tidak ada, penginstal akan membuat direktori dan mengatur akses direktori ke pengguna layanan.

4. Instal Kompas MongoDB
   Untuk Windows 8 atau lebih tinggi, Anda dapat meminta wisaya memasang MongoDB Compass. Untuk menginstal Kompas, pilih Instal Kompas MongoDB (Default)
