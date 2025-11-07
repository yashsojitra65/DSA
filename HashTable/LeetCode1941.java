package HashTable;

import java.util.*;
//07-05-2023
//1941. Check if All Characters Have Equal Number of Occurrences.
public class LeetCode1941 {
    public static void main(String[] args) {
        String s = "aaabb";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char s1 : s.toCharArray()){
            map.put(s1,map.getOrDefault(s1,0) + 1);
        }
        System.out.println(map);

        HashSet<Integer> set = new HashSet<>();
        for(int i : map.values()){
            set.add(i);
        }
        if(set.size() == 1){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
