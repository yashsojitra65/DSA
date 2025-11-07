package LeetCode;
//12-10-2023
//1876.Substrings of Size Three with Distinct Characters.
public class LeetCode1876 {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int count = 0;

        for (int i = 2; i < s.length(); i++) {
            char current = s.charAt(i);
            char prev1 = s.charAt(i - 1);
            char prev2 = s.charAt(i - 2);

            if (current != prev1 && current != prev2 && prev1 != prev2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
