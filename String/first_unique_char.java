package String;

//23-12-2025
//First unique character in String.
public class first_unique_char {
    public static void main(String[] args) {
        String s = "cbad";
        int[] arr = new int[128];

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            arr[ascii] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println(-1);
    }
}
