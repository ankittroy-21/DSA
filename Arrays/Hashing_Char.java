import java.util.*;

public class Hashing_Char {
    // Hashing concept for counting Character frequency
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Array size: ");
        int n = sc.nextInt();
        
        char[] arr = new char[n];
        System.out.println("Enter your Array's Elements (one by one):");
        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }

        // 256 covers all standard ASCII characters
        int[] hash = new int[256];
        for(int i = 0; i < n; i++){
            // Cast to int is implicit, but ensures we stay in bounds
            if (arr[i] < 256) {
                hash[arr[i]]++;
            }
        }

        System.out.print("How many characters do you want to search: ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.print("Enter the Character to count: ");
            char ank = sc.next().charAt(0);
            
            if (ank < 256) {
                System.out.println("The count of '" + ank + "' is " + hash[ank]);
            } else {
                System.out.println("Character '" + ank + "' is not in ASCII range.");
            }
        }
        sc.close();
    }
}