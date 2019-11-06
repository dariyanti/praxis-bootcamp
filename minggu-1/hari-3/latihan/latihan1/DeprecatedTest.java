/**
 * deprecated merupakan sebuah label yang menandakan bahwa suatu class / fungsi
 * sebaiknya sudah tidak digunakan lagi didalam main terdapat sebuah class baru
 * dengan nama d1 yang berisi method display tulisan println akan menampilkan
 * apa yang nantinya muncul dilayar
 * 
 * @param void
 * @return
 * @author Dariyanti
 */
public class DeprecatedTest {

    @Deprecated
    public void Display() {
        System.out.println("DeprecatedTest Display");
    }

    public static void main(String[] args) {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}