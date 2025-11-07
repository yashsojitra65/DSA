package Stack_Queue;

public class array_queue {
    public static void main(String[] args) {
        int size = 5;
        int[] queue = new int[size];
        int front = -1;
        int rear = -1;

        front = enqueue(queue,front,rear,10);
        front = enqueue(queue,front,rear,20);
        front = enqueue(queue,front,rear,30);

        print(queue,front,rear);
        System.out.println();
        rear = dequeue(queue,front,rear);
        rear = dequeue(queue,front,rear);
        print(queue,front,rear);

    }
    private static int enqueue(int[] queue,int front,int rear,int value){
        if(front == queue.length - 1){
            System.out.println("Queue is full!!");
            return front;
        }
        queue[++front] = value;
        return front;
    }

    private static void print(int[] queue,int front,int rear){
        if(front == -1){
            System.out.println("Queue is empty");
        }
        rear++;
        for(int i=rear; i<=front; i++){
            System.out.print(queue[i] + " ");
        }
    }

    private static int dequeue(int[] queue,int front,int rear){
        if(rear == front){
            System.out.println("Queue empty!");
            return front;
        }

        System.out.println(queue[++rear] + " is deleted");
        return rear;
    }
}
