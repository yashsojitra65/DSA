package LeetCode;

//08-03-2023
//2255. Count Prefixes of a Given String
public class LeetCode2255 {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int count = 0;

        for(String s1 : words){
            if(s.startsWith(s1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
