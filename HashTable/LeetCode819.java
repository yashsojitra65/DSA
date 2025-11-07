package HashTable;
import java.util.*;
//18-10-2023
//819.Most Common Word.
public class LeetCode819 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String[] arr = paragraph.split("[^a-zA-Z0-9]+");
//        String[] arr = paragraph.split("\\W");
        int max = Integer.MIN_VALUE;
        String ans = "";
        HashMap<String,Integer> map = new HashMap<>();

        for(String s : arr){
            s = s.toLowerCase();
            map.put(s,map.getOrDefault(s,0) + 1);
        }
        System.out.println(map);
        for(String s : banned) {
            if(map.containsKey(s)) {
                map.remove(s);
            }
        }
        for(String key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }
        System.out.println(ans);
    }
}