package HashTable;

import java.util.*;
//21-05-2023
//645. Set Mismatch.
public class LeetCode645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        int n = 0;

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                k = nums[i];
            }else {
                set.add(nums[i]);
            }
        }
        for(int i=1; i<= nums.length; i++){
            if(set.contains(i) == false){
                n = i;
                break;
            }
        }
        int[] ans = new int[]{k,n};
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
