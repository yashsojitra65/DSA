package LeetCode;

public class leetCode2186 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int n = words.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        System.out.println(count);
    }
}
