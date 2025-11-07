package String;

//Merge Strings Alternately
public class margeString {
    public static void main(String[] args){
        String s = "hello";
        String s1 = "world";
        String s2 = "";

        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();
        int n = s.length();
        int n1 = s1.length();

        char i=0;
        char j=0;

        while (i<n && j<n1){
            s2 += c[i];
            s2 += c1[j];
            i++;
            j++;
        }
        System.out.print(s2);
    }
}
