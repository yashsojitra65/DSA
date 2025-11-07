package Stack_Queue;
import java.util.*;
//04-06-2023
//1047.Remove All Adjacent Duplicates In String.
public class LeetCode1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek() == s.charAt(i)){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack);

        StringBuilder sb = new StringBuilder();
        for (char c : stack){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
//    String s = "abbaca";
//    int k = -1;
//    byte[] Byte = s.getBytes();
//    byte[] sb = new byte[Byte.length];
//        System.out.println(Byte);
//
//                for (int i = 0; i < Byte.length; i++) {
//        if (k >= 0 && sb[k] == Byte[i])
//        {
//        k--;
//        }
//        else
//        {
//        sb[++k] = Byte[i];
//        }
//        }
//        System.out.println(new String(sb, 0, k+1));