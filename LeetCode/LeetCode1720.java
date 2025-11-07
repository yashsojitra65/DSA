package LeetCode;

//04-02-2023
//1720. Decode XORed Array
public class LeetCode1720 {
    public static void main(String[] args) {
        int arr[] = {6,2,7,3};
        int n = arr.length;
        int ans[] = new int[n+1];
        int first = 4;
        ans[0] = first;

        for(int i=0; i<n; i++){
            int j = ans[i] ^ arr[i];
            ans[i + 1] = j;
        }

        for(int i=0; i<=n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
