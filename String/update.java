package String;

public class update {
    public static void main(String[] args){
        String s = "woeld";
        char[] c = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(c[i] == 'e'){
                c[i] = 'r';
            }
        }
        s = new String(c);
        System.out.println(s);
    }
}
