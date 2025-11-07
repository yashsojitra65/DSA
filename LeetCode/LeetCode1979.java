package LeetCode;

import java.util.Arrays;

//23-02-2023
//1979. Find Greatest Common Divisor of Array.
public class LeetCode1979 {
    public static void main(String[] args) {
        int[] arr = {7,5,6,8,3};
        int n = arr.length;
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        while(max != 0){
            int temp = max;
            max = min % max;
            min = temp;
        }
        System.out.println(min);
    }
}
