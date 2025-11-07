package LeetCode;
//01-10-2023
//2873.Maximum Value of an Ordered Triplet I.
public class LeetCode2873 {
    public static void main(String[] args) {
        int[] arr = {12,6,1,2,7};
        long ans = 0;

        for (int i=0; i<arr.length-2; i++) {
            for (int j=i+1; j<arr.length-1; j++) {
                for (int k=j+1; k<arr.length; k++) {
                    long count = (long) (arr[i] - arr[j]) * (long) arr[k];
                    ans = Math.max(ans, count);
                }
            }
        }
        System.out.println(ans);
    }
}
