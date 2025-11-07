package Recusion;
//18-08-2023
//check if a number is a prime number or not using recursion.
public class PrimeNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Prime(n, 2));
    }
    public static boolean Prime(int n, int i){
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return Prime(n, i + 1);
    }
}
