package LeetCode;

//02-03-2023
//1768. Merge Strings Alternately.
public class leetCode1768 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        String s = "";

        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();

        int n1 = c1.length;
        int n2 = c2.length;

        int i = 0;
        int j = 0;

        while (i < n1 && j < n2){
            s += c1[i];
            s += c2[j];
            i++;
            j++;
        }
        while (i < n1){
            s += c1[i];
            i++;
        }
        while (j < n2){
            s += c2[j];
            j++;
        }

        System.out.println(s);

//        int l1 = word1.length();
//        int l2 = word2.length();
//        char[] ans = new char[l1 + l2];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while(i < l1 && j < l2){
//            ans[k++] = word1.charAt(i++);
//            ans[k++] = word2.charAt(j++);
//        }
//
//        while(i < l1) ans[k++] = word1.charAt(i++);
//        while(j < l2) ans[k++] = word2.charAt(j++);
    }
}
