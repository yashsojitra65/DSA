package LeetCode;
import java.util.*;
//24-11-2023
//1877.Minimize Maximum Pair Sum in Array.
public class LeetCode1877 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,4,6};
        int sum = 0;

        Arrays.sort(arr);
        for(int i=0; i< arr.length/2; i++){
            sum = Math.max(sum,arr[i] + arr[arr.length - 1 - i]);
        }

        System.out.println(sum);
    }
}
