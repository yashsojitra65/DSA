package LeetCode;
import java.util.*;
//15-10-2023
//2903.Find Indices With Index and Value Difference I.
public class LeetCode2903{
    public static void main(String[] args) {
        int[] arr = {5,1,4,1};
        int indexDifference = 2;
        int valueDifference = 4;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (Math.abs(i - j) < indexDifference) {
                    continue;
                }
                if (Math.abs(arr[i] - arr[j]) < valueDifference) {
                    continue;
                }
                ans[0] = i;
                ans[1] = j;
                System.out.println(Arrays.toString(ans));
                return;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
