package String;

public class ReverseWords {
    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        char[] arr = s.toCharArray();
        int left=0, right=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ' '){
                right = i-1;
                reverseWord(arr, left, right);
                left = i+1;
            }
        }
        right = arr.length-1;
        reverseWord(arr, left, right);
        System.out.println(new String(arr));
    }
    public static void reverseWord(char[] cArray, int left, int right){
        while (left < right){
            char temp = cArray[left];
            cArray[left] = cArray[right];
            cArray[right] = temp;
            left++;
            right--;
        }
    }
}
