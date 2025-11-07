package HashTable;

import java.util.*;
//11-05-2023
//2085. Count Common Words With One Occurrence.
public class LeetCode2085 {
    public static void main(String[] args) {
        String[] word1 = {"leetcode","is","amazing","as","is"};
        String[] word2 = {"amazing","leetcode","is"};
        int count = 0;

        HashMap<String,Integer> map1 = new HashMap<>();
        for(String i : word1){
            map1.put(i, map1.getOrDefault(i,0) + 1);
        }
        System.out.println(map1);

        for(String i : word2){
            if(map1.containsKey(i)){
                if(map1.get(i) <= 1){
                    map1.put(i,map1.get(i) - 1);
                }
            }
        }
        for(String i : word1){
            if(map1.get(i) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
