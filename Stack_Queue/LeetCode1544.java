package Stack_Queue;

import java.util.Stack;
//04-06-2023
//1544.Make The String Great.
public class LeetCode1544{
    public static void main(String[] args) {
        String s = "leEeetcode";
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(!stack.isEmpty() && Math.abs(stack.peek() - c) == 32)
            {
                stack.pop();
            }
            else
            {
                stack.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(stack.size() > 0)
        {
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse());
    }
}
