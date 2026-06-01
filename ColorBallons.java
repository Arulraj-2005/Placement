import java.util.*;
public class ColorBallons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        int[] count=new int[26];
        for(int i=0;i<n;i++){
            count[arr[i]-'A']++;
        }
        for(int i=0;i<26;i++){
            if(count[i]%2!=0){
                System.out.println((char)(i+'A'));
                return;
            }
        }
        System.out.println("All are even");
    }
}
