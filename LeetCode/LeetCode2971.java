package LeetCode;
import java.util.*;
//25-12-2023
//2971.Find Polygon With the Largest Perimeter.
public class LeetCode2971 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Arrays.sort(nums);

        long ans = -1;
        long sum = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i >= 2 && sum > nums[i]){
                ans = sum + nums[i];
                continue;
            }
            sum += nums[i];
        }

        System.out.println(ans);
    }
}
