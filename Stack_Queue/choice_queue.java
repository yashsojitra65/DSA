package Stack_Queue;

import java.util.*;
public class choice_queue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1. Push \n2. Pop \n3. Top \n4.print \n5. Is Empty? \n6. Exit \n Enter Your Choice :");
            int choice =  sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Element : ");
                    int val = sc.nextInt();
                    System.out.println(push(val, q1, q2));
                }
                case 2 -> {
                    if (q1.isEmpty()){
                        System.out.println("No element present in queue.");
                    } else{
                        System.out.println(q1.poll());
                    }
                }
                case 3 -> {
                    if (q1.isEmpty()){
                        System.out.println("No element present in queue.");
                    } else{
                        System.out.println(q1.peek());
                    }
                }
                case 4 -> {
                    if(q1.isEmpty()){
                        System.out.println("No element present in queue.");
                    }else {
                        System.out.println(print(q1));
                    }
                }
                case 5 ->{
                    System.out.println(q1.isEmpty());
                }
                case 6 -> System.exit(1);
            }
        }
    }
    private static int print(Queue<Integer> q1){
        System.out.println(q1);
        return 0;
    }

    private static String push(int val, Queue<Integer> q1, Queue<Integer> q2) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(val);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        return val + " is inserted";
    }
}