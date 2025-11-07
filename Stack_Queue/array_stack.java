package Stack_Queue;

public class array_stack {
    public static void main(String[] args) {
        int[] Stack = new int[5];
        int n = Stack.length;
        int top = -1;
        top = isPush(Stack, top, 5);
        top = isPush(Stack, top, 12);
        top = isPush(Stack, top, 15);
        top = isPush(Stack, top, 20);
        top = isPush(Stack, top, 25);

        isDisplay(Stack, top);
        System.out.println();
        isPeek(Stack, top);
        top=isPop(Stack, top, 25);
        isDisplay(Stack, top);
    }
    private static void isPeek(int[] Stack, int top) {
        if (top == -1) {
            System.out.println("Full");
        } else {
            System.out.println("peek element is:" + Stack[top]);
        }
    }
    private static int isPop(int[] Stack, int top, int value) {
        if (top == -1) {
            System.out.println("full");
        } else {
            for (int i = top; i >= 0; i--) {
                if (Stack[i] != value) {
                    System.out.println("Delete value:" + Stack[i]);
                    top--;
                } else if (Stack[i] == value) {
                    System.out.println("Delete value: " + Stack[i]);
                    top--;
                    return top;
                }
            }
        }
        return 0;
    }
    private static void isDisplay(int[] Stack,int top){
        if(top == -1){
            System.out.println("Empty");
        }else {
            for (int i = top; i >= 0; i--) {
                System.out.print(Stack[i] + " ");
            }
        }
    }
    private static int isPush(int[] Stack, int top,int ans){
        if(top == Stack.length-1){
            System.out.println("full");
        }else{
            top++;
            Stack[top] = ans;
        }
        return top;
    }
}

