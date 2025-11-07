package HashTable;

import java.util.*;
//22-05-2023
//347. Top K Frequent Elements.
public class LeetCode347 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int k = 10;
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
        int[] ans = new int[k];
        int n = 0;
        for(int i : map.values()){
            queue.add(i);
        }
        System.out.println(queue);
        while(k != n){
            int x = queue.poll();
            ans[n++] = getkey(map, x);
            map.remove(getkey(map, x));
        }
//        for(Map.Entry<Integer,Integer> me : map.entrySet()){
//            if(queue.peek() == me.getValue() && n != k){
//                ans[n] = me.getKey();
//                queue.poll();
//                n++;
//            }
//        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
    public static Integer getkey(Map<Integer, Integer> map, Integer value){
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(value.equals(entry.getValue()))
                return entry.getKey();
        }
        return null;
    }
}

