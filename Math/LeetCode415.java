package Math;

import java.math.*;
//06-06-2023
//415.Add Strings.
public class LeetCode415 {
    public static void main(String[] args) {
        String num1 = "3876620623801494171";
        String num2 = "6529364523802684779";

        BigDecimal number1 = new BigDecimal(num1);
        BigDecimal number2 = new BigDecimal(num2);

        BigDecimal sum = number1.add(number2);
        String ans = sum.toString();
        System.out.println(ans);

//        long n1 = Long.parseLong(num1);
//        long n2 = Long.parseLong(num2);
//
//        String ans = String.valueOf(n1 + n2);
//        System.out.println(ans);
//    }
    }
}
