import java.util.*;
public class SubarraySplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max1Index=-1;
        int max2Index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
                max2Index=max1Index;
                max1Index=i;
               
            }
            else if(arr[i]>max2){
                max2=arr[i];
                max2Index=i;
            }
        }
        for(int i=0;i<max2Index+1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=max2Index+1;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(max1-max2);
        
    }
}
