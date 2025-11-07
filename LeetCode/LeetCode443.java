package LeetCode;
//02-03-2023
//443. String Compression
public class LeetCode443 {
    public static void main(String[] args) {
        char[] c = {'a','a','b','b','c','c','c'};
        int n = c.length;
        if (n == 1) System.out.println(true);

        int i = 0, j = 0;
        while (i < n) {
            int count = 1;
            while (i < n - 1 && c[i] == c[i + 1]) {
                count++;
                i++;
            }

            c[j++] = c[i++];
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int k = 0; k < countStr.length(); k++) {
                    c[j++] = countStr.charAt(k);
                }
            }
        }
        for(int k=0; k<c.length; k++){
            System.out.print(c[k] + " ");
        }
    }
}
