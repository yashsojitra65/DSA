package LeetCode;

//11-07-2023
//2023.Number of Pairs of Strings With Concatenation Equal to Target.
public class LeetCode2023 {
    public static void main(String[] args) {
        String[] s = {"777","7","77","77"};
        String target = "7777";
        int count = 0;

        for(int i=0; i<s.length; i++){
            for(int j=0; j<s.length; j++){
                if(i != j) {
                    String ans = s[i] + s[j];
                    if (ans.equals(target)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
