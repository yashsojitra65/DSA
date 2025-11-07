package Stack_Queue;
import java.util.*;
//23-07-2023
//1190.Reverse Substrings Between Each Pair of Parentheses.
public class LeetCode1190 {
    public static void main(String[] args) {
        String s = "(u(love)i)";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c != ')') {
                stack.push(c);
            }else {
                StringBuilder sb = new StringBuilder();
                while (stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
                for (int j = 0; j < sb.length(); j++) {
                    stack.push(sb.charAt(j));
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        System.out.println(ans.reverse());
    }
}
