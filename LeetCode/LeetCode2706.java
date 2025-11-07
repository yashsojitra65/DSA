package LeetCode;
import java.util.*;
//20-09-2023
//2706.Buy Two Chocolates.
public class LeetCode2706 {
    public static void main(String[] args) {
        int[] prices = {3,2,3};
        int money = 3;
        Arrays.sort(prices);
        Arrays.sort(prices);
        if(prices[0] + prices[1] > money){
            System.out.println(money);
        }else{
            System.out.println(money - (prices[0] + prices[1]));
        }
    }
}
