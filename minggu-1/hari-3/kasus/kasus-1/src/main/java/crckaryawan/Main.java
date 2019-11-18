package crckaryawan;

/**
 * main
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeKaryawan = 0;
        String namaKaryawan = "";
        String namaDepartemen = "";
        int jamMasuk = 0;
        int jamKeluar = 0;
        int gaji = 0;
        String next = "t";

        do {
            System.out.println("Department :");
            namaDepartemen = input.next();// next digunakan untuk variabel yg bertipe data string
            System.out.println("Kode karyawan :");
            kodeKaryawan = input.nextInt();// ini untuk variabel bertipe data integer
            System.out.println("Nama karyawan :");
            namaKaryawan = input.next();
            System.out.println("Jam masuk (1-24) :");
            jamMasuk = input.nextInt();
            System.out.println("Jam Keluar (1-24 :");
            jamKeluar = input.nextInt();
            System.out.println("Gaji :");
            gaji = input.nextInt();

            // di bagian ini digunakan untuk mengecek jam masuk dan keluar tidak lebih dari
            // 24 jam
            if (jamMasuk < 24 || jamKeluar < 24) {
                Department department = new Department(namaDepartemen, kodeKaryawan, namaKaryawan);
                department.setJamMasuk(jamMasuk);
                department.setJamKeluar(jamKeluar);
                department.setGaji(gaji);
                department.print();
            } else {
                System.out.println("Jam masuk dan jam keluar anda salah");
            }
            System.out.println("Input Lagi ? y/t");
            next = input.next();
        } while (next.equalsIgnoreCase("y"));
    }
}