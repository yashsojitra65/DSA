package HashTable;

import java.util.*;
//17-05-2023
//884. Uncommon Words from Two Sentences.
public class LeetCode884 {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        for(String s : str1){
            if(map.containsKey(s)){
                map.put(s,map.get(s) + 1);
            }else {
                map.put(s,1);
            }
        }
        for(String s : str2){
            if(map.containsKey(s)){
                map.put(s,map.get(s) + 1);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> me : map.entrySet()){
            if(me.getValue() == 1){
                count++;
            }
        }
        String[] ans = new String[count];
        int i = 0;
        for(Map.Entry<String,Integer> me : map.entrySet()){
            if(me.getValue() == 1){
                ans[i] = me.getKey();
                i++;
            }
        }
        for(String s : ans){
            System.out.print(s + " ");
        }
    }
}
