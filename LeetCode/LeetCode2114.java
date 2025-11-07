package LeetCode;

//03-02-2023
//2114. Maximum Number of Words Found in Sentences
public class LeetCode2114 {
    public static void main(String[] args) {
        String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int n = s.length;
        int count = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            String[] words = s[i].split(" ");
            count = words.length;

            if(count > max){
                max = count;
            }
        }
        System.out.println(max);
    }
}
