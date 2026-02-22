public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int app = apples.size();
    int org = oranges.size();
    for (int i =0;i<app;i++){
        if(s<=apples.get(i)+a && apples.get(i)+a<=t){
            System.out.println("1");
        }
    }
    for (int i =0;i<org;i++){
        if(s<=oranges.get(i)+b && oranges.get(i)+b<=t){
            System.out.println("1");
        }
    }
