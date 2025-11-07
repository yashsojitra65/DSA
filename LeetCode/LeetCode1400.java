package LeetCode;
//25-08-2023
//1400.Construct K Palindrome Strings.
public class LeetCode1400 {
    public static void main(String[] args) {
        String s = "annabelle";
        int k = 2;

        if(s.length() < k){
            System.out.println(false);
            return;
        }
        int[] arr = new int [26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i : arr){
            if(i % 2 != 0) {
                count++;
            }
        }
        if(count > k){
            System.out.println(false);
        }
        System.out.println(true);
    }
}
