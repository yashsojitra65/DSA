package LeetCode;
import java.util.HashMap;

public class LeetCode2815 {
    public static void main(String[] args) {
        int[] arr = {51,71,17,24,42};
        int max = -1;
        int[] ans = new int[arr.length];

//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], helper(arr[i]));
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (map.get(arr[i]).equals(map.get(arr[j]))) {
//                    max = Math.max(max, arr[i] + arr[j]);
//                }
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = helper(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (ans[i] == ans[j]) {
                    max = Math.max(max, arr[i] + arr[j]);
                }
            }
        }

        System.out.println(max);
    }
    public static int helper(int num) {
        int n = 0;
        while (num > 0) {
            n = Math.max(n, num % 10);
            num /= 10;
        }
        return n;
    }
}
