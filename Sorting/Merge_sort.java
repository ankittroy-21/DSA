import java.util.Arrays;
import java.util.Scanner;

public class Merge_sort {
    public static void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high + 1];
        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void mergesort(int arr[], int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Array: ");
        int input = sc.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < input; i++) {
            System.out.print("Enter your Element for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Your current Array is: " + Arrays.toString(arr));
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        System.out.print("Your Sorted Array is: "+Arrays.toString(arr));
    }
}
