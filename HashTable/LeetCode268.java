package HashTable;

import java.util.*;
//15-05-2023
//268. Missing Number.
public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = {0,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);
        for(int i=0;i<=set.size(); i++){
            if(!set.contains(i)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
