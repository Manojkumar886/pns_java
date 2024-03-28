package core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class demoArray_Creation {
    public static void main(String[] args) {

        String[] IPL_Teams = { "CSK", "MI", "RCB", "SRH", "GT", "PUB", "LSG", "RR", "KKR", "DC" };

        // System.out.println(IPL_Teams); --> get array variable address

        // TOSTRING
        // System.out.println(Arrays.toString(IPL_Teams));

        // System.out.println(IPL_Teams.length);

        // System.out.println(IPL_Teams[10]);

        // FOR LOOP
        // for (int index = 0; index < IPL_Teams.length; index += 3) {
        // System.out.println(IPL_Teams[index]);
        // }

        // ARRAY FOR_EACH

        // for (String newipl : IPL_Teams) {
        // System.out.println(newipl);
        // }

        char[] initials = new char[10];

        // initials[0] = 'H';
        // initials[9] = 'K';
        // initials[4] = 'A';
        // System.out.println(Arrays.toString(initials));

        for (int i = 0; i < initials.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println(" Please enter any one alphabet value");
            char initials1 = scan.next().charAt(0);

            initials[i] = initials1; // initials[0]=M ,initials[1]=A
        }

        System.out.println(Arrays.toString(initials));
    }
}
