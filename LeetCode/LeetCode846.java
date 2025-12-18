package LeetCode;

import java.util.PriorityQueue;

//18-12-2025
//846. Hand of Straights.
public class LeetCode846 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int groupSize = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : arr) {
            pq.add(i);
        }
        while (!pq.isEmpty()) {
            int current = pq.poll();
            for (int i = 1; i < groupSize; i++) {
                if (!pq.remove(current + i)) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
