import java.util.*;

public class LinearSearch{
    
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     sc.close();
     int r=lsearch(arr,n,k);
     System.out.println(r);
     
    }
    public static int lsearch(int arr[],int n,int k){
       for(int i=0;i<n;i++){
        if(k==arr[i]){
            return i;
        }
        
       }
       return -1;
    }
}
