package HashTable;

import java.util.*;

public class LeetCode692 {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 3;
        HashMap<String,Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue =new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<String> list = new ArrayList<>();

        for(String i : words){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        System.out.println(map);
        for(int i : map.values()){
            queue.add(i);
        }
        System.out.println(queue);
        int n = 0;
        while (k != n){
            int i = queue.poll();
            list.add(getKey(map,i));
            map.remove(getKey(map,i));
            n++;
        }
        System.out.println(list);
    }
    public static String getKey(Map<String, Integer> map, Integer value){
        for(Map.Entry<String,Integer> me : map.entrySet()){
            if(value.equals(me.getValue())){
                return me.getKey();
            }
        }
        return null;
    }
}
