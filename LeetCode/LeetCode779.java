package LeetCode;
//25-10-2023
//779.K-th Symbol in Grammar.
public class LeetCode779 {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;

        int count = Integer.bitCount(k - 1);
        if(count % 2 == 0){
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
}
