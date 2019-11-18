package crckaryawan;

/**
 * Department. class Department mengextends ke class karyawan
 */

public class Department extends Karyawan implements Absen {
    private int jamMasuk = 0;
    private int jamKeluar = 0;
    private int gaji = 0;

    private int kodeKaryawan = 0;
    private String namaDepartment;
    private String namaKaryawan;

    /**
     * Constructor
     * 
     * @param department
     * @param kodeKaryawan
     * @param namaKaryawan
     */
    public Department(String department, int kodeKaryawan, String namaKaryawan) {
        super(department,kodeKaryawan,namaKaryawan);
    }

    /**
     * interface harus diimplementasikan
     * 
     * @param jamMasuk
     */
    public void setJamMasuk(int jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public void setJamKeluar(int jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    private double hitungGaji() {
        return gaji * (jamKeluar - jamMasuk);
    }

    private int durasi() {
        return jamKeluar - jamKeluar;
    }

    public void print() {
        System.out.println("===========================================");
        System.out.println("|\t     GAJI KARYAWAN \t\t  |");
        System.out.println("===========================================");
        System.out.println("Department\t\t: " + super.getDepartment());
        System.out.println("Kode Karyawan\t\t: " + super.getKodeKaryawan());
        System.out.println("Nama Karyawan\t\t: " + super.getNamaKaryawan());
        System.out.println("===========================================");
        System.out.println("Jam Masuk\t\t: " + jamMasuk);
        System.out.println("Jam Keluar\t\t: " + jamKeluar);
        System.out.println("Durasi Kerja\t\t: " + durasi() + " Jam");
        System.out.println("Rate per Jam\t\t: Rp. " + gaji);
        System.out.println("===========================================");
        System.out.println("Gaji\t\t\t: Rp. " + hitungGaji());
        System.out.println("===========================================");
        System.out.println("|\t     TERIMA KASIH \t\t  |");
        System.out.println("===========================================");
    }
}