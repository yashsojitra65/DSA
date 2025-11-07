package Recusion;

import java.util.*;
//10-06-2023
//1823.Find the Winner of the Circular Game.
public class LeetCode1823 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.print(lastRemaining(n, k) + 1);
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 1; i <= n; i++) {
//            queue.add(i);
//        }
//        System.out.println(queue);
//        while (queue.size() != 1){
//            for(int i=1; i<=k; i++){
//                queue.add(queue.poll());
//            }
//            queue.poll();
//        }
//        System.out.println(queue.poll());
    }
    public static int lastRemaining(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (lastRemaining(n - 1, k) + k) % n;
    }
}