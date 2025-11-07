package LeetCode;

import java.util.Arrays;

//18-02-2023
//2500. Delete Greatest Value in Each Row.
public class LeetCode2500 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,4},
                {3,3,1}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;

        int ans = 0;
        for (int[] arr : matrix)
            Arrays.sort(arr);

        for (int i = 0; i < row; ++i) {
            int maxOfColumn = 0;
            for (int j = 0; j < col; ++j)
                maxOfColumn = Math.max(maxOfColumn, matrix[i][j]);
            ans += maxOfColumn;
        }

        System.out.println(ans+1);
    }
}
