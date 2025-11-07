package HashTable;

import java.util.*;
//16-05-2023
//1394. Find Lucky Integer in an Array.
public class LeetCode1394 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = -1;

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> me : map.entrySet()){
            if(me.getKey() == me.getValue()){
                n = Math.max(me.getKey(),n);
            }
        }
        System.out.println(n);
    }
}
