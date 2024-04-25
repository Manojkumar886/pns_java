package core_java.THREAD;

public class threadmethods {
    static demothreadufnction demo = new demothreadufnction();

    public static void main(String[] args) {
        Thread th1 = new Thread() {
            public void run() {
                demo.LIST();
            }
        };

-(10);
        th2.start();
    }

}

class demothreadufnction {
    String[] IPL = { "CSK", "MI", "RCB", "DC", "RR", "SRH", "KKR" };

    synchronized public void LIST() {

        System.out.println("current id " + Thread.currentThread().getId());
        System.out.println("current thread name " + Thread.currentThread().getName());
        System.out.println("current Thread priority" + Thread.currentThread().getPriority());

        for (String ipl : IPL) {
            System.out.println(ipl);
        }
    }

}-