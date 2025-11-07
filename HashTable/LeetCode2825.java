package HashTable;
//10-10-2023
//2825.Make String a Subsequence Using Cyclic Increments.
public class LeetCode2825 {
    public static void main(String[] args) {
        String str1 = "zc";
        String str2 = "ad";
        int i = 0, j = 0;

        while(i < str1.length() && j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j) || (((str1.charAt(i) - 'a' + 1) % 26) + 'a') == str2.charAt(j)){
                j++;
            }
            i++;
        }
        System.out.println(j == str2.length());

//        Set<Character> set = new HashSet<>();
//
//        for (char c : str1.toCharArray()) {
//            set.add(c);
//            char val = (char) ((c - 'a' + 1) % 26 + 'a');
//            set.add(val);
//        }
//
//        for (char c : str2.toCharArray()) {
//            if (!set.contains(c)) {
//                System.out.println(false);
//                return;
//            }
//        }
//
//        System.out.println(true);
    }
}
