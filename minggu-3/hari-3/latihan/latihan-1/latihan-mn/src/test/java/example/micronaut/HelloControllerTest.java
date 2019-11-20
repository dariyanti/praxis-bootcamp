package example.micronaut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

/*
1.Beri anotasi kelas dengan @MicronautTest sehingga Micronaut 
akan menginisialisasi konteks aplikasi dan server tertanam.
2. Suntikkan bean RxHttpClient. Ini digunakan untuk mengeksekusi panggilan HTTP ke controller.
3. Membuat Permintaan HTTP lebih mudah berkat API fluid Micronaut
*/

@MicronautTest // 1
public class HelloControllerTest {
    @Inject
    @Client("/")
    RxHttpClient client;// 2

    @Test
    public void testHello() {
        HttpRequest<String> request = HttpRequest.GET("/hello");// 3
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals("Hello World", body);
    }
}