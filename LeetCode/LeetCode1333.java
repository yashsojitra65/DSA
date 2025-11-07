package LeetCode;

//03-03-2023
//1332. Remove Palindromic Subsequences.
public class LeetCode1333 {
    public static void main(String[] args) {
        String s = "abba";
        int left = 0;
        int right = s.length() - 1;
        int count = 0;
        count = Palindromic(s, left, right);

        System.out.println(count);
    }
    private static int Palindromic(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2;
            }
            left++;
            right--;
        }
        return 1;
    }
}
