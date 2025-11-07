package LeetCode;
//05-12-2023
//2264.Largest 3-Same-Digit Number in String.
public class LeetCode2264 {
    public static void main(String[] args) {
        String s = "6777133339";
        StringBuilder sb = new StringBuilder();
        char num = 0;

        for(int i=1; i<s.length()-1; i++){
            if(s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == s.charAt(i + 1)){
                num = (char) Math.max(num,s.charAt(i));
            }
        }
        if(num == 0){
            sb.append("");
        }else {
            sb.append(num);
            sb.append(num);
            sb.append(num);
        }
        System.out.println(sb);
    }
}
