package LeetCode;
import java.util.*;
//07-11-2025
//49. Group Anagrams.
public class LeetCode49 {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>> map = new HashMap<>();

        for(String i : arr){
            char[] c = i.toCharArray();
            Arrays.sort(c);
            String s = new String(c);

            if (map.containsKey(s)){
                map.get(s).add(i);
            }else {
                map.put(s, new ArrayList<>());
                map.get(s).add(i);
            }
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}
