package LeetCode;

public class LeetCode1493 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1};

        int ans = 0;
        int prev = 0;
        int curr = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                curr++;
            }else {
                ans = Math.max(ans,prev+curr);
                prev = curr;
                curr = 0;
            }
        }
        ans = Math.max(ans,prev+curr);

        System.out.print(ans);
    }
}
