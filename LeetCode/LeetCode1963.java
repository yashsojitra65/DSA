package LeetCode;
//07-08-2023
//1963.Minimum Number of Swaps to Make the String Balanced.
public class LeetCode1963 {
    public static void main(String[] args) {
        String s = "]]][[[";
        int count = 0;

        for(char c : s.toCharArray()){
            if(count == 0){
                count++;
            }else {
                if(c == ']'){
                    count--;
                }else {
                    count++;
                }
            }
        }
        System.out.println((count+1)/2);
    }
}
