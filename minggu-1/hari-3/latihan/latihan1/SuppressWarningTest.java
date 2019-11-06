/**
 * Suppresswarning digunakan untuk mengabaikan/menghentikan peringatan ketika
 * sebuah methods sudah tidsak digunakan lagi sedangkan didalam void merupakan
 * sebuah fungsi untuk menampilkan sesuatu sedangkan tulisan println akan
 * menampilkan apa yang nantinya muncul dilayar
 * 
 * @param void
 * @return
 * @author Dariyanti
 */
public class SuppressWarningTest {

    @SuppressWarnings({ "checked", "deprecated" })
    public static void main(String[] args) {
        {
            DeprecatedTest d1 = new DeprecatedTest();
            d1.Display();
        }
    }
}