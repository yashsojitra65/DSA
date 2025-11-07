package LeetCode;
import java.util.*;
//28-08-2023
//628.Maximum Product of Three Numbers.
public class LeetCode628 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Arrays.sort(arr);

        System.out.println(Math.max(arr[0] * arr[1] * arr[arr.length - 1], arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3]));
    }
}
