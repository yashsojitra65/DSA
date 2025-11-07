package Recusion;
//08-05-2023
//7. reverse an integer number using recursion.
public class reverse_Number {
    public static void main(String[] args) {
        int n = 123456;
        revers(n);
    }
    public static void revers(int n){
        if(n == 0){
            return;
        }
        System.out.print(n % 10);
        revers(n / 10);
    }
}
