package Stack_Queue;

import java.util.*;
//06-07-2023
//503. Next Greater Element II.
public class LeetCode503 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];

        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[stack.peek()] < arr[i]) {
                ans[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            while (arr[stack.peek()] < arr[i]) {
                ans[stack.peek()] = arr[i];
                stack.pop();
            }
        }
        while (stack.size() > 0) {
            ans[stack.peek()] = -1;
            stack.pop();
        }
        System.out.println(Arrays.toString(ans));
    }
}
//    Deque<Integer> stack = new ArrayDeque<>();
//        for (int i = 0; i < arr.length * 2; i++) {
//            int index = i % arr.length;
//            while (!stack.isEmpty() && arr[index] > arr[stack.peek()]) {
//                ans[stack.pop()] = arr[index];
//            }
//            if (i < arr.length) {
//                stack.push(i);
//            }
//        }
//        while(!stack.isEmpty()) {
//            ans[stack.pop()] = -1;
//        }
