import java.util.*;

public class Hashmap_Char {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Map<Character,Integer> hash = new HashMap<>();

       System.out.print("Enter the Number of elemets in your Array: ");
       int input = sc.nextInt();
       sc.nextLine();
       for(int i=0;i<input;i++){
        System.out.print("Enter your Element for index "+i+": ");
        char num = sc.next().charAt(0);

        hash.put(num, hash.getOrDefault(num, 0)+1);
       }
       System.out.print("How many characters do you want to query? : ");
       int q = sc.nextInt();

       while(q-- >0){
        System.out.print("=> Enter your character to search: ");
        char n=sc.next().charAt(0);

        int count = hash.getOrDefault(n,0);
        System.out.println("> Your number "+n+" has frequency of "+count);
       }
       sc.close();
   } 
}
