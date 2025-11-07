package LeetCode;
//26-09-2023
//1629.Slowest Key.
public class LeetCode1629 {
    public static void main(String[] args) {
        int[] arr = {9,29,49,50};
        String s = "cbcd";
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        int max = ans[0];
        char c = 'a';

        for(int i=1; i<arr.length; i++) {
            ans[i] = arr[i] - arr[i-1];
            if(max < ans[i]) {
                max = ans[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(ans[i] == max) {
                if(s.charAt(i) >= c){
                    c = s.charAt(i);
                }
            }
        }
        System.out.println(c);
    }
}
