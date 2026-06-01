import java.util.*;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        String ans="";
        for(int i=0;i<arr.length;i++){
            int r=arr[i].length()-1;
            while(r>=0){
                ans+=arr[i].charAt(r);
                r--;
            }
            ans+=" ";
        }
        System.out.println(ans);
    }
}
