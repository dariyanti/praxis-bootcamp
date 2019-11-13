package latihan;

 public class HelloRunnable implements Runnable{
     public void run(){
         System.out.println("Hello dari sebuah Thread!");
     }
     public static void main(String[] args) {
         (new Thread(new HelloRunnable())).start();
     }
 }