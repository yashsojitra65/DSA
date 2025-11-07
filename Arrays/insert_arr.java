package Arrays;
//17.Insert / update / search / print / delete.
public class insert_arr{
    public static void main(String[] args) {
        int[] arr=new int[5];
        int i = 0;

        i = insert(arr,10,i);
        i = insert(arr,20,i);
        i = insert(arr,30,i);
        i = insert(arr,40,i);
        i = insert(arr,50,i);
        // l=insert(arr,50,l);

        update(arr,10,50,i);
        search(arr,30,i);

        for (int k=0; k< arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        delete(arr,20,i);
        for (int k=0; k< arr.length-1; k++) {
            System.out.print(arr[k] + " ");
        }

    }
    public static int insert(int[] arr,int j,int i){
        if(i == arr.length) {
            System.out.println("Array is Full!!");
            return 0;
        }
        arr[i] = j;
        i++;
        return i;
    }
    public static void update(int[] arr,int n1,int n2,int j) {
        for (int i=0; i<j; i++) {
            if (arr[i] == n1) {
                arr[i] = n2;
            }
        }
    }
    public static void search(int[] arr,int n1,int j) {
        for (int i=0; i<j; i++) {
            if (arr[i] == n1) {
                System.out.println(n1+" Is present");
                return;
            }
        }
        System.out.println(n1 + " Is not present");
    }
    public static int delete(int[] arr,int n1,int n) {
        for (int i=0; i<n; i++) {
            if (arr[i] == n1) {
                n--;
                for(int j=i; j<n; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }
        return n;
    }
}
