package core_java.Control_Structures;

import java.util.Scanner;

public class DemoIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" What is your company Name..!");
        String emp_company_name = scan.nextLine();

        if (emp_company_name.equalsIgnoreCase("zealous")) {
            System.out.println(" you are eligible IT Purpose Work....!");
        } else if (emp_company_name.equalsIgnoreCase("nextwealth")) {
            System.out.println(" you are eligible to BPO section...");
        } else if (emp_company_name.startsWith("Info")) {
            System.out.println(" you are eligible to any sector process by ug and pg degree ...!");
        } else {
            System.out.println(" you are not eligible..!");
        }

    }
}
