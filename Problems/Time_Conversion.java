public static String timeConversion(String s) {
    // Write your code here
    String AMPM = s.substring(s.length()-2);
    String houStr = s.substring(0,2);
    String restTime = s.substring(2,s.length()-2);
    
    int hour = Integer.parseInt(houStr);
    
    if (AMPM.equals("PM") && hour!=12){
        hour +=12;
    }
    else if (AMPM.equals("AM") && hour==12){
        hour = 0;
    }
    
    String newhr = String.format("%02d", hour);
    return newhr+restTime;
        
    }
