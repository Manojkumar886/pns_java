package core_java;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {

        String place;
        int age, regno;
        DemoScanner scan1 = new DemoScanner();

        Scanner scan = new Scanner(System.in);

        System.out.println("what is your name");
        String name = scan.next();
        System.out.println(" what is your age ");
        age = scan.nextInt();

        System.out.println("my name is :" + name + "\n my age is :" + age);

        System.out.println(" what is your initial");
        char initial = scan.next().charAt(0);

        System.out.println(" my initial :" + initial);
    }

}