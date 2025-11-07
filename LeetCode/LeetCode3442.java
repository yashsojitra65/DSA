package LeetCode;
import java.util.*;
//04-11-2025
//3442. Maximum Difference Between Even and Odd Frequency I.
public class LeetCode3442 {
    public static void main(String[] args) {
        String s = "mmsmsym";
        Map<Character,Integer> map = new HashMap<>();
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (Map.Entry<Character,Integer> m : map.entrySet()) {
            if (m.getValue() % 2 == 0) {
                even = Math.min(even, m.getValue());
            } else {
                odd = Math.max(odd, m.getValue());
            }
        }
        System.out.println(odd - even);
    }
}
