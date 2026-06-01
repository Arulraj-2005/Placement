import java.util.ArrayList;
import java.util.Scanner;

public class SubArraySplitEqualSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ArrayList<Integer> subArr=new ArrayList<>();
                int leftSum=0;
                int rightSum=0;
                for(int k1=i;k1<=j;k1++){
                    subArr.add(arr[k1]);
                }
                for(int a=0;a<subArr.size();a++){
                    leftSum+=subArr.get(a);
                }
                for(int b=j+1;b<n;b++){
                    rightSum+=arr[b];
                }
                if(Math.abs(leftSum-rightSum)<min){
                    min=Math.abs(leftSum-rightSum);
                }
            }
        }
        System.out.println(min);
    }
}
