package Stack_Queue;
import java.util.Stack;
//02-08-2023
//Find min in O(1) from stack.
public class MinStack {
    static int min = Integer.MAX_VALUE;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        push(10);
        push(20);
        pop();
        push(45);
        push(5);
        pop();
        System.out.println(getMin());
    }
    public static void push(int val) {
        if(val <= min){
            stack.add(min);
            min = val;
        }
        stack.add(val);
    }

    public static void pop() {
        if(stack.pop() == min){
            min = stack.pop();
        }
    }

    public static int top() {
        return stack.peek();
    }

    public static int getMin() {
        return min;
    }
}
