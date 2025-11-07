package Recusion;

//09-05-2023
//342. Power of Four.
public class LeetCode342 {
    public static void main(String[] args) {
        int n = 16;
        System.out.print(power(n));
    }
    public static boolean power(int n){
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 4 != 0){
            return false;
        }
        return power(n / 4);
    }
}
