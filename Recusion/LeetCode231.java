package Recusion;

//09-05-2023
//231. Power of Two.
public class LeetCode231 {
    public static void main(String[] args) {
        int n = 3;
        System.out.print(power(n));
    }
    public static boolean power(int n){
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 2 != 0){
            return false;
        }
        return power(n / 2);
    }
}
