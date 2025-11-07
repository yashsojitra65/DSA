package LeetCode;

//03-02-2023
//1431. Kids With the Greatest Number of Candies
public class LeetCode1431 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int n = arr.length;
        int extra = 3;
        boolean[] ans = new boolean[n];

        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            ans[i] = arr[i] + extra >= max;
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
