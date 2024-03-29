package core_java.Array;

import java.util.Scanner;

public class Demo_Readarray {

    // passing array

    public void PassingArray(float percentage[]) {
        percentage[4] = 0.0f;
        System.out.println(percentage[0]); // 4th position value
        Scanner scan = new Scanner(System.in);
        System.out.println(" which position of percentage value you want...!");
        int position = scan.nextInt();

        System.out.println(position + " position value is :" + percentage[position]);
    }

    public static void main(String[] args) {
        Demo_Readarray read = new Demo_Readarray();

        float CGPA[] = { 7.8f, 9.8f, 6.1f, 6.6f, 9.9f, 8.4f };

        read.PassingArray(CGPA);
    }
}
