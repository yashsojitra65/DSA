package LeetCode;

//12-06-2023
//125.Valid Palindrome.
public class LeetCode125 {
    public static void main(String[] args) {
        String s = ".fdfd.erer";

        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right){
            if(!Character.isLetter(s.charAt(left)) && !Character.isDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetter(s.charAt(right)) && !Character.isDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(s.charAt(left) != s.charAt(right)){
                System.out.print(false);
                return;
            }
            left++;
            right--;
        }
        System.out.print(true);
    }
}
