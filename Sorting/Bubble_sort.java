import java.util.*;

public class Bubble_sort {
    public static void sort(int arr[],int n){
        for(int i =n-1;i>=1;i--){
            int swap=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=1;
                }
            }
            if(swap==0) break;
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
       System.out.println("Your sorted array using Bubble sort :"+Arrays.toString(arr));
       sc.close();
    }
}
