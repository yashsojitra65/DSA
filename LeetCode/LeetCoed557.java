package LeetCode;

//1-03-2023
//557. Reverse Words in a String III
public class LeetCoed557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        char[] c = s.toCharArray();
        int left = 0;
        int right = 0;

        for(int i=0; i<c.length; i++){
            if(c[i] == ' '){
                right = i - 1;
                reversWord(c,left,right);
                left = i + 1;
            }
        }
        right = c.length - 1;
        reversWord(c,left,right);
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
