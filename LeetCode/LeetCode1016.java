package LeetCode;
//09-08-2023
//1016.Binary String With Substrings Representing 1 To N.
public class LeetCode1016 {
    public static void main(String[] args) {
        String s = "0110";
        int n = 4;

        for(int i=1; i<=n; i++){
            String binary = Integer.toBinaryString(i);
            if(!s.contains(binary)) {
                System.out.println(false);
                return;
            }
        }
        if(s.length() == 1){
            System.out.println(true);
            return;
        }
        System.out.println(true);
    }
}
