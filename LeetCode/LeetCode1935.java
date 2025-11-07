package LeetCode;

//08-03-2023
//1935. Maximum Number of Words You Can Type.
public class LeetCode1935 {
    public static void main(String[] args) {
        String s = "abc de";
        String brokenLetters = "abc";

        String[] s1 = s.split(" ");
        String[] s2 = brokenLetters.split("");
        int count = 0;

        if(brokenLetters.isEmpty()){
            count = s1.length;
        }

        for(String s3 : s1) {
            for (int i = 0; i < s2.length; i++) {
                if (s3.contains(s2[i])) {
                    count--;
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
