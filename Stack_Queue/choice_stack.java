package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class choice_stack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("1.push \n2.pop \n3.print \n4.is Empty \n5.Exit \n Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1 -> {
                    System.out.print("Enter Value: ");
                    int value = sc.nextInt();
                    System.out.println(push(value,stack1));
                }
                case 2 -> {
                    if(stack1.isEmpty()){
                        System.out.println("No empty.");
                    }else {
                        System.out.println(pop(stack1,stack2));
                    }
                }
                case 3 -> {
                    if(stack1.isEmpty()){
                        System.out.println("no empty.");
                    }else{
                        System.out.print(print(stack1));
                    }
                }
                case 4 -> {
                    System.out.println(stack1.isEmpty());
                }
                case 5 -> System.exit(1);
            }
        }
    }
    private static int pop(Stack<Integer> s1, Stack<Integer> s2){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int temp = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return temp;
    }
    private static int print(Stack<Integer> s1){
        System.out.println(s1);
        return 0;
    }
    private static int push(int value, Stack<Integer> s1){
        return s1.push(value);
    }
}
