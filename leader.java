import java.util.Scanner;
public class leader {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int a=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    a=0;
                    break;
                }
            }
            if(a==1){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
