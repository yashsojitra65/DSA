package LeetCode;
//13-10-2023
//746.Min Cost Climbing Stairs.
public class LeetCode746 {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};

        for (int i = 2; i < cost.length; i++){
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        System.out.println(Math.min(cost[cost.length - 1], cost[cost.length - 2]));
    }
}
