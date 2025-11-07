package LeetCode;

//06-06-2023
//520. Detect Capital.
public class LeetCode520{
    public static void main(String[] args) {
        String s = "USA";
        int upper = 0;
        int lower = 0;

        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                lower++;
            }
            if(Character.isUpperCase(s.charAt(i))){
                upper++;
            }
        }
        if(upper == 1 && Character.isUpperCase(s.charAt(0))){
            System.out.println(true);
            return;
        }
        if((upper == s.length() && lower == 0) || (lower == s.length() && upper == 0)){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
