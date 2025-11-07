package Math;
//22-09-2023
//2433.Find The Original Array of Prefix Xor.
public class LeetCode2433 {
    public static void main(String[] args) {
        int[] pref = {5,2,0,3,1};
        int[] ans = new int[pref.length];
        ans[0] = pref[0];

        for(int i=1; i< pref.length; i++){
            ans[i] = pref[i] ^ pref[i - 1];
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
