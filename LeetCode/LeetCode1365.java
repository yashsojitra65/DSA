package LeetCode;

//04-02-2023
//1365. How Many Numbers Are Smaller Than the Current Number
public class LeetCode1365 {
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        int n = arr.length;
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                if(arr[j] < arr[i]){
                    sum++;
                }
            }
            ans[i] = sum;
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
