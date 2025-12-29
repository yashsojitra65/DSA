package LeetCode;

import java.util.*;

//29-12-2025
//2150. Find All Lonely Numbers in the Array.
public class LeetCode2150 {
    public static void main(String[] args) {
        int[] arr = {10, 6, 5, 8};
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (map.get(i) == 1 && !map.containsKey(i - 1) && !map.containsKey(i + 1)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
