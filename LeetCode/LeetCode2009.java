package LeetCode;
import java.util.*;
//10-10-2023
//2009.Minimum Number of Operations to Make Array Continuous.
public class LeetCode2009 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,3};
        int n = arr.length;
        int ans = n;

        Arrays.sort(arr);
        int k = 1;
        int j = 0;

        for(int i=1; i<n; i++) {
            if(arr[i] != arr[i-1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        for(int i=0; i<k; i++) {
            while(j<k && arr[j] < arr[i] + n) {
                j++;
            }
            ans = Math.min(ans, n - j + i);
        }
        System.out.println(ans);
    }
}
