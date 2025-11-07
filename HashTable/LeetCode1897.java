package HashTable;
//12-01-2023
//1897.Redistribute Characters to Make All Strings Equal.
public class LeetCode1897 {
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        int[] freq = new int[26];

        for(String s : words){
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }
        }
        for(int i : freq){
            if(i % words.length != 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
