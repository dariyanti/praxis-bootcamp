package latihan;

public class MyApplication {
    private EmailService email = new EmailService();

    public void processMessages(String msg, String rec) {
        // untuk melakukan beberapa validasi pesan, melakukan beberapa manipulasi logika
        // dll
        this.email.sendEmail(msg, rec);
    }
}