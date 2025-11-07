package LeetCode;

//28-02-2023
//1221. Split a String in Balanced Strings.
public class LeetCode1221 {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        int count = 0;
        int word = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'R'){
                word++;
            }else{
                word--;
            }
            if(word == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
