package LeetCode;
//12-08-2023
//796.Rotate String.
public class LeetCode796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        String ans = goal + goal;
        if(s.length() != goal.length()){
            System.out.println(false);
        }
        System.out.println(ans.contains(s));
    }
}
