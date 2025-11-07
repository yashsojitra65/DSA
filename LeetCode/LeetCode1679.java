package LeetCode;

//21-02-2023
//1678. Goal Parser Interpretation
public class LeetCode1679 {
    public static void main(String[] args) {
        String s = "G()(al)";
        String s1 = "";

        s1 = s.replace("()","o").replace("(al)","al");
        System.out.println(s1);
    }
}
