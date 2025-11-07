package LeetCode;

//24-04-2023
//1961. Check If String Is a Prefix of Array.
public class LeetCode1961 {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] word = {"i", "love","leetcode", "apples"};

        StringBuilder sb = new StringBuilder();
        for(String i : word){
            sb.append(word);
            if(s.equals(sb.toString())){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
