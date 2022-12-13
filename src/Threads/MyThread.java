package Threads;

public class MyThread implements Runnable {


    @Override
    public void run() {
        //task for thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("value of i is " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {


            }

        }
    }

    public static void main(String[] args) {

        //Thread using Runnable interface
        System.out.println("Thread using Runnable interface");
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();

        // Thread using Thread class
        System.out.println("Thread using Thread class");
        MyAnotherThread t2 = new MyAnotherThread();
        t2.start();


    }
}
