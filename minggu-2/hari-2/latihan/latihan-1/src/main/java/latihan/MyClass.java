package latihan;

public class MyClass {
    // disini harus ada fungsi yang akan dipanggil di test
    // dalam implementasinya nanti, setiap fungsi yang ada di class harus dipanggil
    // dalam unit testing, sebagai contoh kita buat fungsi multiply

    // kenapa pake double, karena perkalian akan melibatkan banyak angka
    // termasuk angka koma
    public double multiply(double x, double y) {
        return x * y;
    }

    public double pembagian(double x, double y){
        return x / y;
    }

    // setelah membuat fungsi tersebut, kita buat unit testnya
}