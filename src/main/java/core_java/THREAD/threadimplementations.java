package core_java.THREAD;

public class threadimplementations {

    // main method-thread
    public static void main(String[] args) throws Exception {

        // DemoThread1 th1 = new DemoThread1();
        // th1.start();

        // th1.join();

        DemoThread2 th2 = new DemoThread2();
        Thread th22 = new Thread(th2);
        th22.start();

        DemoThread2 th3 = new DemoThread2();
        Thread th33 = new Thread(th2);
        th33.start();

        // th22.join();

        // System.out.println("Thank you");

    }
}

class DemoThread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {

            }
        }
    }
}

// public interface Runnable{
// public void run();
// }

class DemoThread2 implements Runnable {
    synchronized public void run() {
        int i = 5;
        for (int j = 1; j <= 5; j++) {
            System.out.println(j + "X" + i + "=" + (j * i));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {

            }
        }
    }

}