package HashTable;
//21-09-2023
//1160.Find Words That Can Be Formed by Characters.
public class LeetCode1160 {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        if(words.length == 0) {
            System.out.println(0);
            return;
        }
        int count = 0;
        int[] ans = new int[26];

        for(char c : chars.toCharArray()) {
            ans[c - 'a']++;
        }

        for(String word : words) {
            int[] arr = ans.clone();
            boolean flag = true;
            for (char c : word.toCharArray()){
                arr[c - 'a']--;
                if (arr[c - 'a'] < 0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count += word.length();
            }
        }
        System.out.println(count);
    }
}
