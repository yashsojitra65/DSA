package Stack_Queue;
import java.util.*;
//02-08-2023
//Prefix to Postfix Conversion.
public class Prefix_to_postfix {
    public static void main(String[] args) {
        String s = "+-*abcd";
        Stack<String> stack = new Stack<>();

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '*'){
                String left = stack.pop();
                String right = stack.pop();
                String ans = left + right + s.charAt(i);
                stack.push(ans);
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack);
    }
}
