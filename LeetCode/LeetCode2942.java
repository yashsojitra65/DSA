package LeetCode;
import java.util.*;
//26-11-2023
//2942.Find Words Containing Character.
public class LeetCode2942 {
    public static void main(String[] args) {
        String[] word = {"leet", "code"};
        char c = 'e';
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < word.length; i++) {
            if (helper(word[i], c)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static boolean helper(String word, char c) {
        for (char i : word.toCharArray()) {
            if (i == c) {
                return true;
            }
        }
        return false;
    }
}
