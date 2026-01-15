public class Palindrome_String {
    public static  boolean f ( int i , String s){
        if ( i >= s.length()/2) return true;
        int j = s.length();
        if ( s.charAt(i) != s.charAt(j -i -1)) return  false;
        return f(i+1,s);
    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.print(f(0,s));
    }
}
