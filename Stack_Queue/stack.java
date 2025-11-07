package Stack_Queue;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        push(10,s1,s2);
        push(20,s1,s2);
        print(s1);
        pop(s1);
        print(s1);
        push(25,s1,s2);
        push(30,s1,s2);
        print(s1);
    }

    private static void print(Stack<Integer> s1) {
        System.out.println(s1);
    }

    private static int pop(Stack<Integer> stack1){return stack1.pop();}

    private static int push(int i, Stack<Integer> s1,Stack<Integer> s2) {
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(i);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return i;
    }
}
