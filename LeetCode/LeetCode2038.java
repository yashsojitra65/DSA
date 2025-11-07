package LeetCode;
//02-010-2023
//2038.Remove Colored Pieces if Both Neighbors are the Same Color.
public class LeetCode2038 {
    public static void main(String[] args) {
        String s = "AAABABB";
        int B = 0;
        int A = 0;

        for(int j=1; j<s.length()-1; j++) {
            int i = j - 1;
            int k = j + 1;

            if(s.charAt(i)=='A' && s.charAt(j)=='A' && s.charAt(k)=='A' ) {
                A++;
            } else if(s.charAt(i)=='B' && s.charAt(j)=='B' && s.charAt(k)=='B') {
                B++;
            }
        }
        System.out.println(A > B);
    }
}
