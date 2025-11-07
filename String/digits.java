package String;

//Replace All Digits with Characters
public class digits {
    public static void main(String[] args){
        String s = "Yash 564 sojitra";
        String s1 = "";
        char[] c = s.toCharArray();

        for(int i=0; i<s.length(); i++) {
            if (c[i] =='1' || c[i] =='2'|| c[i] =='3' || c[i] =='4' || c[i]=='5'|| c[i] == '6'|| c[i]=='7' || c[i]=='8' || c[i]=='9' || c[i]=='0'){
                continue;
            }else {
                System.out.print(c[i]);
            }
        }
    }
}
