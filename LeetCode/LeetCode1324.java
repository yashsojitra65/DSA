package LeetCode;

import java.util.ArrayList;

//18-12-2025
//1324. Print Words Vertically.
public class LeetCode1324 {
    public static void main(String[] args) {
        String s = "HOW IS IT GOING";
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        int len = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words.add(sb.toString());
                if (sb.length() > len) {
                    len = sb.length();
                }
                sb.delete(0, sb.length());
            } else {
                sb.append(s.charAt(i));
            }
        }
        words.add(sb.toString());
        if (sb.length() > len) {
            len = sb.length();
        }
        sb.delete(0, sb.length());
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < words.size(); j++) {
                if (words.get(j).length() <= i) {
                    sb.append(" ");
                } else {
                    sb.append(words.get(j).charAt(i));
                }
            }
            ans.add(sb.toString().stripTrailing());
            sb.delete(0, sb.length());
        }
        System.out.println(ans);
    }
}
