package LeetCode;
//22-08-2023
//171.Excel Sheet Column Number.
public class LeetCode171 {
    public static void main(String[] args) {
        String columnTitle = "A";
        int columnNumber = 0;

        for (int j = 0; j < columnTitle.length(); j++) {
            columnNumber = columnNumber * 26 + (columnTitle.charAt(j) - 'A' + 1);
        }

        System.out.println(columnNumber);
    }
}
