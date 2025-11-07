package LeetCode;

//07-02-2023
//1662. Check If Two String Arrays are Equivalent
public class LeetCode1662 {
    public static void main(String[] args) {
        boolean b = Boolean.parseBoolean(" ");
        String[] s1 = {"ab","c"};
        String[] s2 = {"a", "bc"};
        String s3 = "";
        String s4 = "";

        for(int i=0; i<s1.length; i++){
            s3 = s3 + s1[i];
        }
        for(int i=0; i< s2.length; i++){
            s4 = s4 + s2[i];
        }
        if(s3.equals(s4)){
            b = Boolean.parseBoolean("True");
        }else {
            b = Boolean.parseBoolean("False");
        }

        System.out.println(b);
    }
}
