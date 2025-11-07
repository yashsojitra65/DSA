package LeetCode;
//03-11-2025
//3136. Valid Word..
public class LeetCode3136 {
    public static void main(String[] args) {
        String s = "IS";
        s.toLowerCase();

        int countVowel = 0;
        int countConsonant = 0;

        if(s.length() < 3){
            System.out.println(false);
            return;
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(s.charAt(i))){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    countVowel++;
                }else {
                    countConsonant++;
                }
            }else if(!Character.isDigit(c)){
                System.out.println(false);
                return;
            }
        }
        if(countVowel >= 1 && countConsonant >= 1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
