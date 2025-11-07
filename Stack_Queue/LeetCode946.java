package Stack_Queue;

import java.util.Stack;

//13-04-2023
//946. Validate Stack Sequences.
public class LeetCode946 {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        Stack<Integer> stack = new Stack<>();

        int i = 0;

        for(int k : pushed){
            stack.push(k);

            while (!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        System.out.println(stack.isEmpty());
    }
}
