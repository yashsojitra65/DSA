package Stack_Queue;
import java.util.*;
//05-08-2023
//1111.Maximum Nesting Depth of Two Valid Parentheses Strings.
public class LeetCode1111 {
    public static void main(String[] args) {
        String s = "(()())";
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int[] ans = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(stack1.size() <= stack2.size()){
                    stack1.push('(');
                    ans[i] = 0;
                }else{
                    stack2.push('(');
                    ans[i] = 1;
                }
            }else{
                if(!stack1.isEmpty() && stack1.peek() == '('){
                    stack1.pop();
                    ans[i] = 0;
                }else{
                    stack2.pop();
                    ans[i] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
