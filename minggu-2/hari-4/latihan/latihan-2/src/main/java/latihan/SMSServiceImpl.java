package latihan;

public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        // logika untuk mengirim email
        System.out.println("Email terkirim ke :" + rec + "dengan pesan :" + msg);
    }
}