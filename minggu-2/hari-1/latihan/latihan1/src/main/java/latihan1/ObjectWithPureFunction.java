package latihan1;

public class ObjectWithPureFunction {
    // fungsi pure adalah fungsi yang nilai kembalianya telah ditentukan oleh nilai
    // inputnya atau bisa juga jika diberi inputan/nilai yg sama maka outputnya pun
    // akan sama sesuai inputan tsb. fungsi ini bersifat tidak bisa diubah diluar
    // ruang lingkupnya/ tidak mengacu pada variabel diluar ruang lingkupnya
    // fungsi sum merupakan fungsi matematika
    // setelah menulis public class baris kedua coding adalah menulis tipe data,
    // maupun
    // method
    // baris ketiga di isi main method agar aplikasi dpt dijalankan maka harus
    // dengan utama/main
    // setelah memdefinisikan fungsi sum maka didalam fungsi sum tersebut di isi
    // parameter
    // penggunaan akses modifier PUBLIC adalah agar dapat di akses oleh kelas lain
    // dari package yg sama atau berbeda
    // dari fungsi sum itu mengembalikan nilai berupa hasil dari penjumlahan
    // variabel a dan b

    // ini bukan static function, dimana tidak akan bisa dipanggil
    // didalam public static void main
    public int sumA(int a, int b) {
        return a + b;
    }

    // kalau ini pasti bisa dipanggil didalam public static void main
    public static int sumB(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        // System.out.println(sumA(1,2)); // coba buka commentnya, akan error karena bukan static
        // untuk mengatasi nya kita akan buat objectnya dulu, dan panggil fungsinya

        ObjectWithPureFunction o = new ObjectWithPureFunction();
        System.out.println("non static " + o.sumA(1, 2));
        // untuk yang sudah static tidak akan error
        System.out.println("static " + sumB(1, 2));
    }
}