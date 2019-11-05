
import java.util.Scanner;

public class PenjumlahanMatriksUserInput {
    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];

        Scanner input = new Scanner(System.in);

        System.out.println("INPUT ARRAY A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai A[" + i + "][" + j + "] : ");
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("INPUT ARRAY B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai B[" + i + "][" + j + "] : ");
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("MATRIKS A");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("MATRIKS B");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
        }

        int hasil = 0;

        System.out.println("HASIL PENJUMLAHAN MATRIKS A DAN B");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                hasil = hasil + A[i][j] + B[i][j];
                System.out.print(hasil + " ");
                hasil = 0;
            }
            System.out.println(" ");
        }
    }
}