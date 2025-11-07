package HashTable;
import java.util.*;
//20-08-2023
//2829.Determine the Minimum Sum of a k-avoiding Array.
public class LeetCode2829 {
    public static void main(String[] args) {
        int n = 5;
        int k = 4;
        int sum = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 1; set.size() < n; i++) {
            int ans = k - i;
            if (!set.contains(ans)) {
                sum += i;
                set.add(i);
            }
        }
        System.out.println(sum);
    }
}
