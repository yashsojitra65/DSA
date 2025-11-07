package HashTable;

import java.util.*;
//05-06-2023
//2357.Make Array Zero by Subtracting Equal Amounts.
public class leetCode2357 {
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            if(i > 0){
                set.add(i);
            }
        }
        System.out.println(set);
    }
}
