import java.io.*;

public class Demo implements java.io.Serializable {
    public int a;// berarti hak akses nya public bisa diakses oleh semua class
    public String b;// variabel b dengan tipe data string

    public Demo(int a, String b)// kelas demo dijadikan fungsi yg memiliki parameter berupa integer dan string
    {
        this.a = a;
        this.b = b;
    }
}