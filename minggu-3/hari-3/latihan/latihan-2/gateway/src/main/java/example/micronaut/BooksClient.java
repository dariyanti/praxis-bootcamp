package example.micronaut;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

/*setelah membuat microservice buku 
Kemudian buat Klien HTTP deklaratif; antarmuka beranotasi dengan @Client.
Metode Klien HTTP deklaratif Micronaut akan diterapkan pada waktu kompilasi, kemudian
tipe non blocking adalah citizens kelas pertama di Micronaut. 
Metode BooksClient :: fetchBooks () mengembalikan Flowable <Book> di mana Buku adalah POJO Java
*/

@Client("books")
@Requires(notEnv=Environment TEST)

public interface BooksClient extends BooksFetcher{

    @Override 
    @Get("/api/books")Flowable<book> fetchBooks();
}