import java.util.*;
public class CountSunday {
    public static void main(String[] args) {
       String startDay="Monday";
       HashMap<String,Integer> dayMap=new HashMap<>();
       dayMap.put("Monday",0);
       dayMap.put("Tuesday",1);
       dayMap.put("Wednesday",2);
       dayMap.put("Thursday",3);
        dayMap.put("Friday",4);
        dayMap.put("Saturday",5);
        dayMap.put("Sunday",6);
       int totaldays=13;
         String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            int count=0;
            for(int i=dayMap.get("Monday");i<=totaldays;i++){
                if(days[i%7].equals("Sunday")){
                    count++;
                }
            }
            System.out.println(count);
    }
}
