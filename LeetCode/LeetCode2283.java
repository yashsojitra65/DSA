package LeetCode;
//12-08-2023
//2283.Check if Number Has Equal Digit Count and Digit Value.
public class LeetCode2283 {
    public static void main(String[] args) {
        String s = "1210";
        int[] arr = new int[10];

        for (char c : s.toCharArray()) {
            int k = c - '0';
            arr[k]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i) - '0';
            if (k != arr[i]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
