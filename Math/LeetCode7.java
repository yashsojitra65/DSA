package Math;

//07-06-2023
//7.Reverse Integer.
public class LeetCode7{
    public static void main(String[] args) {
        int x = 1534236469;
        long rev = 0;

        while (x != 0) {
            int last = x % 10;
            rev = rev * 10 + last;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            System.out.println(0);
            return;
        }
        System.out.println((int)rev);

//        while (x != 0){
//            int last = x % 10;
//            if(last == 0 && rev <= 0){
//                x = x / 10;
//            }
//            if(last != 0 || rev > 0) {
//                rev = (rev * 10) + last;
//                x = x / 10;
//            }
//        }
//        System.out.println(rev);
    }
}
