package Recusion;

//08-05-2023
//Remove duplicate in a string.
public class duplicate {
    public static void main(String[] args) {
        String s = "yaanssj";

        Remove(s,0,new StringBuffer(""),new boolean[26]);
    }
    public static void Remove(String s, int i, StringBuffer sb, boolean[] map){
        if(i == s.length()){
            System.out.print(sb);
            return;
        }
        char n = s.charAt(i);
        if(map[n - 'a'] == true){
            Remove(s,i + 1,sb,map);
        }else {
            map[n - 'a'] = true;
            Remove(s,i + 1, sb.append(n),map);
        }
    }
}
