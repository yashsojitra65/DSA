package HashTable;

import java.util.*;
//05-05-2023
//2367. Number of Arithmetic Triplets.
public class LeetCode2367 {
    public static void main(String[] args) {
        int[] arr = {0,1,4,6,7,10};
        int diff = 3;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i< arr.length; i++){
            int ans1 = arr[i] - diff;
            if(set.contains(ans1)){
                int ans2 = ans1 - diff;
                if(set.contains(ans2)){
                    count++;
                }
            }
            set.add(arr[i]);
        }
        System.out.println(count);
    }
}
