package Stack_Queue;
import java.util.*;
//02-08-2023
//Postfix to Infix Conversion.
public class Postfix_to_Infix {
    public static void main(String[] args) {
        String s = "abcd-+*";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '*') {
                String right = stack.pop();
                String left = stack.pop();
                String ans = "(" + left + s.charAt(i) + right + ")";
                stack.push(ans);
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack);
    }
}
