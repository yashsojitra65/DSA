package LeetCode;

public class LeetCode1636 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int[] ans = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            ans[i] = 1;
            for(int j=i+1; j< arr.length;j++){
                if(arr[i] == arr[j]){
                    ans[i]++;
                    ans[i+1] = 0;
                }
            }
        }
        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
