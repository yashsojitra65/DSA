package LeetCode;

//13-03-2023
//136. Single Number.
public class LeetCode136 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ans = 0;

        for(int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
