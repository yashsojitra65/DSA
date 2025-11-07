package HashTable;
import java.util.*;
//05-08-2023
//2405.Optimal Partition of String.
public class LeetCode2405 {
    public static void main(String[] args) {
        String s = "abacaba";
        HashSet<Character> set = new HashSet<>();
        int count = 1;

        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                count++;
                set.clear();
            }
            set.add(s.charAt(i));
        }
        System.out.println(count);
    }
}
