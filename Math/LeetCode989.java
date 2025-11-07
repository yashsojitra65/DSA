package Math;

import java.math.BigInteger;
import java.util.*;
//07-06-2023
//989.Add to Array-Form of Integer.
public class LeetCode989 {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> list = new ArrayList<>();


        BigInteger big = BigInteger.ZERO;
        for (int i = 0; i < num.length; i++) {
            big = big.multiply(BigInteger.TEN).add(BigInteger.valueOf(num[i]));
        }

        BigInteger ans = big.add(BigInteger.valueOf(k));

        String s1 = ans.toString();
        for (int i = 0; i < s1.length(); i++) {
            int number = Character.getNumericValue(s1.charAt(i));
            list.add(number);
        }
        System.out.println(list);
    }
}
