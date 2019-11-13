package kasus;

import java.util.Random;

public class Deadlock implements Runnable {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    private static final Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        Thread myThread1 = new Thread(new Deadlock(), "thread-1");
        Thread myThread2 = new Thread(new Deadlock(), "thread-2");
        myThread1.start();
        myThread2.start();
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            boolean b = random.nextBoolean();
            if (b) {
                System.out.println("[" + Thread.currentThread().getName() + "] Mencoba mengunci resource 1.");
                synchronized (resource1) {
                    System.out.println("[" + Thread.currentThread().getName() + "] Mengunci resource 1.");
                    System.out.println("[" + Thread.currentThread().getName() + "] Mencoba mengunci resource 2.");
                    synchronized (resource2) {
                        System.out.println("[" + Thread.currentThread().getName() + "] Mengunci sumber 2.");
                    }
                }
            } else {
                System.out.println("[" + Thread.currentThread().getName() + "] Mencoba mengunci sumber 1.");
                synchronized (resource2) {
                    System.out.println("[" + Thread.currentThread().getName() + "] Mengunci sumber 1.");
                    System.out.println("[" + Thread.currentThread().getName() + "] Mencoba mengunci sumber 2.");
                    synchronized (resource1) {
                        System.out.println("[" + Thread.currentThread().getName() + "] Mengunci sumber 1.");
                    }
                }
            }
        }
    }
}