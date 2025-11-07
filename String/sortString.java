package String;

public class sortString {
    public static void main(String[] args){
        String s = "yash";
        char[] c = s.toCharArray();

        for(int i=0; i<c.length; i++){
            for(int j=i+1; j<c.length-1; j++){
                if(c[i] > c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        String s1 = new String(c);
        System.out.println(s1);
    }
}
