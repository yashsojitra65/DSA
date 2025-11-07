package HashTable;

import java.util.*;
//03-05-2023
//804. Unique Morse Code Words.
public class LeetCode804 {
    public static void main(String[] args) {
        String s[] = {"gin","zen","gig","msg"};
        String symbol[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> map = new HashMap<>();

        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, symbol[c - 'a']);
        }
        System.out.println(map);

        HashSet<String> set = new HashSet<>();
        for(String word : s){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                sb.append(map.get(c));
            }
            set.add(sb.toString());
        }
        System.out.println(set);

//        for(String i : s){
//            StringBuilder sb = new StringBuilder();
//            for(char c : i.toCharArray()){
//                sb.append(symbol[c - 'a']);
//            }
//            set.add(sb.toString());
//        }
//        System.out.println(set);
//        System.out.println(set.size());
    }
}
