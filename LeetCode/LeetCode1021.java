package LeetCode;

public class LeetCode1021 {
    public static void main(String[] args) {
        String s = "(()())(())";
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(count > 0){
                    sb.append(s.charAt(i));
                }
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
                if(count > 0){
                    sb.append(s.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
