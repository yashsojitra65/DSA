package LeetCode;
//05-12-2023
//1869.Longer Contiguous Segments of Ones than Zeros.
public class LeetCode1869 {
    public static void main(String[] args) {
        String s = "111000";
        int oneCount = 0;
        int zeroCount = 0;
        int count = 1;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++;
            }else {
                if(s.charAt(i) == '1'){
                    oneCount = Math.max(oneCount,count);
                }else {
                    zeroCount = Math.max(zeroCount,count);
                }
                count = 1;
            }
        }
        if(s.charAt(s.length() - 1) == '1'){
            oneCount = Math.max(oneCount,count);
        }else {
            zeroCount = Math.max(zeroCount,count);
        }
        System.out.println(oneCount > zeroCount);
    }
}