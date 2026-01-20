import java.util.Arrays;
import java.util.Scanner;

public class Insertion_sort {
    public static void insert_sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Array: ");
       int input = sc.nextInt();
       int[] arr = new int[input];
       for(int i=0;i<input;i++){
        System.out.print("Enter your Element for index "+i+": ");
        arr[i] = sc.nextInt();
       }
       System.out.println("Your current Array is: "+Arrays.toString(arr));
       insert_sort(arr);
       System.out.println("Your sorted array using insertion sort :"+Arrays.toString(arr));
       sc.close();
    }
}
