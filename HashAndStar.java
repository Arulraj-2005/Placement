import java.util.*;
public class HashAndStar {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int Star=0;
    int hash=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#'){
            hash++;
        } 
        else if(s.charAt(i)=='*'){
            Star++;
        }
    }
    System.out.println(Star-hash);
}
}
