package HashTable;

import java.util.*;
//15-05-2023
//169. Majority Element.
public class LeetCode169 {
    public static void main(String[] args) {
        int[] arr = {3,3,4};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
        int max = 0;
        for(Map.Entry<Integer,Integer> me : map.entrySet()){
            max = Math.max(me.getValue(),max);
            if(max == me.getValue()){
                System.out.println(me.getKey());
            }
        }
    }
}
