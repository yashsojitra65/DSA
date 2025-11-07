package HashTable;
import java.util.*;
//12-09-2023
//1647.Minimum Deletions to Make Character Frequencies Unique.
public class LeetCode1647 {
    public static void main(String[] args) {
        String s = "abcabc";
        int[] freq = new int[26];
        for (int i=0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i< freq.length; i++) {
            while (freq[i] > 0 && set.contains(freq[i])) {
                freq[i]--;
                count++;
            }
            set.add(freq[i]);
        }
        System.out.println(count);
    }
}
