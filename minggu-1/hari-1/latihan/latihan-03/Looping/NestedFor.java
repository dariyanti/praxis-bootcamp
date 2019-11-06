import java.util.Scannerr;

public class NestedFor{
    public static void main(String[] args) {
        for (int j=0; j<10; j++)
        {
            for (int i=1; i<=10; i++)
            {
                System.out.println((i*j)+"");
            }
            System.out.println();
        }
    }
}