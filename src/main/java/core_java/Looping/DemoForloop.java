package core_java.Looping;

import java.util.Scanner;

public class DemoForloop {
    public static void main(String[] args) {

        // for (int i = 6; i <= 5; i++) {
        // System.out.println("Zealous Tech Corp");
        // }

        int quickcomercount = 0;
        int latecomercount = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Zealous Tech corp..!");
        int staffcount = 5;

        for (; staffcount >= 1;) {
            System.out.println("staff no:" + staffcount);
            System.out.println("Please Enter your Login time");
            float time = scan.nextFloat();

            if (time > 9.15) {
                System.out.println(" your late comer...");
                latecomercount++;
            } else if ((time > 8.00) && (time <= 9.15)) {
                System.out.println(" you are quick comer ..keep it up...!");
                quickcomercount++;
            } else {
                System.out.println(" please enter correct time..!");
            }

            staffcount--;
        }

        System.out.println("today quick commer staff count :" + quickcomercount);
        System.out.println("Late comer staff count :" + latecomercount);
    }
}
