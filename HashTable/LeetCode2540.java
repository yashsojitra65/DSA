package HashTable;

import java.util.*;
//15-05-2023
//2540. Minimum Common Value.
public class LeetCode2540 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4};
        int ans = -1;
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }
        System.out.println(set);

        for(int i : arr2){
            if(set.contains(i)){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
