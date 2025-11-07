package LeetCode;
import java.util.*;
//28-08-2023
//916.Word Subsets.
public class LeetCode916 {
    public static void main(String[] args) {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};

        int[] arr = new int[26];
        for (String s : words2) {
            int[] ans = helper(s);
            for (int i=0; i<26; i++) {
                arr[i] = Math.max(arr[i], ans[i]);
            }
        }

        List<String> list = new ArrayList<>();
        for (String s : words1) {
            int[] ans = helper(s);
            boolean flag = true;
            for (int i=0; i<26; i++) {
                if (ans[i] < arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(s);
            }
        }

        System.out.println(list);
    }

    public static int[] helper(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        return arr;
    }
}