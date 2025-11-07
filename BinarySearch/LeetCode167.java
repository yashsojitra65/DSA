package BinarySearch;
import java.util.*;
//06-09-2023
//167.Two Sum II - Input Array Is Sorted.
public class LeetCode167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = helper(arr,target);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] helper(int[] arr, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            } else if (sum < target) {
                ++left;
            } else {
                --right;
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}
