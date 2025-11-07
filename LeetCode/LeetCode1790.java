package LeetCode;

//15-04-2023
//1790. Check if One String Swap Can Make Strings Equal.
public class LeetCode1790 {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";

        int left = 0;
        int right = s1.length() - 1;
        boolean wasSwap = false;

        while (left <= right) {
            if (s1.charAt(left) == s2.charAt(left)) {
                left++;
                continue;
            }
            if (s1.charAt(right) == s2.charAt(right)) {
                right--;
                continue;
            }
            if (wasSwap) {
                System.out.println(false);
                return;
            }
            if (s1.charAt(left) == s2.charAt(right) && s1.charAt(right) == s2.charAt(left)) {
                wasSwap = true;
                left++;
                right--;
                continue;
            }
            System.out.println(false);
            return;
        }
        System.out.println(true);
    }
}
