package Recusion;

public class fibonacci{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int number1 = fib(n-1);
        int number2 = fib(n-2);
        int ans = number1 + number2;

        return ans;
    }
}
