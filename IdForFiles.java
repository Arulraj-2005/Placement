import java.util.Scanner;
public class IdForFiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int id=arr[i];
            int sum=0;
            while(id>0){
                sum+=id%10;
                id/=10;
            }
            System.out.print(sum+" ");
        }
    }
}
