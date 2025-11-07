package LeetCode;

//07-02-2023
//1528. Shuffle String.
public class LeetCode1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        int n = s.length();
        char c[] = new char[n];
        for(int i=0; i<n; i++){
            c[arr[i]] = s.charAt(i);
        }
        s = new String(c);
        System.out.println(s);
    }
}
