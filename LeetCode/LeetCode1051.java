package LeetCode;

import java.util.Arrays;

//27-02-2023
//1051. Height Checker
public class LeetCode1051 {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        int[] ans = new int[arr.length];
        int count = 0;

        for(int i=0; i< arr.length; i++){
            ans[i] = arr[i];
        }
        Arrays.sort(ans);

        for(int j=0; j<arr.length; j++){
            if(arr[j] != ans[j]){
                count++;
            }
        }

        System.out.println(count);
    }
}
