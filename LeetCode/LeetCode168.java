package LeetCode;
//22-08-2023
//168.Excel Sheet Column Title.
public class LeetCode168 {
    public static void main(String[] args) {
        int columnNumber = 701;
        String s = "";
        int i = columnNumber ;

        while(i >= 1) {
            i--;
            s = (char)(i % 26 + 65) + s;
            i = i / 26;
        }
        System.out.println(s);
    }
}
