package Matrix;
import java.util.*;
//11-01-2023
//9. Find element from sorted matrix : Binary search
public class sorted_matrix_binary {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,5,6},
                {4,9,4},
                {7,8,3}
        };
        int r=matrix.length;
        int c = matrix[0].length;
        int top=0;
        int bottom=c-1;
        int value = 8;
        int[] ans = new int[r * c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[index++] = matrix[i][j];
            }
        }

        Arrays.sort(ans);

        int left = 0;
        int right = ans.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (ans[mid] == value) {
                System.out.println("Value is present in the matrix.");
                return;
            } else if (ans[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Value is not present in the matrix.");
//        while (top<=bottom){
//            int mid = (top+bottom)/2;
//            if(value == mid){
//                System.out.println("value present");
//                return;
//            }else if (value < mid){
//
//            }
//        }
    }
}
