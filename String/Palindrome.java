package String;

public class Palindrome {
    public static void main(String[] args){
        String s = "niitin  ";
        s=s.trim();
        int left = 0;
        int right = s.length()-1;

        if(s.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("String is not palindrome");
                return;
            }else {
                left++;
                right--;
            }
        }
        System.out.println("String is palindrome");
    }
}
