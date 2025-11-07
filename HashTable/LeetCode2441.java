package HashTable;

import java.util.*;
//12-05-2023
//2441.Largest Positive Integer That Exists With Its Negative.
public class LeetCode2441 {
    public static void main(String[] args) {
        int[] arr = {-1,10,6,7,-7,1};
        int k = -1;
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);
        for(int i : set){
            if(i > k && set.contains(-i)){
                k = i;
            }
        }
        System.out.println(k);
    }
}
