package LeetCode;

import java.util.Stack;
//1-03-2023
//20. Valid Parentheses.
public class LeetCode20 {
    public static void main(String[] args) {
        String s = "({}]]";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == '}' && !stack.empty() && stack.peek()== '{'){
                    stack.pop();
                }
                else if(s.charAt(i) == ']' && !stack.empty() && stack.peek()== '['){
                    stack.pop();
                }
                else if(s.charAt(i) == ')' && !stack.empty() && stack.peek()== '('){
                    stack.pop();
                }
                else{
                    System.out.println("Not balanced");
                    return;
                }
            }
        }
        System.out.println("Balanced");
    }
}
