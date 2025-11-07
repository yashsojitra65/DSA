package LeetCode;
//17-08-2023
//1446.Consecutive Characters.
public class LeetCode1446 {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        int max = 0;
        int count = 0;

        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
                max = Math.max(count, max);
            }
            else{
                count = 1;
            }
        }
        System.out.println(max);
    }
}
