package core_java.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class spiraltask1 {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // 0 1 2
        // 0 1 2 3
        // 1 4 5 6
        // 2 7 8 9

        int[] result = new int[9];

        int index = 0;
        int row = 1;
        int column = 1;

        for (; column <= 2; column++) {
            result[index] = matrix[row][column];
            index++;

            // result [0]=matrix[1][1]= 5
            // result [1]=matrix[1][2]= 6
            // result [2]=matrix[1][3]= ?false
        }

        column--; // 2
        row++; // 2

        for (; column >= 0; column--) {
            result[index] = matrix[row][column];
            index++;
            // result [2]=matrix[2][2]= 9
            // result [3]=matrix[2][1]= 8
            // result [4]=matrix[2][0]= 7
            // result [5]=matrix[2][-1]= false
        }

        column++; // 0
        row--; // 1

        for (; row >= 0; row--) {
            result[index] = matrix[row][column];
            index++;
            // result [5]=matrix[1][0]= 4
            // result [6]=matrix[0][0]= 1
            // result [7]=matrix[-1][0]= false
        }

        row++; // 0
        column++; // 1

        for (; column <= 2; column++) {
            result[index] = matrix[row][column];
            index++;
            // result [7]=matrix[0][1]= 2
            // result [8]=matrix[0][2]= 3

        }

        System.out.println(Arrays.toString(result));

    }
}
