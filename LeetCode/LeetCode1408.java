package LeetCode;

import java.util.*;
//13-07-2023
//1408.String Matching in an Array.
public class LeetCode1408 {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        List<String> list = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i != j){
                    if(words[j].contains(words[i])){
                        list.add(words[i]);
                        break;
                    }
                }
            }
        }
        System.out.println(list);
    }
}
