package LeetCode;

import java.util.Arrays;

//16-03-2023
//977. Squares of a Sorted Array.
public class LeetCode977 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};

        for(int i=0; i< arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
