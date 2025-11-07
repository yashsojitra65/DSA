package LeetCode;

//02-02-2023
//build array from permutation
public class LeetCode1920 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int n = arr.length;
        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            ans[i] = arr[arr[i]];
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

