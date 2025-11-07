package LeetCode;

//07-03-2023
//1880. Check if Word Equals Summation of Two Words.
public class LeetCode1880 {
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";

        int ans = isAns(firstWord) + isAns(secondWord);
        int ans3 = isAns(targetWord);

        if(ans == ans3){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
    private static int isAns(String s){
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            ans = (s.charAt(i) - 'a') + ans * 10;
        }
        return ans;
    }
}
