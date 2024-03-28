package core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray_Update {
    public static void main(String[] args) {
        String[] Student_list = { "Subash", "Praveen", "Hari", "Venkadesh", "Niranjana", "Vineth" };

        Student_list[5] = "Manoj";
        // Student_list[4] = "Nivi";
        // System.out.println(Arrays.toString(Student_list));
        DemoArray_Update scan1 = new DemoArray_Update();
        System.out.println("Before update studentlist: \n" + Arrays.toString(Student_list));
        Scanner scan = new Scanner(System.in);
        System.out.println(" which index of student name you will change? \n index value starting @ 0 to "
                + (Student_list.length - 1));
        int index = scan.nextInt();
        System.out.println("you are selected " + index + "position value is :" + Student_list[index]);
        System.out.println(" please enter your new name...!");
        String newname = scan.next();

        Student_list[index] = newname;

        System.out.println("After update studentlist: \n" + Arrays.toString(Student_list));
    }
}
