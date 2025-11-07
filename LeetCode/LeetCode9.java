package LeetCode;

//27-04-2023
//9. Palindrome Number.
public class LeetCode9 {
    public static void main(String[] args) {
        int x = 121;
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Number is Not palindrome.");
                return;
            }else {
                i++;
                j--;
            }
        }
        System.out.println("Number is palindrome.");
    }
}
