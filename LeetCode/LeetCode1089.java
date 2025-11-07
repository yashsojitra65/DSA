package LeetCode;

//18-07-2023
//1089.Duplicate Zeros.
public class LeetCode1089 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        int i = 0;
        int j = 0;
        int[] ans = new int[arr.length];

        while (i < arr.length && j < arr.length){
            if(arr[i]==0){
                if(j+1 < ans.length){
                    ans[j+1] = 0;
                }
                j += 2;
                i++;
            }
            else{
                ans[j] = arr[i];
                j++;
                i++;
            }
        }
        for(int k : ans){
            System.out.print(k + " ");
        }
    }
}
