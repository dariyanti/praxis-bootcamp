package latihan;

public class SimpleThreads {

    // menampilkan sebuah pesan
    // di dahului oleh thread saaat ini
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    private static class MessageLoop implements Runnable {
        public void run() {
            String importantInfo[] = { "Mares makan gandum", "Apakah domba makan gandum", "Domba kecil makan ivy",
                    "Seorang anak kecil juga makan ivy" };
            try {
                for (int i = 0; i < importantInfo.length; i++) {
                    // menunda selama 4 detik
                    Thread.sleep(4000);
                    // Print pesan
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("Saya belum selesai!");
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {

        // Penundaan, dalam milidetik sebelumnya
        // kami menyela MessageLoop
        // Thread (default satu jam)
        long patience = 1000 * 60 * 60;

       
        // Jika argumen baris perintah
        // telah muncul, menunggu
        // dalam hitungan detik.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argumen harus berupa bilangan bulat.");
                System.exit(1);
            }
        }

        threadMessage("Mulai utas MessageLoop");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Menunggu thread messageLoop selesai");
        
        // berulang sampai MessageLoop
        // thread keluar
        while (t.isAlive()) {
            threadMessage("Sedang menunggu...");
            
        // Tunggu maksimal 1 detik
        // untuk menyelesaikan thread MessageLoop
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                threadMessage("Lelah Menunggu!");
                t.interrupt();
                
        // Seharusnya tidak lama lagi
        // - tunggu tanpa batas
                t.join();
            }
        }
        threadMessage("Selesai!");
    }
}