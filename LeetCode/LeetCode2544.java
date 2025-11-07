package LeetCode;

public class LeetCode2544 {
    public static void main(String[] args) {
        int n = 521;
        int ans = 0;
        int position = 0;

        while(n != 0){
            position = n % 10;
            ans = -ans + position;
            n /= 10;
        }

//        while (n > 0){
//            int digit = n % 10;
//            if(position % 2 == 0){
//                ans += digit;
//            }else {
//                ans -= digit;
//            }
//            n /= 10;
//            position++;
//        }
        System.out.println(ans);
    }
}
