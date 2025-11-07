package Stack_Queue;
import java.util.*;
//03-09-2023
//856.Score of Parentheses.
public class LeetCode856 {
    public static void main(String[] args) {
        String s = "()()";
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(0);
            }else {
                int i = stack.pop();
                int j = stack.pop();
                stack.push(j + Math.max(2 * i,1));
            }
        }
        System.out.println(stack.pop());
    }
}
