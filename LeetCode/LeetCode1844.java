package LeetCode;

//15-07-2023
//1844.Replace All Digits with Characters.
public class LeetCode1844{
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        String ans = "";

        for(int i=0; i<s.length(); i++){

            if(i % 2 != 0){
                ans += (char)(s.charAt(i-1) + (s.charAt(i)-48));
            }else{
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
