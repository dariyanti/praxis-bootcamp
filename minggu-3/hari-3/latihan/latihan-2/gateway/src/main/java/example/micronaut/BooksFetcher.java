package example.micronaut;
/*Java dipilih secara default jika Anda 
tidak menentukan bahasa.
Di dalam microservice gateway,buat satu HTTP Client deklaratif 
untuk berkomunikasi dengan microservice buku.

Pertama-tama buat antarmuka:
*/

import io.reactivex.Flowable;

public interface BooksFethcher {
    Flowable<book> fetchBooks();
}