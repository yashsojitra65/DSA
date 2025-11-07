package Stack_Queue;

import java.util.Stack;
//10-03-2023
//232. Implement Queue using Stacks.
public class LeetCode232 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public static void main(String[] args) {
        LeetCode232 leet = new LeetCode232();

        System.out.println(leet.push(1));
        System.out.println(leet.push(2));
        System.out.println(leet.peek());
        System.out.println(leet.pop());
        System.out.println(leet.empty());
    }

    private int push(int i) {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(i);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return i;
    }
    private int peek(){
        return stack1.peek();
    }
    private int pop(){
        return stack1.pop();
    }
    private boolean empty(){
        return stack1.isEmpty();
    }
}
