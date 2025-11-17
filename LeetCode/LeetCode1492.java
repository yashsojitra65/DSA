package LeetCode;

import java.util.*;

//17-11-2025
//1492. The kth Factor of n.
public class LeetCode1492 {
    public static void main(String[] args) {
        int n = 12;
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        if (list.size() < k) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(k - 1));
        }
    }
}
