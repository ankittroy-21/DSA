import java.util.*;

public class Hashmap_Num {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Map<Integer,Integer> hash = new HashMap<>();

       System.out.print("Enter the Number of elemets in your Array: ");
       int input = sc.nextInt();
       for(int i=0;i<input;i++){
        System.out.print("Enter your Element for index "+i+": ");
        int num = sc.nextInt();

        hash.put(num, hash.getOrDefault(num, 0)+1);
       }
       System.out.print("How many numbers do you want to query? : ");
       int q = sc.nextInt();

       while(q-- >0){
        System.out.print("=> Enter your number to search: ");
        int n=sc.nextInt();

        int count = hash.getOrDefault(n,0);
        System.out.println("> Your number "+n+" has frequency of "+count);
       }
       sc.close();
   } 
}
