public class PenjumlahanMatriks {
    public static void main(String[] args) {
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];

        A[0][0] = 1;
        A[0][1] = 2;
        A[1][0] = 3;
        A[1][1] = 4;

        B[0][0] = 7;
        B[0][1] = 8;
        B[1][0] = 9;
        B[1][1] = 5;

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
    System.out.println("Hasil Penjumlahan Matriks A dan B");

    for(int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++) {
            hasil = hasil + A[i][j] + B[i][j];
            System.out.print(hasil + " ");
            hasil = 0;
        }
        System.out.println("");
    }
}
}