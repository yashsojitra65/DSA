package Stack_Queue;

import java.util.Stack;
//08-06-2023
//394.Decode String.
public class LeetCode394 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        Stack<Integer> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        String s1 = "";

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int count = 0;
                while (Character.isDigit(s.charAt(i))){
                    count = count * 10 + s.charAt(i) - '0';
                    i++;
                }
                i += -1;
                stack.push(count);
            }else if(s.charAt(i) == '['){
                stack1.push(s1);
                s1 = "";
            }else if(s.charAt(i) == ']'){
                StringBuilder sb = new StringBuilder(stack1.pop());
                int n = stack.pop();
                while (n-- > 0){
                    sb.append(s1);
                }
                s1 = sb.toString();
            }else {
                s1 += s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
