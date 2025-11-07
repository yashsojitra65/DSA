package LeetCode;

//28-04-2023
//58. Length of Last Word.
public class LeetCode58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        s = s.trim();
        int count = 0;

        for(int i=s.length()-1; i>=0 ;i--){
            if(s.charAt(i) != ' '){
                count++;
            }else {
                break;
            }
        }
        System.out.print(count);
    }
}
