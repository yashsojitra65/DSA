package LeetCode;

import java.util.ArrayList;
import java.util.List;

//24-02-2023
//1380. Lucky Numbers in a Matrix.
public class LeetCode1380 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[][] matrix = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        };
        for (int i = 0; i < matrix.length; i++) {
            int j = isMin(matrix[i]);
            int ans = isMax(matrix, j);
            if(matrix[i][j] == ans) {
                list.add(ans);
            }
        }
        System.out.println(list);
    }

    private static int isMax(int arr[][], int j) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i][j]);
        }
        return max;
    }

    private static int isMin(int arr[]) {
        int min = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                j = i;
            }
        }
        return j;
    }
}
