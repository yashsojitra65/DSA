package LeetCode;
//25-09-2023
//2864.Maximum Odd Binary Number.
public class LeetCode2864 {
    public static void main(String[] args) {
        String s = "0101";
        int one = 0, zero = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
            } else {
                zero++;
            }
        }
        for (int i=0; i<one-1; i++) {
            sb.append('1');
        }
        for (int i=0; i<zero; i++) {
            sb.append('0');
        }
        if (one > 0) {
            sb.append('1');
        }
        System.out.println(sb);
    }
}
