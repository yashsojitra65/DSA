package LeetCode;

import java.util.Arrays;

//18-02-2023
//1913. Maximum Product Difference Between Two Pairs.
public class LeetCode1913 {
    public static void main(String[] args) {
        int[] arr = {5,6,2,7,4};
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int count = 0;

        count = ((arr[j] * arr[j-1]) - (arr[i] * arr[i+1]));
        System.out.print(count);
    }
}
