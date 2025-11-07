package LeetCode;

//06-03-2023
//2351. First Letter to Appear Twice.
public class LeetCode2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        //String s = "nwcn";

        for(int i=1; i<s.length(); i++){
            for(int j=0; j<i; j++){
                if(s.charAt(i) == s.charAt(j)){
                    System.out.println(s.charAt(i));
                    return;
                }
            }
        }
    }
}
