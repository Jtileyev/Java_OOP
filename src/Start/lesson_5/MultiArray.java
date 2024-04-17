package Start.lesson_5;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][][] numbers = {{{1,2,3},{3,4,5}},{{6,7,8},{9,10,11}}};
        for (int[][] array : numbers) {
            second:
            for (int[] row : array) {
                for (int col : row) {
                    System.out.println(col);
                    if (col == 2) {
                        break second;
                    }
                }
            }
        }
    }
}
