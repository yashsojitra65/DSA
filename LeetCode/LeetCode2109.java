package LeetCode;
//07-08-2023
//2109.Adding Spaces to a String.
public class LeetCode2109 {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] arr = {8,13,15};
        StringBuilder sb = new StringBuilder();
        int k = 0;

        for (int i=0; i<arr.length; i++){
            sb.append(s.substring(k,arr[i]));
            sb.append(" ");
            k = arr[i];
        }
        sb.append(s.substring(k));

        System.out.println(sb);
    }
}
