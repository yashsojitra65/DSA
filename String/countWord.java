package String;

public class countWord {
    public static void main(String[] args){
        String s = "How are you";
        int count = 1;

        if(s.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        s = s.trim();
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("Total count in string: "+count);
    }
}
