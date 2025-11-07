package Stack_Queue;
import java.util.*;
//25-11-2023
//1561.Maximum Number of Coins You Can Get.
public class LeetCode1561 {
    public static void main(String[] args) {
        int[] piles = {2, 4, 1, 2, 7, 8};

        Arrays.sort(piles);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : piles) {
            deque.addLast(num);
        }

        int ans = 0;
        while (!deque.isEmpty()) {
            deque.removeLast();
            ans += deque.removeLast();
            deque.removeFirst();
        }

        System.out.println(ans);
    }
}
