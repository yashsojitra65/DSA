package LeetCode;

//27-02-2023
//1475. Final Prices With a Special Discount in a Shop..
public class LeetCode1475 {
    public static void main(String[] args) {
        int[] prices = {10,1,1,6};
        int[] ans = new int[prices.length];

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    ans[i] = prices[i] - prices[j];
                    break;
                }else {
                    ans[i] = prices[i];
                }
            }
        }
        ans[prices.length-1]=prices[prices.length-1];
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

