package HashTable;
import java.util.*;
//23-08-2023
//2506.Count Pairs Of Similar Strings.
public class LeetCode2506 {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        HashMap<Set<Character>, Integer> map = new HashMap<>();

        for(String s: words){
            Set<Character> set = new HashSet<>();
            for(char c: s.toCharArray()){
                set.add(c);
            }
            map.put(set, map.getOrDefault(set,0)+1);
        }

        int ans = 0;
        for(int i: map.values()){
            ans += i * (i - 1)/ 2;
        }
        System.out.println(ans);
    }
}
