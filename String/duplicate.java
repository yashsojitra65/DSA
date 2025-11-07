package String;

public class duplicate {
    public static void main(String[] args){
//        String s = "naman is naman";
//        int n = s.length();
//        for(int i=0; i<n-1;i++){
//            for(int j=i+1; j<n; j++){
//                if((s.charAt(i) == s.charAt(j)) && (s.charAt(i) != ' ')){
//                    System.out.print(s.charAt(i) + " ");
//                    int k=i;
//                    while (k<n){
//                        if(s.charAt(k) == s.charAt(i)){
//                            s = s.replace(s.charAt(k),' ');
//                        }
//                        k++;
//                    }
//                }
//            }
//        }

        String str = "naman is a naman";
        int arr[] = new int[128];
        int n = str.length();

        for (int i=0; i<n; i++){
            int ascii = (int)str.charAt(i);
            if (arr[ascii]==0){
                arr[ascii] = arr[ascii] + 1;
            } else if (arr[ascii]==1) {
                arr[ascii] = arr[ascii] + 1;
                char c = str.charAt(i);
                System.out.print(c);
            }
        }
    }
}


