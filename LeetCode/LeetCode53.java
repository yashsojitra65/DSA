package LeetCode;
//17-08-2023
//53.Maximum Subarray.
public class LeetCode53 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0){
                start = i;
            }
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.print("The subarray is: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(maxi);
    }
}
