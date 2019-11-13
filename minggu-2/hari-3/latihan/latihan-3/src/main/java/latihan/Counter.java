package latihan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Program Java menggambarkan
// pemrograman bersamaan dalam aksi.
// Runnable Class yang mendefinisikan logika
// metode run dari antarmuka runnable 
// - tunggu tanpa batas

public class Counter implements Runnable {
    private final MainApp mainApp;
    private final int loopLimit;
    private final String task;

    // Konstruktor untuk mendapatkan referensi ke kelas utama/mainApp
    // method yg berisi parameter
    public Counter(MainApp mainApp, int loopLimit, String task) {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
        this.task = task;
    }

    // Mencetak nama thread, nomor tugas, dan
    // nilai penghitung
    // Memanggil metode jeda untuk memungkinkan terjadinya multithreading

    // class runnable menganotasi override ke method
    @Override
    // method run dengan perulangan sesuai dengan parameter di method counter diatas
    public void run() {
        for (int i = 0; i < loopLimit; i++) {
            System.out
                    .println("Thread: " + Thread.currentThread().getName() + " Counter: " + (i + 1) + " Task: " + task);
            mainApp.pause(Math.random());
        }
    }
}

class MainApp {

    // Mumulai Thread. Ukuran kolam diisi angka 2 itu artinya setiap saat hanya
    // ada dua thread secara simultan
    public void startThread() {
        ExecutorService taskList = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            // membuat task agar tersedia untuk dieksekusi
            // At the appropriate time, calls run
            // method of runnable interface
            taskList.execute(new Counter(this, i + 1, "task " + (i + 1)));
        }

        // Shuts the thread that's watching to see if
        // you have added new tasks.
        taskList.shutdown();
    }

    // Pauses execution for a moment
    // so that system switches back and forth
    public void pause(double seconds) {
        try {
            Thread.sleep(Math.round(1000.0 * seconds));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Driver method
    public static void main(String[] args) {
        new MainApp().startThread();
    }
}