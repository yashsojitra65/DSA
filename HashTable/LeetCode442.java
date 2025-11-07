package HashTable;

import java.util.*;
//20-05-2023
//442. Find All Duplicates in an Array.
public class LeetCode442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i : arr){
            if(set.contains(i)){
                ans.add(i);
            }else {
                set.add(i);
            }
        }
        System.out.println(ans);
    }
}
