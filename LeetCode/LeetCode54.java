package LeetCode;
import java.util.*;
//02-08-2023
//54.Spiral Matrix.
public class LeetCode54 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;

        while (top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
}