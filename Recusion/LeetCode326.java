package Recusion;

//09-05-2023
//326. Power of Three.
public class LeetCode326 {
    public static void main(String[] args) {
        int n = -1;
        System.out.println(power(n));
    }
    public static boolean power(int n){
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 3 != 0){
            return false;
        }
        return power(n / 3);
    }
}
