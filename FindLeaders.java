import java.util.*;

public class FindLeaders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int leader=0;
        for(int i=0;i<n;i++){
            leader=arr[i];
            boolean isLeader=true;
            for(int j=i+1;j<n;j++){
                if(leader<arr[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                System.out.println(leader);
            }
            
        }
        
    }
}
