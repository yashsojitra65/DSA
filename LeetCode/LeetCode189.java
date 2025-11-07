package LeetCode;
import java.util.*;
//17-08-2023
//189.Rotate Array.
public class LeetCode189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
