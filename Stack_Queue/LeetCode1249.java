package Stack_Queue;

import java.util.*;
//09-06-2023
//1249.Minimum Remove to Make Valid Parentheses.
public class LeetCode1249 {
    public static void main(String[] args) {
        String s = "))((";
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if(stack.size() > 0 && s.charAt(stack.peek()) == '('){
                    stack.pop();
                }else {
                    stack.push(i);
                }
            }
        }
        while (stack.size() > 0){
            sb.deleteCharAt(stack.pop());
        }
        System.out.println(sb);

//        String ans = "";
//        Stack<Character> stack = new Stack<>();
////        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        boolean flag = true;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
//                flag = true;
//            }else {
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println(ans);
//            return;
//        }else {
//            for (int i = 0; i < s.length(); i++) {
//                if (stack.isEmpty() || s.charAt(i) == '(') {
//                    stack.push(s.charAt(i));
//                    sb.append(s.charAt(i));
//                } else if (s.charAt(i) == ')') {
//                    if (stack.peek() == '(') {
//                        stack.pop();
//                        sb.append(s.charAt(i));
//                    }
//                } else{
//                    sb.append(s.charAt(i));
//                }
//            }
//        }
//        ans = sb.toString();
//        System.out.println(ans);
    }
}
