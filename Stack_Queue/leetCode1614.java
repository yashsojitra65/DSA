package Stack_Queue;

import java.util.Stack;
//07-03-2023
//1021. Remove Outermost Parentheses.
public class leetCode1614 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int count = 1;
        int n = 0;

        for(int i=0; i<c.length; i++){
            if(c[i] == '('){
                stack.push(c[i]);
                n = Math.max(n,count);
                count++;
            } else if (c[i] == ')') {
                stack.pop();
                count--;
            }
        }
        System.out.println(n);
    }
}
