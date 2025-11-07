package HashTable;
import java.util.*;
//12-08-2023
//1128.Number of Equivalent Domino Pairs.

public class LeetCode1128 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {2,1},
                {1,1},
                {1,2},
                {2,2}
        };
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for (int[] ans : arr) {
            int i = ans[0] * 10 + ans[1];
            int j = ans[1] * 10 + ans[0];

            if(map.containsKey(i)){
                count += map.get(i);
            }
            if(i != j){
                if(map.containsKey(j)){
                    count += map.get(j);
                }
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        System.out.println(count);
    }
}
