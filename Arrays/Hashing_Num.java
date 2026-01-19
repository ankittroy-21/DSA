import java.util.*;
// Hashing concept for counting numbers frequency
public class Hashing_Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your Highest number : ");
        int high = sc.nextInt();
        System.out.println("Enter your Array's Element : ");
        for(int i=0 ;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Your Array is : "+Arrays.toString(arr));

        // hash array created for counting - size is high+1 because indexing is started from 0 and could go to the high+1
        int[] hash = new int[high+1];
        // Now the number present in the array will be counted and stored in the Hash array
        for(int i =0;i<n;i++){
            hash[arr[i]] +=1;
        }

        System.out.print("How many numbers do you want to count or search: ");
        int q= sc.nextInt();
        while(q-- >0){
            System.out.print("Enter the Number to count: ");
            int ank = sc.nextInt();
            if(ank <hash.length){
                System.out.println("The count of number "+ank+" is "+hash[ank]);
            }
            else{
                System.out.println("The count of number "+ank+" is 0");
            }
        }
        sc.close();

    }
}
