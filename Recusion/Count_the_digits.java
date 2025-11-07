package Recusion;
//08-05-2023
//6. Count the digits of a given number using recursion.
public class Count_the_digits {
    public static void main(String[] args) {
        int n = 7854;
//        int count = 0;
        System.out.println(digit(n));
    }
    public static int digit(int n){
        if(n == 0){
            return 0;
        }
        //n = n/10;
       return  1 + digit(n/10);
    }
}
