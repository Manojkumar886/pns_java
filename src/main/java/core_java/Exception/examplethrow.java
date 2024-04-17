package core_java.Exception;

public class examplethrow {
    public void access() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException ne) {
            System.out.println(" method try block executed...!");
            throw ne;
        }
    }

    public static void main(String[] args) {
        examplethrow th = new examplethrow();

        try {
            th.access();
        } catch (NullPointerException npe) {
            System.out.println("main method catch block executed..!");

        } finally {
            System.out.println("thankyou");
        }

    }
}