package LeetCode;

//20-02-2023
//2108. Find First Palindromic String in the Array.
public class LeetCode2108 {
    public static void main(String[] args) {
        String words[] = {"abc", "car", "ada", "racecar", "cool"};
        String s = "";

        for(int i=0; i< words.length;i++){
            if(Palindromic(words[i])){
                System.out.println(words[i]);
                break;
            }
            System.out.println("not Palindrome");
        }
    }
    private static boolean Palindromic(String word){
        int left = 0;
        int right = word.length()-1;

        while (left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}