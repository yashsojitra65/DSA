package LeetCode;
import java.util.*;
//18-11-2025
//2195. Append K Integers With Minimal Sum
public class LeetCode2195 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 25, 10, 25};
        Arrays.sort(arr);
        int k = 2;
        int sum1 = 0;
        int sum2 = 0;
        int index = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            sum1 += i;
            set.add(i);
        }

        for (int i = 1; index != k; i++) {
            if (!set.contains(i)) {
                sum2 += i;
                index++;
            }
        }
        sum1 += sum2;
        System.out.println(Math.min(sum1, sum2));

//        long sum = 0;
//
//        for (int i : arr) {
//            if (!set.contains(i) && i <= k) {
//                k++;
//                sum += i;
//            }
//            set.add(i);
//        }
//
//        long res = (long) (1 + k) * k / 2 - sum;
//        System.out.println(res);
    }
}
