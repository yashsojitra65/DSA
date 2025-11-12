package LeetCode;
import java.util.*;
//12-11-2025
//2177. Find Three Consecutive Integers That Sum to a Given Number
public class LeetCode2177 {
    public static void main(String[] args) {
        int n = 33;
        long[] arr;

        if (n % 3 != 0) {
            arr = new long[]{};
            return;
        }
        long r = (n / 3);
        arr = new long[]{r - 1, r, r + 1};

        System.out.println(Arrays.toString(arr));
    }
}
