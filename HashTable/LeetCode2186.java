package HashTable;

import java.util.*;
//26-05-2023
//2186. Minimum Number of Steps to Make Two Strings Anagram II.
public class LeetCode2186 {
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "coats";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),map1.get(s.charAt(i)) + 1);
            }else {
                map1.put(s.charAt(i),1);
            }
        }
        for(char c : t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0) + 1);
        }
        System.out.println(map1);
        System.out.println(map2);

        int count = 0;
        for(char c : map1.keySet()){
            if(map2.containsKey(c)){
                count += Math.abs(map1.get(c) - map2.get(c));
            }
            else{
                count += map1.get(c);
            }
        }
        for(char c : map2.keySet()){
            if(!map1.containsKey(c)){
                count += map2.get(c);
            }
        }
        System.out.print(count);
    }
}
