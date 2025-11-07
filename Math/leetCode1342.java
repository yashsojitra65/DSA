package Math;

//23-02-2023
//1342. Number of Steps to Reduce a Number to Zero.
public class leetCode1342 {
    public static void main(String[] args) {
        int n = 14;
        int value = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
            }
            value++;
        }
        System.out.println(value);
    }
}
