package Stack_Queue;

import java.util.*;
//05-06-2023
//2696.Minimum String Length After Removing Substrings.
public class LeetCode2696 {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && ((stack.peek() == 'A' && c == 'B') || (stack.peek() == 'C' && c == 'D'))){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        System.out.println(stack);
    }
}
