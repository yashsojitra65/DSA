package HashTable;

import java.util.*;
//19-05-2023
//448. Find All Numbers Disappeared in an Array.
public class LeetCode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int i=1; i<= nums.length; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
