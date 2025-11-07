package LeetCode;
//20-10-2023
//122.Best Time to Buy and Sell Stock II.
public class LeetCode122 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = 0;

        for(int i=1; i<prices.length; i++){
            if (prices[i - 1] < prices[i]) {
                ans += prices[i] - prices[i - 1];
            }
        }
        System.out.println(ans);
    }
}
