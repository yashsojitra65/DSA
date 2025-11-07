package HashTable;

import java.util.*;
//29-05-2023
//219. Contains Duplicate II.
public class LeetCode219 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else {
                int idx = map.get(nums[i]);
                if(Math.abs(idx - i) <= k){
                    System.out.println(true);
                    return;
                }else {
                    map.put(nums[i], i);
                }
            }
        }
        System.out.println(false);
    }
}
