package Stack_Queue;

import java.util.*;
//04-06-2023
//844.Backspace String Compare.
public class LeetCode844 {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char c : s.toCharArray()){
            if(c != '#'){
                stack1.push(c);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }
        for(char c : t.toCharArray()){
            if(c != '#'){
                stack2.push(c);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }
        System.out.println(stack1);
        System.out.println(stack2);

        System.out.println(stack1.equals(stack2));
    }
}
