package HashTable;

import java.util.*;
//28-05-2023
//383. Ransom Note.
public class LeetCode383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        System.out.println(map);

        for(char c=0; c<ransomNote.length(); c++){
            if(map.getOrDefault(ransomNote.charAt(c),0) != 0){
                map.put(ransomNote.charAt(c),map.get(ransomNote.charAt(c)) - 1);
            }else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
