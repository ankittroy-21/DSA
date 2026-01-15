// printing N times of Name using the Recursion

public class Name_N_times{
    public static void fn(int i,int n){
        if (i>n){    
        }
        else{
            System.out.println("Ankit");
            fn(i+1, n);
        }
    }
    public static void main(String[] args) {
        fn(1,5);
    }
}
