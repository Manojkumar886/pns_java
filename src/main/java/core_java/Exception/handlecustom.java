package core_java.Exception;

import java.util.Scanner;

public class handlecustom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age?");
        int age = scan.nextInt();

        try {
            if (18 <= age)
                System.out.println("something wrong..!");
            throw new customizeexception();
        } catch (customizeexception ce) {
            System.out.println(ce);
        }
    }

}
