package Stack_Queue;
import java.util.*;
//02-08-2023
//Reverse individual words using stack.
public class Reverse_words {
    public static void main(String[] args) {
        String s = "How are you yash";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
