package LeetCode;
import java.util.*;
//06-09-2023
//378.Kth Smallest Element in a Sorted Matrix.
public class LeetCode378 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int[] ans = new int[row * col];
        int k = 8;
        int idx = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans[idx++] = matrix[i][j];
            }
        }
        Arrays.sort(ans);
        System.out.println(ans[k-1]);
    }
}
