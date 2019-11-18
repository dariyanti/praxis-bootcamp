package crckaryawan;
/**
 * Karyawan
 */
public class Karyawan{
    private String department;
    private int kodeKaryawan;
    private String namaKaryawan;
    /**
     * Get Department
     * @return
     */
    public String getDepartment(){
        return department;
    }
    /**
     * set Department
     * @param department
     */
    public void setDepartment(String department){
        this.department = department;
    }
    /**
     * mendapatkan kode dari karyawan
     * @return
     */
    public int getKodeKaryawan(){
        return kodeKaryawan;
    }
    /**
     * set kode Karyawan
     * @param kodeKaryawan
     */
    public void setKodeKaryawan(int kodeKaryawan){
        this.kodeKaryawan = kodeKaryawan;
    }
    /**
     * mendapatkan nama karyawan
     * @return
     */
    public String getNamaKaryawan(){
        return namaKaryawan;
    }
    /**
     * set nama karyawan
     * @parah namaKaryawan
     */
    public void setNamaKaryawan(String namaKaryawan){
        this.namaKaryawan = namaKaryawan;
    }

}