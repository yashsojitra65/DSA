package HashTable;

import java.util.*;
//16-05-2023
//242. Valid Anagram.
public class LeetCode242 {
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map);
        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c) - 1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> me : map.entrySet()){
            if(me.getValue() != 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
