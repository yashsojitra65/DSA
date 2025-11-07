package HashTable;

import java.util.*;
//14-05-2023
//500. Keyboard Row.
public class LeetCode500 {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String s1 = "QWERTYUIOPqwertyuiop";
        String s2 = "ASDFGHJKLasdfghjkl";
        String s3 = "ZXCVBNMzxcvbnm";
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();

        for(int i=0; i<s1.length(); i++){
            set1.add(s1.charAt(i));
        }
        for(int i=0; i<s2.length(); i++){
            set2.add(s2.charAt(i));
        }
        for(int i=0; i<s3.length(); i++){
            set3.add(s3.charAt(i));
        }
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i< words.length; i++){
            String j = words[i];
            int temp1 = 0,temp2 = 0,temp3 = 0;
            for(int k=0; k<j.length(); k++){
                if(set1.contains(j.charAt(k))){
                    temp1++;
                }else if (set2.contains(j.charAt(k))){
                    temp2++;
                }else if(set3.contains(j.charAt(k))){
                    temp3++;
                }
            }
            if(temp1 == j.length() || temp2 == j.length() || temp3 == j.length()){
                list.add(j);
            }
        }
        String ans[] = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }

        for(String i : ans){
            System.out.print(i + " ");
        }
    }
}
