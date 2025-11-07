package LeetCode;
import java.util.*;
//05-08-2023
//119.Pascal's Triangle II.
public class LeetCode119 {
    public static void main(String[] args) {
        int rowIndex = 3;
        Integer arr[] = new Integer[rowIndex + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;

        for(int i = 1; i <= rowIndex; i ++) {
            for(int j = i; j > 0; j --) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }
        System.out.println(Arrays.asList(arr));
    }
}
