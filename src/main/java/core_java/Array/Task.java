package core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Task {
    static Scanner scan = new Scanner(System.in);

    public void Insert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Enter any number index @" + i);
            int newvalue = scan.nextInt();
            array[i] = newvalue;
        }
    }

    public void List(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void sta(String name) {
        name = "Kavitha";
    }

    public static void main(String[] args) {

        String name = "Manoj";
        Task.sta(name);
        System.out.println(name);
        int myarray[] = new int[5];

        myarray[3] = 787;
        Task T1 = new Task();

        do {
            System.out.println(" Which Process your want \n 1.Insert \n 2.Update \n 3.Read \n 4.List \n");
            int process = scan.nextInt();
            switch (process) {
                case 1:
                    T1.Insert(myarray);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    T1.List(myarray);
                    break;
                default:
                    return;
            }
        } while (true);
    }
}
