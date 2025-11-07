package HashTable;
import java.util.*;
//31-08-2023
//532.K-diff Pairs in an Array.
public class LeetCode532 {
    public static void main(String[] args) {
        int[] arr = {3,1,4,1,5};
        int k = 2;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int n: arr) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for (Map.Entry<Integer, Integer>entry : map.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && map.containsKey(x + k)) {
                count++;
            } else if (k == 0 && val > 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
