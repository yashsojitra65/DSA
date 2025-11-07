package Math;

import java.math.*;
//07-06-2023
//43.Multiply Strings.
public class LeetCode43 {
    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";

        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);


        BigInteger multiply = big1.multiply(big2);
        String ans = multiply.toString();

        System.out.println(ans);
    }
}
