package LeetCode;

import java.util.Arrays;

//27-02-2023
//905. Sort Array By Parity.
public class LeetCode905 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int[] ans = new int[arr.length];
        int start = 0;
        int end = arr.length-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                ans[start++] = arr[i];
            else
                ans[end--] = arr[i];
        }

        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
