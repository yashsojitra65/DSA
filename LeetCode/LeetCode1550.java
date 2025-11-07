package LeetCode;
//19-08-2023
//1550.Three Consecutive Odds.
public class LeetCode1550 {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        int count = 0;

        for (int i : arr) {
            if (i % 2 == 1) {
                count++;
                if (count == 3) {
                    System.out.println(true);
                    return;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(false);
    }
}
