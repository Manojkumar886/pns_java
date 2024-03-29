package core_java.Array;

public class Two_DArray {
    public static void main(String[] args) {
        // datatype [][] arrayname={{}, {}, {} };
        // 0 1 2
        int[][] matrix = { { 45, 67, 89, 78 }, { 34, 57, 67, 57 }, { 45, 234, 55, 78 } };
        // 0 1 2 3 0 1 2 3 0 1 2 3

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                System.out.print(matrix[row][column] + " ");// matrix[0][0],[0][1],[0][2],[0][3],[0][4]==false
            }
            System.out.println();
        }

        // 45 67 89 78
        // 34 57 67 57
        // 45 234 55 78

    }
}
