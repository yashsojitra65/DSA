package LeetCode;
import java.util.*;
//03-08-2023
//1471.The k Strongest Values in an Array.
public class LeetCode1471 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.sort(arr);
        int k = 2;
        int[] ans = new int[k];
        int left = 0;
        int i = 0;
        int right = arr.length - 1;
        int mid = arr[(arr.length - 1) /2];

        while (i < k){
            if(Math.abs(arr[left] - mid) <= Math.abs(arr[right] - mid)){
                ans[i++] = arr[right];
                right--;
            }else {
                ans[i++] = arr[left];
                left++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
