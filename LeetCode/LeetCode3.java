package LeetCode;

import java.util.*;
//11-07-2023
//3.Longest Substring Without Repeating Characters.
public class LeetCode3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int i = 0;

        while (right < s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)) + 1,left);
            }
            map.put(s.charAt(right),right);
            i = Math.max(i,right - left + 1);
            right++;
        }
        System.out.println(i);
    }
}
