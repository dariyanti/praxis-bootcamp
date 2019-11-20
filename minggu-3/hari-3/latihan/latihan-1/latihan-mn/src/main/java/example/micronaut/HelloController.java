package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

/*1.Kelas didefinisikan sebagai pengontrol dengan penjelasan @Controller 
    dipetakan ke jalur / halo jadi isi didalam controler yang dit
2. Anotasi @Get digunakan untuk memetakan metode indeks untuk semua permintaan 
    yang menggunakan GET HTTP 
3.Secara default,respons Micronaut menggunakan aplikasi/json sebagai Tipe-Konten.
4.Kami mengembalikan sebuah String bukan objek JSON.Karena itu,kami mengaturnya 
    menjadi teks/polos.String"Hello World"dikembalikan sebagai hasilnya
*/

@Controller("/hello") // 1
public class HelloController {
    @Get("/") // 2
    @Produces(MediaType.TEXT_PLAIN) // 3
    public String index() {
        return "Hello World";// 4
    }
}