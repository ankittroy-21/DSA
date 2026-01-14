import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int a){
        if (a<=1) return a;
        int last= fibo(a-1);
        int seclast = fibo(a-2);
        return last + seclast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number for Sum of Fibonacci Series :");
        int n = sc.nextInt();
        System.out.println("The Sum of the Number " +n+ " for fibonacci Series is "+fibo(n));
    }
}
