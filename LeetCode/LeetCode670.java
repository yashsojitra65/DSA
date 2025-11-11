package LeetCode;

//11-11-2025
//670. Maximum Swap.
public class LeetCode670 {
    public static void main(String[] args) {
        int n = 98368;

        String s = String.valueOf(n);
        int max = n;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                char[] arr = s.toCharArray();

                char temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                int number = Integer.parseInt(new String(arr));

                max = Math.max(max, number);
            }
        }

        System.out.println(max);
    }
}
