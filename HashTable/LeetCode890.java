package HashTable;

import java.util.*;
//19-05-2023
//890. Find and Replace Pattern.
public class LeetCode890 {
    public static void main(String[] args) {
        String[] arr = {"abc","deq","mee","aqq","dkd","ccc"};
        String s = "abb";
        List<String> ans = new ArrayList<>();
        String s1 = patten(s);

        for (String i : arr) {
            if (s1.equals(patten(i))) {
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
    public static String patten(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            map.putIfAbsent(s.charAt(i),map.size());
            ans += map.get(s.charAt(i));
        }
        return ans;
    }
}