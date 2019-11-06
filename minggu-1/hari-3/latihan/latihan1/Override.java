/**
 * override berguna untuk melabel bahwa teknik yang digunakan oleh class
 * parentnya harus di ubah. sedangkan didalam void merupakan sebuah fungsi untuk
 * menampilkan sesuatu sedangkan tulisan println akan menampilkan apa yang
 * nantinya muncul dilayar
 * 
 * @param void
 * @return
 * @author Dariyanti
 */
public class Derived extends Base {

    @Override
    public void display(int x) {
        System.out.println("Derived display (int)");
    }

    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display();
    }
}