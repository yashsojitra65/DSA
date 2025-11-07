package HashTable;

import java.util.*;

//16-01-2023
//3005.Count Elements With Maximum Frequency.
public class LeetCode3005 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int max = 0, count = 0;
        for (int i : map.values()) {
            if (i == max) {
                count++;
            } else if (i > max) {
                max = i;
                count = 1;
            }
        }
        System.out.println(max * count);
    }
}
