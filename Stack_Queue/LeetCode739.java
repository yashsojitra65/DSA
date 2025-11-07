package Stack_Queue;
import java.util.*;
//24-07-2023
//739.Daily Temperatures.
public class LeetCode739 {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] ans = new int[arr.length];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            while (!deque.isEmpty() && arr[deque.peek()] < n) {
                int j = deque.pop();
                ans[j] = i - j;
            }
            deque.push(i);
        }

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
