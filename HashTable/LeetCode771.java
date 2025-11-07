package HashTable;

import java.util.*;
//04-05-2023
//771. Jewels and Stones.
public class LeetCode771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int count = 0;
        Map<Integer,Character> map = new HashMap<>();

        for(int i=0; i<jewels.length(); i++) {
            map.put(i, jewels.charAt(i));
        }
        System.out.println(map);
        for(int i=0;i<stones.length(); i++){
            if(map.containsValue(stones.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
