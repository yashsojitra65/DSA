package LeetCode;
import java.util.*;
//04-11-2025
//3541. Find Most Frequent Vowel and Consonant.
public class LeetCode3541 {
    public static void main(String[] args) {
        String s = "successes";
        Map<Character,Integer> map = new HashMap<>();
        int vowel = 0;
        int consonants = 0;

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getKey() == 'a' || m.getKey() == 'e' || m.getKey() == 'i' || m.getKey() == 'o' || m.getKey() == 'u'){
                vowel = Math.max(vowel,m.getValue());
            }else {
                consonants = Math.max(consonants,m.getValue());
            }
        }
        System.out.println(vowel + consonants);
    }
}
