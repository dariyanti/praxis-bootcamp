package latihan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyTests {

    // disini akan kita buat unit test buat melakukan cek apakah fungsi yang kita
    // buat
    // sesuai dengan harapan dari fungsi tersebut
    @Test
    public void checkIfMultiplicationIsGood() {

        MyClass tester = new MyClass(); // MyClass is tested

        // kita akan melakukan cek terhadap MyClass
        // yang pertama dilakukan cek, apakah 1 x 1 hasilnya 1
        assertEquals(1, tester.multiply(1, 1), "1 x 1 hasilnya harus 1");

        // yang kedua dilakukan cek, apakah 1 x 1 hasilnya bukan 2
        assertNotEquals(2, tester.multiply(1, 1), "1 x 1 seharusnya bukan 2 hasilnya");

        assertEquals(2, tester.pembagian(10, 5), "10 / 5 hasilnya harus 2");
    }
}