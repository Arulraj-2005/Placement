import java.util.*;
public class CountSubArrPerfectSqr {
    public static boolean isPerfectSquare(int num){
        int sqrt=(int)Math.sqrt(num);
        return sqrt*sqrt==num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ArrayList<Integer> subArr=new ArrayList<>();
                int countPrefectSqr=0;
                for(int k1=i;k1<=j;k1++){
                    subArr.add(arr[k1]);
                }
                for(int num:subArr){
                if(isPerfectSquare(num)){
                    countPrefectSqr++;
                }
                }
                if(countPrefectSqr==k){
                count++;
            }
            }
        } 
        System.out.println(count);
    }
}
