package LeetCode;
//21-08-2023
//392.Is Subsequence
public class LeetCode392 {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        int s1 = s.length(), t1 = t.length();
        int i = 0, j = 0;

        while (i < s1 && j < t1) {
            if (s.charAt(i) == t.charAt(j)) {
                i += 1;
            }
            j += 1;
        }
        System.out.println(i == s1);
    }
}
