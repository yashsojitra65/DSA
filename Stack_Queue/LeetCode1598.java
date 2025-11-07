package Stack_Queue;
import java.util.*;
//23-07-2023
//1598.Crawler Log Folder.
public class LeetCode1598 {
    public static void main(String[] args) {
        String[] s = {"d1/","d2/","./","d3/","../","d31/"};

        Stack<Integer> stack = new Stack<>();
        for(String i: s){
            if(!i.equals("./") && !i.equals("../")){
                stack.push(1);
            }else if(!stack.isEmpty() && i.equals("../") ){
                stack.pop();
            }
        }
        System.out.println(stack.size());
    }
}
