package Stack_Queue;
import java.util.*;
//03-08-2023
//Evaluation of Postfix Expression.
public class Evaluation_ot_Postfix {
    public static void main(String[] args) {
        String s = "63*";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/') {
                String left = stack.pop();
                String right = stack.pop();
                int one = Integer.parseInt(left);
                int two = Integer.parseInt(right);
                int ans = 0;
                if (s.charAt(i)=='+'){
                    ans  = two + one;
                } else if (s.charAt(i)=='-') {
                    ans = two - one;
                }else if (s.charAt(i)=='*'){
                    ans = two * one;
                }else {
                    ans = two / one;
                }
                stack.push(String.valueOf(ans));
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
