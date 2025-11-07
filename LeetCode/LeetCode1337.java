package LeetCode;

import java.util.*;
//08-06-2023
//1337.The K Weakest Rows in a Matrix.
public class LeetCode1337 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1},
        };
        int k = 3;
        int ans[] = new int[k];
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<matrix.length; i++){
            int sum = 0;
            for(int j=0; j<matrix[0].length; j++){
                sum += matrix[i][j];
            }
            list.add(sum);
        }
        for(int i=0; i<k; i++){
            ans[i] = list.indexOf(Collections.min(list));
            list.set(ans[i], Integer.MAX_VALUE);
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
