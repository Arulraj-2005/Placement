import java.util.*;
public class FavSongs {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int count=0;
    int maxCount=Integer.MIN_VALUE;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A'){
            count++;
            maxCount=Math.max(maxCount,count);
        }
        else{
            count=0;
        }
    }
    System.out.println(maxCount);
}
}
