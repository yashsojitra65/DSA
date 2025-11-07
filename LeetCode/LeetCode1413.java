package LeetCode;

public class LeetCode1413 {
    public static void main(String[] args) {
        int[] arr = {-3,2,-3,4,2};
        int count = 1;

        while (true) {
            int n = count;
            boolean flag = true;

            for (int num : arr) {
                n += num;
                if (n < 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(count);
                return;
            } else {
                count += 1;
            }
        }
    }
}
