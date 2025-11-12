package LeetCode;
import java.util.*;
//12-11-2025
//128. Longest Consecutive Sequence.
public class LeetCode128 {
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        HashSet<Integer> set = new HashSet<>();

        if (arr.length == 0) {
            return;
        }
        for (int i : arr) {
            set.add(i);
        }

        int count = 1;

        for (int i : arr) {
            if (set.remove(i)) {
                int num = i;
                int sum = 1;
                while (set.remove(num - 1)) {
                    num--;
                }

                sum += i - num;
                num = i;

                while (set.remove(num + 1)) {
                    num++;
                }

                sum += num - i;
                count = Math.max(count, sum);
            }
        }
        System.out.println(count);
    }
}
