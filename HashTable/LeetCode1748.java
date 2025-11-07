package HashTable;

import java.util.*;
//11-05-2023
//1748. Sum of Unique Elements.

public class LeetCode1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int sum = 0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(map.keySet().contains(val)){
                map.put(val, map.get(val) + 1);
            }
            else{
                map.put(val, 1);
            }
        }
        System.out.println(map);
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                sum += key;
            }
        }
        System.out.println(sum);
    }
}
