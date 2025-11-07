package LeetCode;
//02-10-2023
//1455.Check If a Word Occurs As a Prefix of Any Word in a Sentence.
public class LeetCode1455 {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String[] arr = sentence.split(" ");
        String searchWord = "burg";

        for(int i=0; i<arr.length; i++){
            if(arr[i].startsWith(searchWord)){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
}
