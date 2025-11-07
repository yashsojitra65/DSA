package HashTable;

import java.util.*;
//14-05-2023
//575. Distribute Candies
public class LeetCode575 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }
        int n = 0;
        n = Math.min(set.size(), arr.length/2);
        System.out.println(n);
    }
}
