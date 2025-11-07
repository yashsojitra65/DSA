package LeetCode;

//01-03-2023
//1832. Check if the Sentence Is Pangram.
public class LeetCode1832 {
    public static void main(String[] args) {
        //String s = "thequickbrownfoxjumpsoverthelazydog";
        String s = "leetcode";
        char c[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] c1 = new int[26];

        for(int i=0; i< s.length(); i++){
            for(int j=0; j< c.length; j++){
                if(s.charAt(i) == c[j]){
                    c1[j] += 1;
                }
            }
        }
        for(int i=0; i< c1.length; i++){
            if(c1[i] == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
