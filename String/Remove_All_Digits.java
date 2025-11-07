package String;
//29-07-2023
//remove All Digits.
public class Remove_All_Digits {
    public static void main(String[] args) {
        String s = "yash154";
        String ans = "";

        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
