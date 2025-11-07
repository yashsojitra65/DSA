package Arrays;
import java.util.*;
//Insert / update / search / print / delete in sorted array.
public class insert_update_in_sorted_arr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;

        insert(arr,i);
        update(arr,i);
        display(arr,i);
        System.out.println();
        find(arr,i);
        delete(arr,i);
        for (int j = 0; j < arr.length-1; j++) {
            System.out.print(arr[j]+" ");
        }
    }
    public static int insert(int[] arr,int j) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< arr.length; i++) {
            System.out.print("Enter The Element:");
            arr[j] = sc.nextInt();
            sort(arr,j);
        }
        j++;
        return j;
    }
    public static void sort(int[] arr,int n) {
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr.length-1; j++) {
                int temp=0;

                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void display(int[] arr,int j) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void update(int[] arr,int j) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to update:");
        int n = sc.nextInt();

        for (int i=0; i< arr.length; i++) {
            if (arr[i] == n) {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Enter new Element");
                arr[i] = sc1.nextInt();
                sort(arr,j);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static int delete(int[] arr,int j) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to delete:");
        int n = sc.nextInt();

        for (int i=0; i< arr.length; i++) {
            if (arr[i] == n) {
                j--;
                for(int k=i; k< arr.length-1; k++) {
                    arr[k] = arr[k+1];
                }
            }

        }
        return j;
    }
    public static void find(int[] arr,int j) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to Find:");

        int n = sc.nextInt();
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Element is present");
                return;
            }
        }
        System.out.println("Element not Present");
    }
}
