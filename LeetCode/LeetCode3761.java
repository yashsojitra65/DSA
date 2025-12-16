package LeetCode;

import java.util.*;

//16-12-2025
//3761. Minimum Absolute Distance Between Mirror Pairs.
public class LeetCode3761 {
    public static void main(String[] args) {
        int[] arr = {12, 21, 45, 33, 54};
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                ans = Math.min(ans, i - map.get(arr[i]));
            }
            int revers = revers(arr[i]);
            map.put(revers, i);
        }

//        TLE
//        for (int i = 0; i < arr.length; i++) {
//            int find = revers(arr[i]);
//            for (int j = i + 1; j < arr.length; j++) {
//                if (find == arr[j]) {
//                    ans = Math.min(ans, Math.abs(i - j));
//                    break;
//                }
//            }
//        }
        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }

    public static int revers(int num) {
        int reversNum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reversNum = reversNum * 10 + lastDigit;
            num /= 10;
        }
        return reversNum;
    }
}
