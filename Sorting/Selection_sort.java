package Sorting;
import java.util.*;

public class Selection_sort{
    public static void sort(int arr[],int n){
        for(int i =0;i<n-1;i++){
            int mini=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]) mini=j;
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
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
       sort(arr, input);
       System.out.println("Your sorted array using Selection sort :"+Arrays.toString(arr));
       sc.close();
    }
}