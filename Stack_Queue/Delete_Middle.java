package Stack_Queue;
import java.util.*;
//03-08-2023
//Delete middle element of a stack.
public class Delete_Middle {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int n = stack.size();
        for (int i=1; i<=n/2; i++){
            stack1.push(stack.pop());
        }
        stack.pop();
        n = stack1.size();
        for (int i=0; i<n; i++){
            stack.push(stack1.pop());
        }
        System.out.println(stack);
    }
}
