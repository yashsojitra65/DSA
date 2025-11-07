package HashTable;

import java.util.*;
//17-05-2023
//2309. Greatest English Letter in Upper and Lower Case.
public class LeetCode2309 {
    public static void main(String[] args) {
        String s = "arRAzFif";
        HashSet<Character> set = new HashSet<>();

        for(char c : s.toCharArray()){
            set.add(c);
        }

        System.out.println(set);

        for(char c='Z'; c>='A'; c--){
            if(set.contains(c) && set.contains(Character.toLowerCase(c))){
                System.out.println(c + " ");
                return;
            }
        }
        System.out.print("");
    }
}
