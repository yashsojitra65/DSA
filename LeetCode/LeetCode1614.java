package LeetCode;

//28-02-2023
//1614. Maximum Nesting Depth of the Parentheses.
public class LeetCode1614 {
    public static void main(String[] args) {
        String s1 = "(())";
        int count = 0;
        int sam = 0;

        char c[] = s1.toCharArray();
        for(int i=0; i< c.length; i++){
            if(c[i] == '('){
                count++;
                sam=Math.max(sam,count);
            } else if (c[i] == ')') {
                count--;
            }
        }
        System.out.println(sam);

    }
}
