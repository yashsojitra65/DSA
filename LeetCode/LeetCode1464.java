package LeetCode;

import java.util.Arrays;

//21-02-2023
//1464. Maximum Product of Two Elements in an Array.
public class LeetCode1464 {
    public static void main(String[] args) {
        int[] arr = {1,7,4,5};
        int n = arr.length;
        int max = 0;
        int min = 0;

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                min = max;
                max = arr[i];
            } else if (arr[i] > min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println((max - 1) * (min - 1));
    }
}

