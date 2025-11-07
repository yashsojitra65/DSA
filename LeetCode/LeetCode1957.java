package LeetCode;
//05-12-2023
//1957.Delete Characters to Make Fancy String.
public class LeetCode1957 {
    public static void main(String[] args) {
        String s = "leeetcode";
        s += "  ";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length() - 2; i++){
            if(s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)){
                continue;
            }
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}

