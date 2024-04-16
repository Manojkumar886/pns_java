package core_java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class runtimeexception {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println(" please enter a value");
            int a = scan.nextInt();
            System.out.println(" enter your b value");
            int b = scan.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println(" please enter b value is not zero");
            Scanner scan = new Scanner(System.in);
            System.out.println(" please enter a value");
            int a = scan.nextInt();
            System.out.println(" enter your b value");
            int b = scan.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException ie) {
            System.out.println(ie);
            try {
                System.out.println(" please enter only numeric numbers");
                System.out.println(" please enter b value is not zero");
                Scanner scan = new Scanner(System.in);
                System.out.println(" please enter a value");
                int a = scan.nextInt();
                System.out.println(" enter your b value");
                int b = scan.nextInt();
                System.out.println(a / b);
            } catch (ArithmeticException ae) {
                System.out.println(ae);

            }

        } finally {
            System.out.println("thank you");
        }
    }

}
