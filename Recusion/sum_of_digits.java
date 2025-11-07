package Recusion;
//18-08-2023
//find the sum of digits of a number using recursion.
public class sum_of_digits {
    static int sum = 0;
    public static void main(String[] args) {
        int x = 12345;
        sum(x);
        System.out.println(sum);
    }
    public static void sum(int x){
        if(x == 0){
            return;
        }
        int i = x % 10;
        sum += i;
        x /= 10;
        sum(x);
    }
}
