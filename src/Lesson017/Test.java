package Lesson017;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        System.out.println("Hello from main thread");
//
//        Thread.sleep(3000);
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
//
//        System.out.println("Hello from main thread2");
//        System.out.println("I am going to sleep");
//        Thread.sleep(3000);
//        System.out.println("I am awake");

        Thread thread = new Thread(new Runner());
        thread.start();
        Thread thread2 = new Thread(new Runner());
        thread2.start();

    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 4; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello my thread! " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i < 4; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello my thread! " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//class MyThread2 extends Thread {
//    public void run() {
//        for(int i = 0; i < 4; i++) {
//            System.out.println("Hello my thread2!");
//        }
//    }
//}