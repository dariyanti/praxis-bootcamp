
//berikut code untuk meserialisasi dan deserialisasi dari java object
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;//library untuk meserialisasi dari object ke JSON

public class Test {
    public static void main(String[] args) {
        Demo object = new Demo(1, "geeksforgeeks");// isi dari demo adalah int dan string
        String filename = "file.ser";

        // proses serialisasi
        try {
            // menyimpan data dari object ke dalam file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // fungsi untuk meserialisasi dari object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object telah di serialisasi");

        } catch (IOException ex) {
            System.out.println("IOException telah dijalankan");
        }
        Demo object1 = null;

        // ini proses deserialisasi
        try {
            // membaca object dari sebuah file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // fungsi untuk mendeserialisasi object
            object1 = (Demo)in.readObject();
            in.close();
            file.close();

            System.out.println("Object telah di deserialisasi ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        } catch (IOException ex) {
            System.out.println("IOExceptions telah tertangkap");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class tidak ditemukan");
        }
    }
}
