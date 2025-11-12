package LeetCode;
//12-11-2025
//2414. Length of the Longest Alphabetical Continuous Substring.
public class LeetCode2414 {
    public static void main(String[] args) {
        String s = "abcde";
        int ans = 1;
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) - s.charAt(i) == 1) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 1;
            }
        }
        System.out.println(ans);
    }
}
