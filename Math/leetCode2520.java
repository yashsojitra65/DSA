package Math;

//23-02-2023
//2520. Count the Digits That Divide a Number.
public class leetCode2520 {
    public static void main(String[] args) {
        int n = 121;
        int a=n, c=0;
        while(n>0) {
            if (a % (n % 10) == 0) {
                c++;
            }
            n /= 10;
        }
        System.out.println(c);
    }
}
