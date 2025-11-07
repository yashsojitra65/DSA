package Recusion;

public class LeetCode202 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(number(n));
    }
    public static boolean number(int n){
        if(n == 1|| n==7){
            return true;
        }if(n<10){
            return false;
        }
        int ans=0;
        while (n!=0){
            ans += (n%10) * (n%10);
            n/=10;
        }
        return number(ans);
    }
}
