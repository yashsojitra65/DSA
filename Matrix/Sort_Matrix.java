package Matrix;
import java.util.*;
//Using Comparators
public class Sort_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {2,5,7},
                {1,9,8},
                {8,2,6}
        };

        Arrays.sort(arr,(arr1 ,arr2) -> {
            return arr1[0] - arr2[0];
        });

        for(int i[] : arr){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
