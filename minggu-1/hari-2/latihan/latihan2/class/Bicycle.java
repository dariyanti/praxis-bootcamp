public class Bicycle {// class motor
    int cadence = 0;// motor punya irama
    int speed = 0;// motor punya kecepatan
    int gear = 1;// motor punya gigi

    void changeCadence(int newValue) {// ini fungsi untuk mengubah irama
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" + // ini untuk menampilkan berapa irama dari sepeda
                cadence + " speed:" + // ini untuk menampilkan berapa kecepatan dari sepeda
                speed + " gear:" + gear);// ini untuk menampilkan berapa gigi dari sepeda
    }
}