// Printing 1 to N times of number Using Recursion

public class Print_1_to_N {
    public static void fn(int i , int n){
        if (i>n){
            return;
        } // if we use else statement here so don't need to write the return statement , it will be 
        // unnecessary for the if else statements 
        // also if we don't write the else statement so we need to add return in if statement
        // if we do not add it then recursion will be performed for infinite times

        System.out.print(i+" ");
        fn(i+1,n);
    }
    // if we want to print N to 1 aka reverse order then we have to do this 
    public static void f(int n){
        if (n<1){
            return;
        }
        System.out.print(n+" ");
        f(n-1);
    }
    // This method will Execute 1 to N times Using Back Track Function 
    public static void fi(int n){
        if(n<1){
            return;
        }
        fi(n-1);
        System.out.print(n+" ");
    }

    // this method will execut N to 1 times aka in reverse Order Using Back Track Function
    public static void fg(int i , int n){
        if (i>n){
            return;
        }
        fg(i+1, n);
        System.out.print(i+" ");

    }

    public static void main(String[] args) {
        fn(1,10);
        System.out.println(" ");
        f(10);
        System.out.println("");
        fi(10);
        System.out.println("");
        fg(1, 10);
    }
}
