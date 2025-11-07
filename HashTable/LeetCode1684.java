package HashTable;

import java.util.*;
//06-05-2023
//1684. Count the Number of Consistent Strings.
public class LeetCode1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(char s : allowed.toCharArray()){
            set.add(s);
        }
        System.out.println(set);
        for (String s : words){
            boolean flag = true;
            for(int i=0; i<s.length(); i++){
                if(!set.contains(s.charAt(i))){
                    flag = false;
                }
            }
            if(flag){
                count++;
            }
        }
        System.out.println(count);

//        Map<Character,Integer> map = new HashMap<>();
//
//        for(char s : allowed.toCharArray()){
//            map.put(s,map.getOrDefault(s,0) + 1);
//        }
//        System.out.println(map);
//        for(String s : words){
//            boolean flag = true;
//            for(int i=0; i<s.length(); i++){
//                if(!map.containsKey(s.charAt(i))){
//                    flag = false;
//                }
//            }
//            if(flag){
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
