package Math;

import java.math.*;
import java.util.Arrays;

//07-06-2023
//67.Add Binary.
public class LeetCode67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        BigInteger number1 = new BigInteger(a,2);
        BigInteger number2 = new BigInteger(b,2);

        BigInteger sum = number1.add(number2);
        System.out.println(sum.toString(2));
    }
}
