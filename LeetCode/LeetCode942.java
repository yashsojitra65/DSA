package LeetCode;

//22-02-2023
//942. DI String Match.
public class LeetCode942 {
    public static void main(String[] args) {
        String s = "IDID";
        int n = s.length();
        int[] ans = new int[n+1];

        int start = 0;
        int end = n;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'I'){
                ans[i] = start++;
            }else {
                ans[i] = end--;
            }
        }
        ans[n] = start;
        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
