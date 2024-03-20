package core_java;

import java.util.Scanner;

public class demonestedif {

    static void nestedif(int cibilscore, double salary) {
        if (cibilscore >= 720) {
            System.out.println("your credit card is currently has approved");
            if ((salary >= 2.5) && (salary <= 3.5)) {
                System.out.println(" your loan transaction avilable 50 k only");
            } else if ((salary > 3.5) && (salary <= 5)) {

                System.out.println(" your loan transaction avilable one lakhs only");
                Scanner scan = new Scanner(System.in);
                System.out.println("enter your aadhar card no");
                long aadharno = scan.nextLong();
                if (aadharno == 289388398938l) {
                    System.out.println(" welcome..!");
                } else {
                    System.out.println("get out..!");
                }
            } else if (salary > 5) {
                System.out.println(" your loan transaction avilable 2lakhs only");
            } else {
                System.out.println(" your salary is very low..!");
            }
        } else {
            System.out.println("your credit card is currently not approved");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ----- Bajaj Credit Card Analysis section-----");

        System.out.println(" Please enter your cibil score");
        int cibilscore = scan.nextInt();

        System.out.println(" please enter your per annum salary...!");
        double annumsalary = scan.nextDouble();

        demonestedif.nestedif(cibilscore, annumsalary);
    }
}
