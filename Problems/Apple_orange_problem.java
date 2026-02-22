public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int app = 0;
    int org = 0;
    for(int d:apples){
        if(s<=a+d && a+d<=t) app++;
    }
    for(int d:oranges){
        if(s<=b+d && b+d<=t) org++;
    }
    
    System.out.println(app);
    System.out.println(org);

}
