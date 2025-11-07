package LeetCode;
//09-08-2023
//1780.Check if Number is a Sum of Powers of Three.
public class LeetCode1780 {
    public static void main(String[] args) {
        int n = 0;

        while (n != 0) {
            if (n % 3 == 2) {
                System.out.println(false);
                return;
            }
            n = n / 3;
        }
        System.out.println(true);
    }
}
