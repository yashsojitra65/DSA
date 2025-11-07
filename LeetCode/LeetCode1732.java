package LeetCode;

import java.util.Arrays;
//1732. Find the Highest Altitude
public class LeetCode1732 {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        int n = arr.length;
        int[] ans = new int[n+1];
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
            ans[i+1] = sum;
        }
        Arrays.sort(ans);
        System.out.print(ans[n]);
    }
}
