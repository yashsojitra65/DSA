package Math;

//23-02-2023
//1281. Subtract the Product and Sum of Digits of an Integer.
public class leetCode1281 {
    public static void main(String[] args) {
        int n = 234;

        int pro = 1;
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            pro = pro * digit;
            sum = sum + digit;
            n = n/10;
        }
        System.out.print(pro - sum);
    }
}
