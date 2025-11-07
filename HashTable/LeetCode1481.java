package HashTable;
import java.util.*;
//11-08-2023
//1481.Least Number of Unique Integers after K Removals.
public class LeetCode1481 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());

        while (k > 0){
            k -= pq.poll();
        }
        if(k < 0){
            System.out.println(pq.size() + 1);
        }
        System.out.println(pq.size());
    }
}
