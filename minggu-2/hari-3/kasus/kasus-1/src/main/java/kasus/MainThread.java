package kasus;

public class MainThread {
    public static void main(String[] args) {
        // berikut merupakan jenis2 tipe data yang digunakan dalam thread
        // jadi ketika tipe data di isi variabel maka setelah itu mendapatkan variabel
        // tsb.
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        // State state = Thread.currentThread().getState();
        String threadGroupName = Thread.currentThread().getThreadGroup().getName();
        System.out.println("id=" + id + "; name = " + name + "; priority = " + priority + "; threadGroupName = "
                + threadGroupName);

    }
}