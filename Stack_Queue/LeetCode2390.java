package Stack_Queue;

import java.util.Stack;
//04-06-2023
//2390.Removing Stars From a String.
public class LeetCode2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
