package core_java.Array;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        // 0 1 2
        // int[][] demo = { { 1, 2, 3 }, { 5, 6, 7, 8, 9 }, { 10, 1, 1, 2, 34, 4, 545, 4
        // } };

        // for (int demo1[] : demo) {
        // for (int demo2 : demo1) {
        // System.out.print(demo2 + " ");
        // }
        // System.out.println();

        String[][] patientdetails = new String[2][];

        patientdetails[0] = new String[4];
        patientdetails[1] = new String[2];

        for (int floor = 0; floor < patientdetails.length; floor++) {
            for (int room = 0; room < patientdetails[floor].length; room++) {
                System.out.println(" -----------VASUGI EYE HOSPITAl-------");
                Scanner scan = new Scanner(System.in);
                System.out.println("floor no :" + floor + "\n room no:" + (room + 1) + "\t enter patient name");
                patientdetails[floor][room] = scan.next();
            }
        }

        for (String patient1[] : patientdetails) {
            for (String patient2 : patient1) {
                System.out.print(patient2 + "\t");
            }
            System.out.println();
        }
    }
}
