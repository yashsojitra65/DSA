package BinarySearch;
//12-06-2023
//1802.Maximum Value at a Given Index in a Bounded Array.
public class LeetCode1802 {
    public static void main(String[] args) {
        int n = 4;
        int index = 2;
        int maxSum = 6;

        System.out.print(maxValue(n,index,maxSum));
    }
    public static int maxValue(int n, int index, int maxSum) {
        int left = 0, right = maxSum - n;

        while (left < right) {
            int middle = (left + right + 1) / 2;
            if (isPossible(n, index, maxSum - n, middle))
                left = middle;
            else
                right = middle - 1;
        }
        return left + 1;
    }

    private static boolean isPossible(int n, int index, int maxSum, int value) {
        int leftValue = Math.max(value - index, 0);
        int rightValue = Math.max(value - ((n - 1) - index), 0);

        long sumBefore = (long) (value + leftValue) * (value - leftValue + 1) / 2;
        long sumAfter = (long) (value + rightValue) * (value - rightValue + 1) / 2;

        return sumBefore + sumAfter - value <= maxSum;
    }
}
