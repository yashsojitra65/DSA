package String;

public class Words_Palindrome {
    public static void main(String[] args) {
        String str = "msm sas";
        char arr[] = str.toCharArray();
        int n = arr.length;
        int l = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ' ') {
                r = i - 1;
                Pelindrome(arr, l, r);
                l = i + 1;
            }
        }
        r = arr.length - 1;
        Pelindrome(arr, l, r);
    }

    private static void Pelindrome(char[] arr, int l, int r) {
        while (l < r) {
            if (arr[l] != arr[r]) {
                System.out.println("Not a Palindrome");
                return;
            } else {
                l++;
                r--;
            }
        }
        System.out.println("Palindrome");
    }
}
