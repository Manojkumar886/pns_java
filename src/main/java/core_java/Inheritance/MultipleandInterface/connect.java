package core_java.Inheritance.MultipleandInterface;

public class connect implements Scooty, Car, Bike {

    public void java() {
        System.out.println(" JAVA BIKE");
    }

    public void BMW() {
        System.out.println("BMW CAR");
    }

    public void access125() {
        System.out.println("ACCESS!@% SCOOTY");
    }

    public static void main(String[] args) {
        connect c = new connect();
        c.BMW();
        c.access125();
        c.java();
    }

}
