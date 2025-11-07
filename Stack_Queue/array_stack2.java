package Stack_Queue;

public class array_stack2 {
    public static void main(String[] args) {
        String s = "()";
        char[] stack = new char[s.length()];
        int top = -1;

        for(int i=0; i<s.length(); i++){
            char Char = s.charAt(i);
            if(Char == '(' || Char == '{' || Char == '[') {
                top = push(stack, top, Char);
            }else {
                if(top == -1){
                    System.out.println("Not Balanced");
                    return;
                }
                char peek = peek(stack,top);
                if((Char == '}' && peek == '{') || (Char == ']' && peek == '[') || (Char == ')' && peek == '(')){
                    top = pop(stack,top);
                }else {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if(isEmpty(top)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }

    private static boolean isEmpty(int top) {
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }

    private static int pop(char[] stack, int top) {
        top--;
        return top;
    }

    private static char peek(char[] stack, int top) {
        return stack[top];
    }

    private static int push(char[] stack, int top, char aChar) {
        stack[++top] = aChar;
        return top;
    }
}
