package HashTable;
import java.util.*;
//28-08-2023
//677.Map Sum Pairs.
public class LeetCode677 {
    static HashMap<String,Integer> map;
    public static void main(String[] args) {
        MapSum();
        insert("apple",3);
        System.out.println(sum("ap"));
        insert("app",2);
        System.out.println(sum("ap"));
    }
    public static void MapSum(){
        map = new HashMap<>();
    }
    public static void insert(String key, int val) {
        map.put(key, val);
    }
    public static int sum(String prefix) {
        int ans = 0;
        for (String key: map.keySet()) {
            if (key.startsWith(prefix)) {
                ans += map.get(key);
            }
        }
        return ans;
    }
}
