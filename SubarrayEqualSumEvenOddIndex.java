
import java.util.*;

public class SubarrayEqualSumEvenOddIndex {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ArrayList<Integer> subArr=new ArrayList<>();
                int EvenSum=0;
                int oddSum=0;
                for(int k1=i;k1<=j;k1++){
                    subArr.add(arr[k1]);
                }
                for(int a=0;a<subArr.size();a++){
                    if(a%2==0){
                        EvenSum+=subArr.get(a);
                    }
                    else{
                        oddSum+=subArr.get(a);
                    }
                }
                if(EvenSum==oddSum){
                    count++;
                }
            }
        }
        System.out.println(count);
   }
}
