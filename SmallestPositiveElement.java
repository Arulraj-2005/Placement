import java.util.*;
public class SmallestPositiveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        if(smallest==Integer.MAX_VALUE){
            System.out.println(1);
            return;
        }
        for(int i=smallest+1;i<=max;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(i);
                return;
            }
        }
}
}
