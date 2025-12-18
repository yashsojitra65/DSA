package LeetCode;

import java.util.PriorityQueue;

//18-12-2025
//1296. Divide Array in Sets of K Consecutive Numbers.
public class LeetCode1296 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 6};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : arr) {
            pq.add(i);
        }
        while (!pq.isEmpty()) {
            int current = pq.poll();
            for (int i = 1; i < k; i++) {
                if (!pq.remove(current + i)) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
