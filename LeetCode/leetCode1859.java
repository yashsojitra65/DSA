package LeetCode;

//01-03-2023
//1859. Sorting the Sentence.
public class leetCode1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String s2[] =s.split(" ");
        String s3[]= new String[s2.length];

        for (int i=0; i<s2.length;i++){
            int  a = s2[i].length();
            char c = s2[i].charAt(a-1);
            int k = c- '0';
            s3[k-1]=s2[i].substring(0,a-1);
        }
        String s1="";
        for (String i:s3){
            s1+=i;
            s1 += " ";
        }
        System.out.println(s1.trim());
    }
}
