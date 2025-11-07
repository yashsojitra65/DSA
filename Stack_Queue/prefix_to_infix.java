package Stack_Queue;
import java.util.*;
//02-08-2023
//Prefix to Infix Conversion.
public class prefix_to_infix {
    public static void main(String[] args) {
        String s = "*+-abcd";
        Stack<String> stack = new Stack<>();

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '*'){
                String left = stack.pop();
                String right = stack.pop();
                String ans = '(' + left + s.charAt(i) + right + ')';
                stack.push(ans);
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack);
    }
}
