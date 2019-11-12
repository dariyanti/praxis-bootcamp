package latihan1;

// ini merupakan impure function dimana variabel diluar scop bisa diubah dan mengacu pada variabel
public class ObjectWithNonPureFunction {
    // akses modifier nya bersifat private berarti tidak bisa diakses oleh class
    // lain. dengan nama variabel value yg isinya 0
    private int value = 0;

    // terdapat fungsi add yang memiliki parameter (nilai selanjutnya)
    public int add(int nextValue) {
        // dari variabel diatas yg awalnya 0 maka fungsi add akan menambahkan nilai
        // selanjutnya
        // karena value awal 0 maka nextValuenya 1 jadi 0+1 kemudian disimpan didalam
        // variabel value
        // karena function ini mengacu pada variabel diluar scope (int value)
        this.value += nextValue;
        // lalu yg akan dikembalikan oleh fungsi tsb adalah value yg sudah ditambah
        // dengan nextValue
        return this.value;
    }
}