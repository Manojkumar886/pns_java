package core_java.Array;

import java.util.Scanner;

public class runtime2_D {

    public static void main(String[] args) {
        int[][] matrix = new int[3][4];

        Scanner scan = new Scanner(System.in);

        // inserted 2-d array
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                System.out.println("please enter your values @ row" + row + "@ column" + column);
                matrix[row][column] = scan.nextInt();
            }
        }

        // 2-d array list using foreach
        for (int newarray[] : matrix) {
            for (int newarray1 : newarray) {
                System.out.print(newarray1 + " ");
            }
            System.out.println();
        }
    }
}
