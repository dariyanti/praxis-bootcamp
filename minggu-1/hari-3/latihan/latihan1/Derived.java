/**
 * class derived merupakan kelas anak dari base jadi dia mengextends ke class
 * parentnya pada class ini di label dengan override untuk menandakan bahwa
 * methods ini juga dipakai dikelas parentnya sedangkan tulisan println akan
 * menampilkan apa yang nantinya muncul dilayar
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