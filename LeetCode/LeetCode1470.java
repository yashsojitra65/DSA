package LeetCode;

//03-02-2023
//1470. Shuffle the Array
public class LeetCode1470 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = arr.length;
        int[] ans = new int[n];
        int k = 0;
        int x = 0;
        int y = 1;

        for(int i=0; i<n; i++){
            if(x<n){
                ans[x] = arr[i];
                x = x + 2;
                k=i;
            }
        }
        for(int i=k+1; i<n; i++){
            if(y<n){
                ans[y] = arr[i];
                y = y+2;
            }
        }

        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
