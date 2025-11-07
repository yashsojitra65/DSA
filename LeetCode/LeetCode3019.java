package LeetCode;
//3019.Number of Changing Keys
//28-01-2024
public class LeetCode3019 {
    public static void main(String[] args) {
        String s = "aAbBcC";
        int count = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
