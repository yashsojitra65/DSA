package LeetCode;
//14-11-2025
//2443. Sum of Number and Its Reverse
public class LeetCode2443 {
    public static void main(String[] args) {
        int n = 181;

        if (n == 0) {
            System.out.println(true);
            return;
        }
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            sb.reverse();

            int number = Integer.parseInt(sb.toString());
            if (i + number == n) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
