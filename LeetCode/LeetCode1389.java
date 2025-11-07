package LeetCode;

//06-02-2023
//1389. Create Target Array in the Given Order
public class LeetCode1389 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4};
        int n = arr.length;
        int index[] = {0,1,2,2,1};
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            for(int j=i; j>index[i]; j--){
                ans[j] = ans[j-1];
            }
            ans[index[i]] = arr[i];
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
