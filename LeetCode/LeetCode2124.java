package LeetCode;

//06-03-2023
//2124. Check if All A's Appears Before All B's
public class LeetCode2124 {
    public static void main(String[] args) {
        String s = "abab";
        char[] c = s.toCharArray();
        int count = 0;

        for(int i=0; i<c.length; i++){
            if(c[i] == 'a'){
                count++;
            }
        }
        for(int i=0; i<c.length; i++){
            if(c[i] == 'b'){
                if(i < count){
                    System.out.println(false);
                }
            }
        }
        System.out.println(true);
    }
}
