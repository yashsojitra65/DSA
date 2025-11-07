package HashTable;

import java.util.*;
//04-07-2023
//2423.Remove Letter To Equalize Frequency.
public class LeetCode2423 {
    public static void main(String[] args) {
        String word = "abcc";
//        int[] freq = new int[26];
//        for(char c : word.toCharArray()){
//            freq[c - 'a']++;
//        }
//        for(char c : word.toCharArray()){
//            freq[c - 'a']--;
//            if(check(freq)){
//                System.out.println(true);
//                return;
//            }
//            freq[c - 'a']++;
//        }
//        System.out.println(false);
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<word.length(); i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),map.get(word.charAt(i)) + 1);
            }else {
                map.put(word.charAt(i),1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            map.put(key,value - 1);

            HashSet<Integer> set = new HashSet<>(map.values());
            set.remove(0);
            if(set.size() == 1){
                System.out.print(true);
                return;
            }
            map.put(key,value);
        }
        System.out.print(false);
    }
//    public static boolean check(int[] freq){
//        int count = 0;
//
//        for(int f : freq){
//            if(f == 0) continue;
//            else if(count == 0){
//                count = f;
//            }else if(count == f) continue;
//            else return false;
//        }
//
//        return true;
//    }
}
