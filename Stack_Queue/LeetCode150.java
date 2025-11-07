package Stack_Queue;
import java.util.*;
//26-07-2023
//150.Evaluate Reverse Polish Notation

public class LeetCode150 {
    public static void main(String[] args) {
        String[] arr = {"4","13","5","/","+"};
        Stack<String> stack = new Stack<>();

        for(int i=0; i< arr.length; i++){
            String s = arr[i];
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(helper(b,a,s)));
            }else {
                stack.push(s);
            }
        }
        System.out.println(Integer.parseInt(stack.peek()));
    }
    public static int helper(int a,int b,String symbols){
        if(symbols.equals("+")){
            return a+b;
        } else if (symbols.equals("-")) {
            return a-b;
        } else if (symbols.equals("/")) {
            return a/b;
        }else {
            return a * b;
        }
    }
}
