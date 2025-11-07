package LeetCode;

import java.util.*;
//12-06-2023
//228.Summary Ranges.
public class LeetCode228 {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> list = new ArrayList<>();

        if(nums.length == 0){
            System.out.println(list);
        }
        int a = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(i == nums.length-1 || nums[i]+1 != nums[i+1]){
                if(nums[i] != a){
                    list.add(a + "->" + nums[i]);
                }
                else {
                    list.add(a + "");
                }
                if(i != nums.length-1){
                    a = nums[i+1];
                }
            }
        }
        System.out.println(list);
    }
}

