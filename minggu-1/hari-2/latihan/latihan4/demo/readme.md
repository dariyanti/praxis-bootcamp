# GRADLE

Sesuai dengan Soal latihan nomer 4. maka berikut merupakan penjelasannya.

1. Buat Folder demo dengan cara `mkdir demo`
2. Pindah ke folder demo `cd demo`
3. Init gradle didalam folder demo `git init`
4. pilih sesuai tutorial yang diberikan.

   - Selection `6`
   - Build Script DSL Langsung enter
   - Test Framework Langsung enter
   - Project name Langsung enter
   - Source Package Langsung enter

   Berikut gambarnya :

   ![alt text](gambar/Gradle.png)

5. Struktur Foldernya

   ![alt text](gambar/StruktFolder.png)

6. Didalam `settings.gradle` terdapat nama project kita

7. Didalam `build.gradle` terdapat kumpulan library yang bisa kita gunakan maupun dapat kita tambahkan, selain itu disini juga ada `main.ClassName` yang akan dieksekusi pertama saat program dijalankan, file tersebut terdapat di `src/main/java/demo/App.java`, terdapat juga `test class`, file tersebut ada di `src/test/java/demo/AppTest.java` yang berguna untuk menjalankan unit testing di aplikasi kita

8. Eksekusi dengan `./gradlew build`, harus mempunyai internet aktif saat pertama kali instalasi, digunakan untuk download library yang digunakan di aplikasi kita, setelahnya library akan disimpan di `cache` sehingga pada saat eksekusi program lain yang berikutnya tidak perlu download lagi karena akan menggunakan library yang ada di cache, kecuali ada library baru yang ditambahkan
   hasil unit testing berada di file build/reports/tests/test/index.html silahkan dibuka lewat browser

9. Sebelum menjalankan aplikasi, kita perlu command `./gradlew tasks` untuk mengetahui opsi apa saja yang bisa digunakan.

10. Setelah kita tahu opsinya, jalankan dengan `./gradlew` run untuk menjalankan aplikasi kita
