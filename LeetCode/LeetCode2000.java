package LeetCode;

//02-03-2023
//2000. Reverse Prefix of Word.
public class LeetCode2000 {
    public static void main(String[] args) {
        String s = "abcdefd";
        char[] c = s.toCharArray();
        int ch = 'd';
        int left = 0;
        int right = 0;

        for(int i=0; i<c.length; i++){
            if(c[i] == ch){
                right = i;
                reversWord(c,left,right);
                break;
            }
        }
        System.out.println(new String(c));
    }
    private static void reversWord(char[] c, int left, int right) {
        while (left < right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
    }
}
