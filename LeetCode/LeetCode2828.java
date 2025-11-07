package LeetCode;
import java.util.*;
//20-08-2023
//2828.Check if a String Is an Acronym of Words.
public class LeetCode2828 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("charlie");
        String s = "abc";

        if (s.length() != list.size()) {
            System.out.println(false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String word : list) {
            sb.append(word.charAt(0));
        }
        String ans = sb.toString();

        System.out.println(s.equals(ans));
    }
}
