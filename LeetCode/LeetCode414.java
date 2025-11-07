package LeetCode;

import java.util.*;
//11-06-2023
//414.Third Maximum Number.
public class LeetCode414{
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        if(set.size() >= 3){
            set.remove(Collections.max(set));
            set.remove(Collections.max(set));
        }
        System.out.println(Collections.max(set));
    }
}
