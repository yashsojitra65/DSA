package LeetCode;
//08-10-2023
//2894. Divisible and Non-divisible Sums Difference
public class LeetCode2894 {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        int divisible = 0;
        int noDivisible = 0;

        for(int i=1; i<=n; i++){
            if(i % m != 0){
                noDivisible += i;
            }else {
                divisible += i;
            }
        }
        System.out.println(noDivisible - divisible);
    }
}
