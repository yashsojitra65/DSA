package Math;

//24-02-2023
//2169. Count Operations to Obtain Zero.
public class LeetCode2169 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int ans = 0;

        while (num1 != 0 && num2 != 0){
            if(num1 >= num2){
                num1 = num1 - num2;
            }else {
                num2 = num2 -num1;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
