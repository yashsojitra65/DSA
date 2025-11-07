package HashTable;
import java.util.*;
//24-08-2023
//1624.Largest Substring Between Two Equal Characters.
public class LeetCode1624 {
    public static void main(String[] args) {
        String s = "abca";
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = -1;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                ans = Math.max(ans,i - map.get(c) - 1);
            }else {
                map.put(c,i);
            }
        }
        System.out.println(ans);
    }
}
