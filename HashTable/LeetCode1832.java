package HashTable;

import java.util.*;
//05-05-2023
//1832. Check if the Sentence Is Pangram.
public class LeetCode1832 {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        //String s = "leetcode";
        HashSet<Character> set = new HashSet<>();

        for(char c:s.toCharArray()){
            set.add(c);
        }
        if(set.size() == 26){
            System.out.println(true);
            return;
        }
        System.out.println(false);


//        Map<Character,Integer> map = new HashMap<>();
//
//        for(char i='a'; i<='z'; i++){
//            map.put(i,0);
//        }
//
//        for(char i : s.toCharArray()){
//            map.put(i, map.get(i) + 1);
//        }
//        System.out.println(map);
//        for(Map.Entry<Character,Integer> me : map.entrySet()){
//            if(me.getValue() == 0){
//                System.out.println(false);
//                return;
//            }
//        }
//        System.out.println(true);
    }
}

