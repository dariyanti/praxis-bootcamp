package latihan;

public class Bicycle {// paling awal tulis nama kelas nya apa
    private int cadence;// kemudian didalam kelas tsb deklarasikan apa saja
    private int gear;// atributnya/member dari kelas diatas beserta tipe datanya
    private int speed;// lalu tentukan hak akses dri member tsb jika private maka atribut tsb tidak
                      // dapat diakses oleh kelas anaknya

    public Bicycle(int starCadence, int starGear, int starSpeed) {// setelah itu atribut diatas di masukan ke dalam
                                                                  // fungsi kelas bicycle
        gear = starGear;// lalu parameter yang ada didalam kelas tersebut di deklarasikan satu persatu
        cadence = starCadence;
        speed = starSpeed;
    }

    public int getCadence() {// kemudian disini dimasukan fungsi apa yang mau di terapkan ke cadence
        return cadence;// fungsi yang mengembalikan nilai karena ada return dan nilainya dalam bentuk
                       // int serta fungsi harus ditulis didalam class
    }

    public void setCadence(int newValue) {// void itu method yang tidak memiliki nilai atau tidak mengembalikan nilai.
        cadence = newValue;// jadi nilai yg dipakai adalah nilai baru
    }

    public int getGear() {
        return gear;// ini untuk mngembalikan nilai dari fungsi gear
    }

    public void setGear(int newValue) {
        gear = newValue;// untuk fungsi setgear diberikan nilai baru berupa integer
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {// fungsi applybrake atau pasang rem. parameter decrement berfungsi untuk
                                           // mengurangi kecepatan
        speed -= decrement;// kecepatan dikurangi
    }

    public void speedUp(int increment) {// fungsi untuk menambah kecepatan yg berisi parameter penambahan
        speed += increment;// penambahan kecepatan
    }
}