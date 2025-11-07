package Math;
import java.util.*;
//26-08-2023
//728.Self Dividing Numbers.
public class LeetCode728 {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> ans = new ArrayList();

        for (int i=left; i<=right; i++) {
            if (helper(i)) {
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
    public static boolean helper(int n) {
        int num = n;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
