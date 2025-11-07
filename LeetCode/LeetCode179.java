package LeetCode;

import java.util.*;
//14-06-2023
//179.Largest Number.
public class LeetCode179 {
    public static void main(String[] args) {
        int[] nums = {23, 7, 45, 102};
        if(nums.length == 0) {
            return;
        }
        String[] ans = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(ans, (a,b) -> (b+a).compareTo(a+b));
        if(ans[0].equals("0")) {
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(String s : ans){
            sb.append(s);
        }
        System.out.println(sb);
    }
}
