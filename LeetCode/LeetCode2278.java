package LeetCode;

//06-03-2023
//2278. Percentage of Letter in String
public class LeetCode2278 {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        int n = s.length();
        int count = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }

        int ans = (count * 100) / n;
        System.out.println(ans);
    }
}
//for(int i=0; i<c.length-1; i++){
//           if(c[i] == c[i+1]){
//                 c1 = c[i];
//                break;
//            }
//        }
//        System.out.println(c1);

//    HashSet<Character> set = new HashSet<>();
//        for (char ch : s.toCharArray()) if (!set.add(ch)) return ch;
//                return '.';
