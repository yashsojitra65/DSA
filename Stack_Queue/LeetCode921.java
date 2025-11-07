package Stack_Queue;

import java.util.Stack;

//25-04-2023
//921. Minimum Add to Make Parentheses Valid.
public class LeetCode921 {
    public static void main(String[] args) {
        String s = "())";
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty()){
                if(c == ')' && stack.peek() == '('){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }else {
                stack.push(c);
            }
        }
//        int i = 0;
//        int j = 0;
//
//        for(char c : s.toCharArray()){
//            if(c == '('){
//                i++;
//            }else {
//                if(i == 0){
//                    i++;
//                }else {
//                    i--;
//                }
//            }
//        }
//        System.out.println(i);
        System.out.print(stack.size());
    }
}
